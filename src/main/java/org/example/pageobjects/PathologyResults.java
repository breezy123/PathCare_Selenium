package org.example.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;

public class PathologyResults {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='mat-mdc-form-field-infix ng-tns-c27-3']")
    private WebElement filterResults_textField;
    @FindBy(xpath = "//input[@placeHolder='Search for doctor, collection date, or tests ordered.']")
    private WebElement filterResults_textField2;
    @FindBy(xpath = "//tbody[@class='mdc-data-table__content']//tr//td")
    private List<WebElement> tableRows;
    @FindBy(xpath = "//iframe[@title='ng2-pdfjs-viewer']")
    private WebElement iFrameForDownload;
    @FindBy(xpath = "//td[normalize-space()='650690897']")
    private WebElement episodeNumber1;
    @FindBy(xpath = "//td[normalize-space()='650690906']")
    private WebElement episodeNumber2;
    @FindBy(xpath = "//td[normalize-space()='650690911']")
    private WebElement episodeNumber3;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/span[1]/button[1]/span[5]")
    private WebElement loadReportButton;
    @FindBy(xpath = "//body/app-root[1]/main[1]/section[1]/div[1]/app-results[1]/main[1]/section[1]/ng2-pdfjs-viewer[1]/iframe[1]")
    private WebElement finalReport;
    @FindBy(xpath = "//body/app-root[1]/main[1]/section[1]/div[1]/app-results[1]/main[1]/section[1]/ng2-pdfjs-viewer[1]/iframe[1]")
    private WebElement downloadDocument;
    @FindBy(xpath = "//button[@id='download']")
    private WebElement downloadIcon;
    @FindBy(xpath = "//body[1]/app-root[1]/main[1]/section[1]/div[1]/app-results[1]/main[1]/section[1]/app-results-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/div[1]/span[5]/mat-card[1]")
    private WebElement departmentReport;
    @FindBy(xpath = "//section//header//button[1]//span[2]")
    private WebElement cumulativeOption;
    @FindBy(xpath = "//input[@id='mat-input-0']")
    private WebElement filterTextfieldUrine;
    public PathologyResults(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void enterDataToFilter(String data)throws Exception{
        filterResults_textField.isDisplayed();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",filterResults_textField);
        filterResults_textField2.sendKeys(data);
        Thread.sleep(5000);
        filterResults_textField2.sendKeys(Keys.ENTER);
//        Thread.sleep(10000);

    }
    public void tableResultsValidation()throws Exception{
        //Initialize a new array list to store the text
        List<String> tableData = new ArrayList<String>();

        //For each row, get the column data and store into the tableData object
        System.out.println("Table Data below:\n");
        for(int i=0; i < tableRows.size(); i++) {
            tableData.add(tableRows.get(i).getText());
            System.out.println(tableData.get(i).toString()+"\t");
        }
    }

    public void clickLoadReportButton() throws Exception{
        loadReportButton.isDisplayed();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",loadReportButton);
        Thread.sleep(8000);
        switchToiFrameAndDownload();
    }

    public void downloadDepartmentReports() throws Exception{
        Thread.sleep(3000);
        episodeNumber1.isDisplayed();
        episodeNumber1.click();
        departmentReport.isDisplayed();
        departmentReport.click();
        Thread.sleep(8000);
        switchToiFrameAndDownload();
    }

    public void downloadCumulative() throws Exception{
        cumulativeOption.isDisplayed();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        Thread.sleep(7000);
        executor.executeScript("arguments[0].click();",cumulativeOption);
        Thread.sleep(8000);
        switchToiFrameAndDownload();
    }
    public void switchToiFrameAndDownload() throws Exception{
        driver.switchTo().frame(iFrameForDownload);
        downloadIcon.isDisplayed();
        downloadIcon.click();
    }
}

package org.example.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(how= How.ID, using = "username")
    private WebElement usernameTxtField;
    @FindBy(how= How.ID, using = "password")
    private WebElement passwordTxtField;
    @FindBy(how= How.XPATH, using = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    private WebElement invalidCredentials;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public  void NavigateToSite(String url){
        try{
            driver.get(url);
        }
        catch(Exception ex){
            System.err.println("[Error] Navigation error:"+ex.getMessage());
        }
    }

    public void enterCredentials(String username, String password){
            usernameTxtField.sendKeys((username));
            passwordTxtField.sendKeys((password),Keys.ENTER);
    }
    public void invalidCredemtials(){invalidCredentials.isDisplayed();}
}

package org.example.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "username")
    private WebElement usernameTxtField;
    @FindBy(id = "password")
    private WebElement passwordTxtField;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    private WebElement invalidCredentials;

    public void refresh(){
        driver.navigate().refresh();
    }
    public  void NavigateToSite(String url){
        try{
            driver.get(url);
        }
        catch(Exception ex){
            System.err.println("[Error] Navigation error:"+ex.getMessage());
        }
    }
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public boolean enterCredentials(String username, String password){
            usernameTxtField.sendKeys((username));
            passwordTxtField.sendKeys((password));
            passwordTxtField.sendKeys(Keys.ENTER);
            return true;
    }
    public boolean invalidCredemtials(){
        return invalidCredentials.isDisplayed();
    }
}

package org.example.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    WebDriver driver;
    @FindBy(xpath = "//mat-card-title[@class='mat-mdc-card-title header']")
    private WebElement welcomeTitle;
    @FindBy(xpath = "//div[@class='name']")
    private WebElement loggedInUser;
    @FindBy(xpath = "//span[@class='mdc-button__label']")
    private WebElement logOutButton;
    @FindBy(xpath = "//button[@id='resultsButton-button']//span[@class='mat-button-toggle-label-content']")
    private WebElement myResults;
    @FindBy(xpath = "//div[@class='mat-mdc-form-field-infix ng-tns-c27-3']")
    private WebElement filterResults_textField;

    @FindBy(xpath = " //button[@id='profileButton-button']//span[@class='mat-button-toggle-label-content']")
    private WebElement myProfileOption;

    public WelcomePage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public void validateWelcomeTitle(){
        try{

             welcomeTitle.isDisplayed();
        }
        catch (Exception ex){
            System.err.println("[ERROR] FAILED TO VALIDATE WELCOME TITLE.\t"+ex.getMessage());
        }
    }

    public void validateLoggedUser(){
        try{

           loggedInUser.isDisplayed();
        }
        catch (Exception ex){
            System.err.println("[ERROR] FAILED TO VALIDATE LOGGED-IN USER FULL-NAME.\t"+ex.getMessage());

        }
    }

    public void clickLogOut(){

        try{
            if(logOutButton.isDisplayed()){
                logOutButton.click();
            }
        }
        catch (Exception ex){
            System.err.println("[ERROR] FAILED TO CLICK LOGOUT BUTTON.\t"+ex.getMessage());
        }
    }

    public void clickMyResults() throws Exception{
        myResults.isDisplayed();
        myResults.click();
    }

    public void clickMyProfile() throws Exception{
        myProfileOption.isDisplayed();
        myProfileOption.click();
    }
}

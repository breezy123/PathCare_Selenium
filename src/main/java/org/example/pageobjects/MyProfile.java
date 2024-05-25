package org.example.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile {

    WebDriver driver;
    @FindBy(xpath = "//td[normalize-space()='7810275800089']")
    private WebElement idNumber;
    @FindBy(xpath = "//td[normalize-space()='FLINTSTONE']")
    private WebElement surname;
    @FindBy(xpath = "//td[normalize-space()='FRED']")
    private WebElement firstName;
    @FindBy(xpath = "//td[normalize-space()='tmpkceml.7810275800089@pathcare.co.za']")
    private WebElement emailAddress;
    @FindBy(xpath = "//td[normalize-space()='083 590 6677']")
    private WebElement cellPhoneNumber;
    @FindBy(xpath = "//span[@class='ng-star-inserted']")
    private WebElement defaultPractice;
    public MyProfile(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void validatePatientRecords() throws Exception{
        idNumber.isDisplayed();
        surname.isDisplayed();
        firstName.isDisplayed();
        emailAddress.isDisplayed();
        cellPhoneNumber.isDisplayed();
        defaultPractice.isDisplayed();
    }
}

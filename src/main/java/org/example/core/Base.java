package org.example.core;

import org.example.driver.SeleniumDriver;
import org.example.pageobjects.LoginPage;
import org.example.pageobjects.MyProfile;
import org.example.pageobjects.PathologyResults;
import org.example.pageobjects.WelcomePage;
import org.openqa.selenium.WebDriver;

public class Base {
    public static WebDriver driver;
    public static SeleniumDriver seleniumDriverInstance;
    public static SeleniumDriver.BrowserType browserType;
    public static LoginPage loginPageObject;
    public static WelcomePage welcomePageObject;
    public static PathologyResults pathologyResultsPageObjects;
    public static MyProfile myProfilePageObjects;

    public static void launchBrowser(String browser){

        if(browser.equalsIgnoreCase("google_chrome")){
            browserType = SeleniumDriver.BrowserType.CHROME;
        }
        else if(browser.equalsIgnoreCase("ms_edge")){
            browserType = SeleniumDriver.BrowserType.MS_EDGE;
        }

        seleniumDriverInstance = new SeleniumDriver(browserType);
        driver = seleniumDriverInstance.getDriver();
        loginPageObject = new LoginPage(driver);
        welcomePageObject = new WelcomePage(driver);
        pathologyResultsPageObjects = new PathologyResults(driver);
        myProfilePageObjects = new MyProfile(driver);
    }
}

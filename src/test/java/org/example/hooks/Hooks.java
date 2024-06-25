package org.example.hooks;


import io.cucumber.java.*;
import org.example.core.Base;
import org.example.driver.SeleniumDriver;
import static org.example.utils.ReportScreenShots.takeScreenshotForReport;

public class Hooks extends Base{

    @Before
    public void setUpBrowserANDPageObjects(){
        SeleniumDriver.BrowserType browserType = SeleniumDriver.BrowserType.MS_EDGE;
        SeleniumDriver seleniumDriverInstance = new SeleniumDriver(browserType);
        driver = seleniumDriverInstance.getDriver();
    }
    @After
    public void takeScreenshotOnFailure(Scenario scenario){
        if(scenario.isFailed()){
            takeScreenshotForReport(scenario);
        }
        else{
            takeScreenshotForReport(scenario);
        }
        driver.close();
    }
}


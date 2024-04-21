package org.example.utils;

import io.cucumber.java.Scenario;
import org.example.core.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class ReportScreenShots extends Base {
    public static void takeScreenshotForReport(Scenario scenario){
        TakesScreenshot ts = (TakesScreenshot)driver;
        byte[] src = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(src,"image/png","screenshot");
    }

}

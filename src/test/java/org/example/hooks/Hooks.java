package org.example.hooks;


import io.cucumber.java.*;
import org.example.core.Base;

import java.io.IOException;

import static org.example.utils.ReportScreenShots.takeScreenshotForReport;

public class Hooks extends Base  {
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


package org.example.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        monochrome = true,
        //dryRun = false,
        features = {"src/test/resources/feature"},
        tags="@web_automation",
        glue = {"org.example"},
        plugin = {"json:target/jsonReports/cucumber-report.json"}
)

public class Runner extends AbstractTestNGCucumberTests{
}

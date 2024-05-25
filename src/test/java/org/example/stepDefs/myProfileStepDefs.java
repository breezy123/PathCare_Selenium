package org.example.stepDefs;

import io.cucumber.java.en.Then;
import org.example.driver.SeleniumDriver;
import org.example.pageobjects.MyProfile;

//import static org.example.core.Base.myProfilePageObjects;

public class myProfileStepDefs  {

    MyProfile myProfilePageObjects = new MyProfile(SeleniumDriver.getDriver());
    @Then("the user validates PathCare records")
    public void theUserValidatesPathCareRecords()throws Exception {myProfilePageObjects.validatePatientRecords();}
}

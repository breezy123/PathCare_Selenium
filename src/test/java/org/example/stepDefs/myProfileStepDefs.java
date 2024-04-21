package org.example.stepDefs;

import io.cucumber.java.en.Then;
import org.testng.Assert;

import static org.example.core.Base.myProfilePageObjects;

public class myProfileStepDefs {
    @Then("the user validates PathCare records")
    public void theUserValidatesPathCareRecords()throws Exception {
        Assert.assertTrue(myProfilePageObjects.validatePatientRecords());
    }
}

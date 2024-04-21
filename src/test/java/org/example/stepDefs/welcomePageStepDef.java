package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static org.example.core.Base.welcomePageObject;

public class welcomePageStepDef {
    @And("user is directed to the landing page")
    public void userIsDirectedToTheLandingPage() {
        Assert.assertTrue(welcomePageObject.validateWelcomeTitle());
    }

    @Then("user is displayed on the right top corner")
    public void userIsDisplayedOnTheRightTopCorner() {
        Assert.assertTrue(welcomePageObject.validateLoggedUser());
    }

    @And("user clicks on LogOut to logout of the system")
    public void userClicksOnLogOutToLogoutOfTheSystem() {
        Assert.assertTrue(welcomePageObject.clickLogOut());
    }

    @And("user clicks My Profile option")
    public void userClicksMyProfileOption()throws Exception {
        Assert.assertTrue(welcomePageObject.clickMyProfile());
    }
}

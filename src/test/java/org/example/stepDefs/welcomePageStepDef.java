package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.driver.SeleniumDriver;
import org.example.pageobjects.WelcomePage;


public class welcomePageStepDef{

    WelcomePage welcomePageObject = new WelcomePage(SeleniumDriver.getDriver());
    @And("user is directed to the landing page")
    public void userIsDirectedToTheLandingPage() {welcomePageObject.validateWelcomeTitle();}

    @Then("user is displayed on the right top corner")
    public void userIsDisplayedOnTheRightTopCorner() {welcomePageObject.validateLoggedUser();}

    @And("user clicks on LogOut to logout of the system")
    public void userClicksOnLogOutToLogoutOfTheSystem() {welcomePageObject.clickLogOut();}

    @And("user clicks My Profile option")
    public void userClicksMyProfileOption()throws Exception {welcomePageObject.clickMyProfile();}
}

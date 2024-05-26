package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.driver.SeleniumDriver;
import org.example.pageobjects.LoginPage;
import org.example.utils.ConfigReader;
import java.util.Properties;

public class loginStepDefs {
    private ConfigReader configReader;
    private Properties properties;

    LoginPage loginPageObject = new LoginPage(SeleniumDriver.getDriver());;

    @When("the user navigates to PathCare Patient Portal {string} website")
    public void theUserNavigatesToPathCarePatientPortalWebsite(String siteURL) {loginPageObject.NavigateToSite(siteURL);}

    @Then("user enters username {string} and {string}")
    public void userEntersUsernameAnd(String username, String password) {loginPageObject.enterCredentials(username,password);}

    @And("user validates the error message Invalid credentials")
    public void userValidatesTheErrorMessageInvalidCredentials() {loginPageObject.invalidCredentials();}

    @Then("user validates username and password input fields")
    public void userValidatesUsernameAndPasswordInputFields() {
    }
}

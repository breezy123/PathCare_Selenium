package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static org.example.core.Base.*;

public class loginStepDefs {

    @Given("that the user opens {string} browser")
    public void thatTheUserOpensBrowser(String browserType) {
        launchBrowser(browserType);
    }

    @When("the user navigates to PathCare Patient Portal {string} website")
    public void theUserNavigatesToPathCarePatientPortalWebsite(String siteURL) {
        loginPageObject.NavigateToSite(siteURL);

    }

    @Then("user enters username {string} and {string}")
    public void userEntersUsernameAnd(String username, String password) {
        loginPageObject.refresh();
        Assert.assertTrue(loginPageObject.enterCredentials(username,password));
    }

    @And("user validates the error message Invalid credentials")
    public void userValidatesTheErrorMessageInvalidCredentials() {
        Assert.assertTrue(loginPageObject.invalidCredemtials());
    }

    @Then("user validates username and password input fields")
    public void userValidatesUsernameAndPasswordInputFields() {
    }
}

package org.example.stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.core.Base;
import org.example.pageobjects.LoginPage;
import org.example.utils.ConfigReader;
import org.testng.Assert;

import java.util.Properties;

import static org.example.core.Base.*;

public class loginStepDefs {
    private ConfigReader configReader;
    private Properties properties;

//    @Before(order = 0)
//    public void getProperty() {
//        System.out.println("INSIDE HOOKS-@BEFORE(ORDER=0)");
//        configReader = new ConfigReader();
//        properties = configReader.initProp();
//        System.out.println("properties fetched from HOOKS-@BEFORE(ORDER=0) : " + properties);
//
//        System.out.println("INSIDE HOOKS-@BEFORE(ORDER=1)");
//        String browser = properties.getProperty("browser");
//        System.out.println("Browser fetched from @BEFORE(ORDER=1): " + browser);
////        PlaywrightDriver.launchBrowser(browser);
//        System.out.println("@Before(order = 1) completed");
//    }

    @Given("that the user opens {string} browser")
    public void thatTheUserOpensBrowser(String browserType) {
        launchBrowser(browserType);
    }

    @When("the user navigates to PathCare Patient Portal {string} website")
    public void theUserNavigatesToPathCarePatientPortalWebsite(String siteURL) {loginPageObject.NavigateToSite(siteURL);
    }

    @Then("user enters username {string} and {string}")
    public void userEntersUsernameAnd(String username, String password) {
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

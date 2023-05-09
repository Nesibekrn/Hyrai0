package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.BasePage;
import pages.CandidateSignInPage;
import utilities.ConfigReader;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepdefinitions.Hooks.driver;

public class US07_CandidateLoginStepDefinitions extends BasePage {

    @Given("user is on homepage")

    public void user_is_on_homepage() {
        driver.get(ConfigReader.getProperty("app_url"));
    }


    @When("user login with {string}")
    public void user_login_with(String string) {
        try {
            getCandidateHomePage().btn_login.click();
        } catch (Exception e) {
            getCompanyHomePage().btn_login.click();
        }
        getCandidateSignInPage().txt_email.sendKeys(ConfigReader.getProperty(string));
        ReusableMethods.waitFor(1);
        getCandidateSignInPage().txt_password.sendKeys(ConfigReader.getProperty("common_password"));
        ReusableMethods.waitFor(1);
        JSUtils.clickWithJS(getCandidateSignInPage().btn_signIn);
    }

    @Then("verify hire button is displayed")
    public void verify_hire_button_is_displayed() {
        ReusableMethods.waitFor(1);
        assertTrue(getCompanyDashboardPage().btn_hire.isDisplayed());
    }

    @When("user clicks for companies button")
    public void userClicksForCompaniesButton() {
        getCandidateHomePage().btn_forCompanies.click();
    }

    @Then("verify your profile field is displayed")
    public void verifyYourProfileFieldIsDisplayed() {
        assertTrue(getCandidateDashboardPage().btn_yourProfile.isDisplayed());
    }

    @When("user clicks Login button")
    public void userClicksLoginButton() {
        getCandidateHomePage().btn_login.click();
    }

    @And("user submits an email in invalid format")
    public void userSubmitsAnEmailInInvalidFormat() {
        getCandidateSignInPage().txt_email.sendKeys("demokesif1@gmail" + Keys.TAB);
    }

    @And("user submits a valid password")
    public void userSubmitsAValidPassword() {
        getCandidateSignInPage().txt_password.sendKeys("123123");
    }

    @Then("user verifies Invalid email message is present")
    public void userVerifiesInvalidEmailMessageIsPresent() {
        ReusableMethods.verifyElementDisplayed(getCandidateSignInPage().msg_invalidEmail);
    }

    @And("user submits an email in another invalid format")
    public void userSubmitsAnEmailInAnotherInvalidFormat() {
        getCandidateSignInPage().txt_email.sendKeys("demokesif1.com" + Keys.TAB);
    }


    @And("user submits an invalid email")
    public void userSubmitsAnInvalidEmail() {
        getCandidateSignInPage().txt_email.sendKeys("invalidmail@gmail.com");
    }

    @Then("user clicks Sign In button")
    public void userClicksSignInButton() {
        JSUtils.clickWithJS(getCandidateSignInPage().btn_signIn);
    }

    @Then("user verifies Wrong Credentials message is present")
    public void userVerifiesWrongCredentialsMessageIsPresent() {
        ReusableMethods.waitForVisibility(getCandidateSignInPage().msg_wrongCredentials, 2);
        ReusableMethods.verifyElementDisplayed(getCandidateSignInPage().msg_wrongCredentials);
    }

    @And("user submits a valid email")
    public void userSubmitsAValidEmail() {
        getCandidateSignInPage().txt_email.sendKeys("demokesif1@gmail.com");
    }

    @And("user submits an invalid password")
    public void userSubmitsAnInvalidPassword() {
        getCandidateSignInPage().txt_password.sendKeys("321321");
    }

    @Then("verify that user is on candidate dashboard page")
    public void verifyThatUserIsOnCandidateDashboardPage() {
        ReusableMethods.waitForVisibility(getCandidateDashboardPage().btn_yourProfile, 2);
        assertEquals("https://hyrai.com/candidate/dashboard", driver.getCurrentUrl());
    }
}


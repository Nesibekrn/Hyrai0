package stepdefinitions.uistepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static stepdefinitions.Hooks.driver;

public class CompanyLoginStepDefination extends BasePage {
    @Then("user verifies that email box is active")
    public void userVerifiesThatEmailBoxIsActive() {
        Assert.assertTrue(getCompanySignInPage().txt_email.isEnabled());
    }

    @Then("user verifies that Password box is active")
    public void userVerifiesThatPasswordBoxIsActive() {
        Assert.assertTrue(getCompanySignInPage().txt_password.isEnabled());
    }

    @Then("user verifies that Forget Password link is active")
    public void userVerifiesThatForgetPasswordLinkIsActive() {
       Assert.assertTrue(getCompanySignInPage().link_forget_password.isEnabled());
    }

    @Then("user verifies that Sign In button is active")
    public void userVerifiesThatSignInButtonIsActive() {
        Assert.assertTrue(getCompanySignInPage().btn_signin.isEnabled());
    }

    @When("user enters valid information in email and Password box")
    public void userEntersValidInformationInEmailAndPasswordBox() {
        getCompanySignInPage().txt_email.sendKeys(ConfigReader.getProperty("company_username"));
        getCompanySignInPage().txt_password.sendKeys(ConfigReader.getProperty("common_password"));
        ReusableMethods.scrollToElement(getCandidateSignInPage().btn_signIn);
        //JSUtils.clickWithJS(getCompanySignInPage().btn_signin);
        getCompanySignInPage().btn_signin.click();
    }

    @Then("user verifies {string} page is visible")
    public void userVerifiesPageIsVisible(String url) {
        ReusableMethods.waitFor(5);
        Assert.assertEquals(url,driver.getCurrentUrl());
    }

    /*@Then("user clicks Login link")
    public void userClicksLoginLink() {

        getCompanyHomePage().link_login.click();
    }*/
}


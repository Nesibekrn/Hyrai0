package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.CompanyHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PageNavStepDefinitions extends BasePage {
    @When("user clicks sign up button")
    public void user_clicks_sign_up_button() {
        getCandidateHomePage().btn_signUp.click();

        String currentUrl = Driver.getDriver().getCurrentUrl();
        assertTrue(currentUrl.equals("https://hyrai.com/auth?tab=SIGN_UP"));

    }

    @Given("user goes to candidate homepage")
    public void user_goes_to_candidate_homepage() {
        Driver.getDriver().navigate().to("https://hyrai.com/auth?tab=SIGN_UP");

    }

    @When("user clicks on logo")
    public void user_clicks_on_logo() {
        getCandidateHomePage().companyLogo.click();

        assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hyrai.com/"));
    }

    @Then("user clicks on home icon")
    public void user_clicks_on_home_icon() {
        getCandidateHomePage().btn_home.click();

        assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hyrai.com/"));

    }

    @Then("user clicks on about")
    public void user_clicks_on_about() {
        getCandidateHomePage().btn_about.click();

        assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hyrai.com/about-us"));
    }

    @Then("user clicks on contact us")
    public void user_clicks_on_contact_us() {
        getCandidateHomePage().btn_contactUs.click();

        assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hyrai.com/contact-us"));

    }

    @Then("user clicks on for companies")
    public void user_clicks_on_for_companies() {
        getCandidateHomePage().btn_forCompanies.click();

        assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hyrai.com/company"));
    }

    @Given("user goes to company home page")
    public void user_goes_to_company_home_page() {
    Driver.getDriver().navigate().to("https://hyrai.com/company");
    }
    @Then("user clicks on for candidates")
    public void user_clicks_on_for_candidates() {
        getCompanyHomePage().btn_forCandidates.click();
      //  ReusableMethods.waitFor(3);
      //  System.out.println(Driver.getDriver().getCurrentUrl());

        assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hyrai.com/"));

    }

    @Then("user clicks on login")
    public void user_clicks_on_login() {
        getCandidateHomePage().btn_login.click();

        assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hyrai.com/auth?tab=SIGN_IN"));

    }

    @Then("user clicks on the word Hyrai")
    public void user_clicks_on_the_word_hyrai() {
       getCandidateHomePage().wordHyrai.click();

       assertTrue(Driver.getDriver().getCurrentUrl().equals("https://hyrai.com/"));
    }
}
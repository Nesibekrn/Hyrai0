package stepdefinitions.uistepdefinitions;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import utilities.ConfigReader;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static stepdefinitions.Hooks.actions;
import static stepdefinitions.Hooks.driver;

public class ForCompaniesRequestADemoStepDefinitions extends BasePage {
   @Given("user is on the company homepage")
   public void givenTheUserIsOnTheCompanyHomepage() {
       driver.get(ConfigReader.getProperty("app_url"));
       ReusableMethods.waitFor(2);
   }
    @Given("User clicks {string} button")
    public void userClicksForCompaniesButton() {
        ReusableMethods.waitFor(3);
        getForCompanyRequestDemoPage().forCompaniesButton.click();
        ReusableMethods.waitFor(3);
    }
    @Given("go to the Source qualified candidates section of the page")
    public void go_to_the_source_qualified_candidates_section_of_the_page() {
        ReusableMethods.waitFor(3);
        ReusableMethods.scrollToElement(getCompanyHomePage().getForCompanyRequestDemoPage().sourceQualifiedCandidates);
        ReusableMethods.waitFor(3);
    }
    @Then("user clicks the REQUEST A DEMO button")
    public void user_clicks_the_request_a_demo_button() {
        ReusableMethods.waitFor(3);
        getForCompanyRequestDemoPage().requestADemo1Link.click();
        ReusableMethods.waitFor(3);
    }
    @Then("user verifies Request a Demo")
    public void user_verifies_request_a_demo() {
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(getForCompanyRequestDemoPage().requestDemoButton);
        ReusableMethods.waitFor(3);
    }
    @Then("user clicks the other Request a demo button")
    public void user_clicks_the_other_request_a_demo_button() {
        ReusableMethods.waitFor(3);
        getForCompanyRequestDemoPage().requestaDemo2Link.click();
        ReusableMethods.waitFor(3);
    }

    //******************** 2 *****************

    @Then("user clicks is the Subscribe now button")
    public void user_clicks_is_the_subscribe_now_button() {
        ReusableMethods.waitFor(3);
        JSUtils.clickWithJS(getForCompanyRequestDemoPage().subcribeNowLink);
        ReusableMethods.waitFor(2);
    }
    @Then("user writes company name box")
    public void user_writes_company_name_box() {
        ReusableMethods.waitFor(2);
        getForCompanyRequestDemoPage().companyNameBox.sendKeys("Ellie's");
    }
    @Then("user writes email")
    public void user_writes_email() {
        ReusableMethods.waitFor(2);
        getForCompanyRequestDemoPage().workEmailLink.sendKeys("admin047@gmail.com");
    }
    @Then("user clicks Continue button")
    public void user_clicks_continue_button() {
        ReusableMethods.waitFor(2);
        JSUtils.clickWithJS(getForCompanyRequestDemoPage().continueLink);
        ReusableMethods.waitFor(2);
    }
    @Then("user clicks the I read and agree with the terms and conditions box")
    public void user_clicks_the_i_read_and_agree_with_the_terms_and_conditions_box() {
        ReusableMethods.waitFor(3);
        JSUtils.clickWithJS(getForCompanyRequestDemoPage().termsConditionsCheckbox);
        ReusableMethods.waitFor(2);
    }
    @Then("User clicks is SubscribeSubmit button")
    public void user_clicks_is_subscribe_submit_button() {
        ReusableMethods.waitFor(2);
        JSUtils.clickWithJS(getForCompanyRequestDemoPage().termsConditions_Submit);
        ReusableMethods.waitFor(2);
    }
    @Then("user verifies Log in to PayPal")
    public void user_verifies_log_in_to_pay_pal() {
        ReusableMethods.waitFor(2);
        JSUtils.clickWithJS(getForCompanyRequestDemoPage().PayPalEmailLink);
        ReusableMethods.waitFor(2);
    }

    //************************ 3 ************************

    @Then("the user writes is the email")
    public void the_user_writes_is_the_email() {
        ReusableMethods.waitFor(2);
        getForCompanyRequestDemoPage().PayPalEmailLink.sendKeys("admin047@gmail.com");
        ReusableMethods.waitFor(2);
    }
    @Then("user clicks is in the SubscribeNext button")
    public void user_clicks_is_in_the_subscribe_next_button() {
        ReusableMethods.waitFor(3);
        JSUtils.clickWithJS(getForCompanyRequestDemoPage().PayPalEmail_NextButton);
        ReusableMethods.waitFor(2);
    }
    @Then("user verifies the payment method")
    public void user_verifies_the_payment_method() {
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(getForCompanyRequestDemoPage().PayPalPage);
        ReusableMethods.waitFor(3);
    }

    //*****************************************************************



}


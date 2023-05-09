package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.JSUtils;
import utilities.ReusableMethods;



public class US_010 extends BasePage {

    @Given("User clicks on learn more button")
    public void user_clicks_on_learn_more_button() {

        ReusableMethods.waitForClickablility(getCandidateHomePage().btn_learnMore,5);
        JSUtils.clickWithJS(getCandidateHomePage().btn_learnMore);
    }

    @Then("User verifies that {string} input box is visible")
    public void user_verifies_that_input_box_is_visible(String inputBox) {

        switch (inputBox){
            case "Name":
               ReusableMethods.verifyElementDisplayed(getCompanyHomePage().input_name);
               break;
            case "Company":
                ReusableMethods.verifyElementDisplayed(getCompanyHomePage().input_companyName);
                break;
            case "Title":
                ReusableMethods.verifyElementDisplayed(getCompanyHomePage().input_title);
                break;
            case "Phone Number":
                ReusableMethods.verifyElementDisplayed(getCompanyHomePage().input_phoneNumber);
                break;
            case "Email":
                ReusableMethods.verifyElementDisplayed(getCompanyHomePage().input_email);
                break;

        }


    }

    @Then("User verifies that {string} input box is enabled")
    public void user_verifies_that_input_box_is_enabled(String inputBox) {

        switch (inputBox){
            case "Name":
                getCompanyHomePage().input_name.sendKeys("John");
                ReusableMethods.verifyElementEnabled(getCompanyHomePage().input_name);
                break;
            case "Company":
                getCompanyHomePage().input_companyName.sendKeys("ABC Ltd.");
                ReusableMethods.verifyElementEnabled(getCompanyHomePage().input_companyName);
                break;
            case "Title":
                getCompanyHomePage().input_title.sendKeys("Director");
                ReusableMethods.verifyElementEnabled(getCompanyHomePage().input_title);
                break;
            case "Phone Number":
                getCompanyHomePage().input_phoneNumber.sendKeys("0123456789");
                ReusableMethods.verifyElementEnabled(getCompanyHomePage().input_phoneNumber);
                break;
            case "Email":
                getCompanyHomePage().input_email.sendKeys("john@abc.com");
                ReusableMethods.verifyElementEnabled(getCompanyHomePage().input_email);
                break;

        }


    }

    @When("User clicks on the Request a Demo button")
    public void user_clicks_on_the_request_a_demo_button() {

        ReusableMethods.waitForClickablility(getCompanyHomePage().btn_requestADemo,5);
        JSUtils.clickWithJS(getCompanyHomePage().btn_requestADemo);

    }

    @Then("This field is required text is displayed below the {string} input box.")
    public void this_field_is_required_text_is_displayed_below_the_input_box(String inputBox) {

        switch (inputBox){
            case "Name":
                ReusableMethods.verifyElementDisplayed(getCompanyHomePage().txt_thisFieldIsRequiredMessages.get(0));
                break;
            case "Company":
                ReusableMethods.verifyElementDisplayed(getCompanyHomePage().txt_thisFieldIsRequiredMessages.get(1));
                break;
            case "Title":
                ReusableMethods.verifyElementDisplayed(getCompanyHomePage().txt_thisFieldIsRequiredMessages.get(2));
                break;
            case "Phone Number":
                ReusableMethods.verifyElementDisplayed(getCompanyHomePage().txt_thisFieldIsRequiredMessages.get(3));
                break;
            case "Email":
                ReusableMethods.verifyElementDisplayed(getCompanyHomePage().txt_thisFieldIsRequiredMessages.get(4));
                break;

        }


    }

    @When("User enters {string} into the Name input box")
    public void user_enters_into_the_name_input_box(String string) {
        getCompanyHomePage().input_name.sendKeys(string);
    }

    @When("User enters {string} into the Company input box")
    public void user_enters_into_the_company_input_box(String string) {
        getCompanyHomePage().input_companyName.sendKeys(string);
    }

    @When("User enters {string} into the Title input box")
    public void user_enters_into_the_title_input_box(String string) {
        getCompanyHomePage().input_title.sendKeys(string);
    }

    @When("User enters {string} into the Phone Number input box")
    public void user_enters_into_the_phone_number_input_box(String string) {
        getCompanyHomePage().input_phoneNumber.sendKeys(string);
    }

    @When("User enters {string} into the Email input box")
    public void user_enters_into_the_email_input_box(String string) {
        getCompanyHomePage().input_email.sendKeys(string);
    }

    @Then("User verifies your request has been submit.. message is not displayed")
    public void message_is_not_displayed() {

        ReusableMethods.verifyElementNotDisplayed(getCompanyHomePage().txt_requestSubmitMessage);
    }

    @Then("Must be at least 2 characters text is displayed")
    public void must_be_at_least_2_characters_text_is_displayed() {

        ReusableMethods.verifyElementDisplayed(getCompanyHomePage().txt_mustBeAtLeastMessage1);

    }

    @Then("Must be at least 10 characters text is displayed")
    public void must_be_at_least_10_characters_text_is_displayed() {

        ReusableMethods.verifyElementDisplayed(getCompanyHomePage().txt_mustBeAtLeastMessage2);

    }

    @Then("User verifies that Request a Demo button is visible")
    public void user_verifies_that_request_a_demo_button_is_visible() {

        ReusableMethods.verifyElementDisplayed(getCompanyHomePage().btn_requestADemo);

    }

    @Then("Invalid email text is displayed")
    public void invalid_email_text_is_displayed() {

        ReusableMethods.verifyElementDisplayed(getCompanyHomePage().txt_invalidEmail);

    }

    @Then("User verifies your request has been submit.. message is displayed")
    public void user_verifies_your_request_has_been_submit_message_is_displayed() {

        ReusableMethods.waitForVisibility(getCompanyHomePage().txt_requestSubmitMessage,5);
        ReusableMethods.verifyElementDisplayed(getCompanyHomePage().txt_requestSubmitMessage);

    }

    @Then("User verifies that Request a Demo button is clickable")
    public void user_verifies_that_request_a_demo_button_is_clickable() {
       
        Assert.assertTrue(getCompanyHomePage().btn_requestADemo.isEnabled());
        
    }





}
package stepdefinitions.uistepdefinitions;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import stepdefinitions.Hooks;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.awt.geom.RectangularShape;

import static stepdefinitions.Hooks.actions;
import static stepdefinitions.Hooks.driver;

public class US_015_CompanySignUpStepDefinitions extends BasePage {
    @Given("User is on homepage")
    public void user_is_on_homepage() {
      driver.get("https://hyrai.com/");
    }
    @Then("User see and click {string} button")
    public void user_see_and_click_button(String string) {
        getCompanySignUpPage().btnSignUp.click();

    }
    @Then("User see {string} text middle of page")
    public void user_see_text_middle_of_page(String string) {
        Assert.assertTrue(getCompanySignUpPage().textCompany.isDisplayed());
    }

    @Then("Verify the {string} button")
    public void verify_the_button(String string) {
     Assert.assertTrue(getCompanySignUpPage().btnSignUp.isEnabled());
    }

    @Then("User see the {string} text middle of page")
    public void user_see_the_text_middle_of_page(String string) {
     Assert.assertTrue(getCompanySignUpPage().activeButton.isDisplayed());
    }
    @Then("User check the clickable for {string} button")
    public void user_check_the_clickable_for_button(String string) {
       getCompanySignUpPage().btnSignIn.click();
        ReusableMethods.waitFor(3);
    }

    @Then("User see and click {string}")
    public void user_see_and_click(String Gmail) {
      getCompanySignUpPage().btnGmail.click();
    }

    @Then("User see and click {string} icon")
    public void user_see_and_click_icon1(String Github) {
     getCompanySignUpPage().btnGitHub.click();
    }
    /*
    @Then("User see the {string} page after click  {string}")
    public void user_see_the_page_after_click(String string) {
   //ReusableMethods.verifyElementDisplayed(getCompanySignUpPage().btnGitHub);
    }

     */

    @Then("User see and click {string} icon.")
    public void user_see_and_click_icon(String string) {
       getCompanySignUpPage().btnLinkendIn.click();
    }
   /*
    @Then("User should see the {string} page after click the button")
    public void user_should_see_the_page_after_click_the_button(String string) {
        ReusableMethods.waitFor(3);
        String linkedIn="https://www.linkedin.com/uas/login";
        ReusableMethods.switchToWindow(linkedIn);
        Assert.assertEquals(getCompanySignUpPage().btnLinkendIn,linkedIn);


    }

    */


    @Then("User should see {string} under page")
    public void user_should_see_under_page(String string) {
     ReusableMethods.scrollToElement(getCompanySignUpPage().textPolicy);
     ReusableMethods.waitFor(3);
    }
    @Then("User should see and click {string} button")
    public void user_should_see_and_click_button(String string) {
      //getCompanySignUpPage().btnSignUpForCandidate.click();
        JSUtils.clickWithJS(getCompanySignUpPage().btnSignUpForCandidate);
    }
    @Then("User should see the \"Candidate \"page after click the button")
    public void user_should_see_the_candidate_page_after_click_the_button() {
       Assert.assertTrue(getCompanySignUpPage().textCandidate.isDisplayed());

    }


    @Then("User should click {string} button under page")
    public void user_should_click_button_under_page(String string) {
         JSUtils.clickWithJS(getCompanySignUpPage().btnSignUpCompany);
         ReusableMethods.waitFor(3);
    }
    @Then("User should see {string} text under all fields after click \"Sign Up button")
    public void user_should_see_text_under_all_fields_after_click_sign_up_button(String string) {
        ReusableMethods.waitForVisibility(getCompanySignUpPage().textThisFieldIsRequired,2);
        Assert.assertTrue(getCompanySignUpPage().textThisFieldIsRequired.isDisplayed());
        //Assert.assertEquals("! This field is required",getCompanySignUpPage().textThisFieldIsRequired);

    }






}

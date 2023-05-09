package stepdefinitions.uistepdefinitions;

import com.github.dockerjava.api.model.Link;
import com.google.common.base.Verify;
import io.cucumber.java.en.*;
import org.checkerframework.checker.guieffect.qual.UI;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static stepdefinitions.Hooks.driver;

public class US020CompanySignInStepDefinitions extends BasePage {
     //Background
    @Given("User goes on homepageee")
    public void User_goes_on_homepageee() {
        Driver.getDriver().get("https://hyrai.com/");
    }
   @Then("user clicks For Company button.")
    public void user_clicks_For_Company_button() {
        ReusableMethods.waitForClickablility(getCandidateHomePage().btn_forCompanies,5);
        //JSUtils.clickWithJS(getCandidateHomePage().btn_forCompanies);
getCandidateHomePage().btn_forCompanies.click();
    }


    @Then("User clicks login buttonn.")
    public void User_clicks_login_buttonn() {
        ReusableMethods.waitFor(2);
        JSUtils.clickWithJS(getCompanySignInPage().company_login);
        //getCompanySignInPage().company_login.click();
    }

    @Then("user verifies that the page should go down.")
    public void user_verifies_that_the_page_should_go_down() {
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollToElement(getCompanySignInPage().link_forget_password);

    }

//TC01
    @Then("User verifies the Forgot Password link visible")
    public void user_verifies_the_forgot_password_link_visible() {
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollToElement(getCompanySignInPage().link_forget_password);
        Assert.assertTrue(getCompanySignInPage().link_forget_password.isDisplayed());


    }

    @Then("User clicks the Forgot Password Link")
    public void user_clicks_the_forgot_password_link() {
    ReusableMethods.waitFor(2);
    JSUtils.clickWithJS(getCompanySignInPage().link_forget_password);

    }


    //TC02
    @Then("User verifies the text Please verify your Email is displayed.")
    public void user_verifies_the_text_please_verify_your_email_is_displayed() {
    Assert.assertTrue(getCompanySignInPage().please_verify_your_email.isDisplayed());
    }

    //TC03

    @Then("User verifies the email input box insert text.")
    public void user_verifies_the_email_input_box_insert_text() {
    getCompanySignInPage().verify_email_box.isEnabled();
    }


   //TC04
    @Then("User clicks Verify Email button.")
    public void user_should_clicks_verify_email_button() {
        ReusableMethods.waitFor(2);
        JSUtils.clickWithJS(getCompanySignInPage().btn_verify_email);

    }

//TC05

  /*  @Then ("User clicks the email box")
        public void user_clicks_the_email_box(){
        JSUtils.clickWithJS(getCompanySignInPage().verify_email_box);
       ReusableMethods.waitFor(2);
    }
*/

    @Then("User types a valid email to email box.")
    public void user_types_a_valid_email_to_email_box() {
       JSUtils.typeWithJS(getCompanySignInPage().verify_email_box,"demokesif1@gmail.com");
        ReusableMethods.waitFor(2);
     // getCompanySignInPage().verify_email_box.sendKeys("demokesif1@gmail.com");
      ReusableMethods.waitFor(2);
        Assert.assertEquals("demokesif1@gmail.com",getCompanySignInPage().verify_email_box.getAttribute("value"));
    }

   /* @Then("User verifies Email verification was successful, please check your e-mail address. Text must be visible.")
    public void user_verifies_email_verification_was_successful_please_check_your_e_mail_address_text_must_be_visible() {
        ReusableMethods.waitFor(2);
        getCompanySignInPage().email_verification_was_successful.isDisplayed();
    }
*/
}

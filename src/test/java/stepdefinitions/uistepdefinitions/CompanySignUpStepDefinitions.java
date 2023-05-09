package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.ReusableMethods;

public class CompanySignUpStepDefinitions extends BasePage {


    @Then("user clicks For Companies button")
    public void userClicksForCompaniesButton() {
        getCandidateHomePage().btn_forCompanies.click();
    }

    @Then("user clicks Sign Up button")
    public void user_clicks_sign_up_button() {
        getCompanyDashboardPage().btn_SignUpCompany.click();
    }
    @Then("User enters valid value for Company Name box")
    public void user_enters_valid_value_for_company_name_box() {
       getCompanySignUpPage().boxCompanyName.sendKeys("hyrai");
    }
    @Then("User enters valid value for Company Website box")
    public void user_enters_valid_value_for_company_website_box() {
        getCompanySignUpPage().boxCompanyWebsite.sendKeys("hyrai.com");
    }
    @Then("User enters valid value for Work Email box")
    public void user_enters_valid_value_for_work_email_box() {
        getCompanySignUpPage().boxWorkEmail.sendKeys("lonedear@leader.fr");
    }
    @When("User verifies password text is visible")
    public void user_verifies_password_text_is_visible() {

       Assert.assertTrue(getCompanySignUpPage().boxTextPasseword.isDisplayed());
    }
    @Then("User verifies password input is active")
    public void user_verifies_password_input_is_active() {

        Assert.assertTrue(getCompanySignUpPage().boxPassword.isEnabled());
    }
    @Then("User enters {string} passeword box")
    public void user_enters_passeword_box(String password) {

        getCompanySignUpPage().boxPassword.sendKeys(password);
        ReusableMethods.scrollToElement(getCompanySignUpPage().boxConfirmPassword);
        ReusableMethods.waitFor(1);
        getCompanySignUpPage().boxConfirmPassword.click();
    }
    @And ("User verifies {string} is visible")
    public void user_verifies_warning_message(String message) {
      ReusableMethods.waitFor(1);
        Assert.assertEquals(getCompanySignUpPage().msgWarningPassword.getText(), message);

    }
    @Then("User enters valide value for password box")
    public void user_enters_valide_value_for_password_box() {
        getCompanySignUpPage().boxPassword.sendKeys("abcdef");
    }
    @Then("User verifies Confirm password text is visible")
    public void user_verifies_confirm_password_text_is_visible() {
        getCompanySignUpPage().boxTextConfirmPassword.isDisplayed();
    }
    @Then("User verifies Confirm password text is active")
    public void user_verifies_confirm_password_text_is_active() {
        getCompanySignUpPage().boxConfirmPassword.isEnabled();
    }
    @Then("User enters {string} for Confirm Password box")
    public void user_enters_for_confirm_password_box(String ConfirmPassword) {
    getCompanySignUpPage().boxConfirmPassword.sendKeys(ConfirmPassword);
       // ReusableMethods.scrollToElement(getCompanySignUpPage().boxConfirmPassword);
        ReusableMethods.scrollAndClickWithJS(getCompanySignUpPage().btnSignUpForRegister);
       // ReusableMethods.waitFor(1);
       // getCompanySignUpPage().boxConfirmPassword.click();



    }

    }

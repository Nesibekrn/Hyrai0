package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Company;
import io.cucumber.java.en.*;
import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

import org.junit.Assert;

import stepdefinitions.Hooks;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static stepdefinitions.Hooks.actions;
import static stepdefinitions.Hooks.driver;


public class US_21CompanySignInStepDefinitions extends BasePage {

    //TC001
    @Then("user clicks on login link")
    public void userClicksOnLoginLink() {
        ReusableMethods.waitFor(2);
        getCompanySignInPage().btn_login.click();
    }

    @Then("user enters invalid value into email box")
    public void userEntersInvalidValueIntoEmailBox() {
        getCompanySignInPage().txt_email2.sendKeys("mustafa@gmail.com");
        //getCompanySignInPage().txt_email.sendKeys("dilekkocak85@hotmail.com");
        //WebElement emailinput = driver.findElement(By.xpath("//input[@placeholder=‘Email’]"));
//emailinput.sendKeys("dilekkocak85@hotmail.com");
    }

    @Then("user enters valid value into password box")
    public void userEntersValidValueIntoPasswordBox() {
        getCompanySignInPage().txt_password2.sendKeys("123123");
        //getCompanySignInPage().txt_password.sendKeys("123123"+Keys.ENTER);
    }

    @Then("user clicks on sign in button")
    public void userClicksOnSignInButton() {

        ReusableMethods.waitFor(3);
        JSUtils.clickWithJS(getCompanySignInPage().btn_signIn);
        //getCompanySignInPage().btn_signIn.click();
        ReusableMethods.waitFor(4);
    }
    //ReusableMethods.scrollToElement(getCompanySignInPage().txt_email);
    /*@And("User clicks enter")
    public void userClicksEnter() {
        // actions.sendKeys(Keys.TAB, Keys.TAB,Keys.ENTER).build().perform();
    }
*/

    @Then("User verifies Email or password is not valid! is displayed.")
    public void user_verifies_email_or_password_is_not_valid_is_displayed() {
        Assert.assertTrue(getCompanySignInPage().txt_not_valid.isDisplayed());
    }

    //TC002
    @When("User insert a valid email .")
    public void user_insert_a_valid_email() {
        getCompanySignInPage().txt_email2.sendKeys("demokesif1@gmail.com");
        //JSUtils.typeWithJS(getCompanySignInPage().txt_email, "demokesif1@gmail.com");
        ReusableMethods.waitFor(2);
    }

    @When("User inserts an invalid password.")
    public void user_inserts_an_invalid_password() {
        getCompanySignInPage().txt_password2.sendKeys("234sdf");
        //JSUtils.typeWithJS(getCompanySignInPage().txt_password, "3ur789");
    }

    @Then("User should verify Wrong credentials! Are you trying to login as a company is displayed.")
    public void userShouldVerifyWrongCredentialsAreYouTryingToLoginAsACompanyIsDisplayed() {
        Assert.assertTrue(getCompanySignInPage().wrongCredential.isDisplayed());
    }
    //TC003

    @Then("User verifies the warning message1 is not include reset password")
    public void user_verifies_the_warning_message1_is_not_include_reset_password() {
    Assert.assertTrue(getCompanySignInPage().txt_not_valid.getText().contains("reset password"));
    }

    @Then("User verifies warning message2 is not include reset passpord")
    public void user_verifies_warning_message2_is_not_include_reset_passpord() {
    Assert.assertTrue(getCompanySignInPage().wrongCredential.getText().contains("reset password"));
    }



}
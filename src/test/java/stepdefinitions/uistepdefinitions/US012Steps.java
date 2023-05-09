package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import stepdefinitions.Hooks;
import utilities.ConfigReader;

import static stepdefinitions.Hooks.driver;

public class US012Steps extends BasePage {

    @Given("the user is on the company homepage")
    public void the_user_is_on_the_company_homepage() {

        //driver.get(ConfigReader.getProperty("app_url"));
        Hooks.driver.navigate().to("https://hyrai.com/company");

    }

    @Then("the user verifies {string} text is visible")
    public void the_user_verifies_text_is_visible(String string) {

        getCompanyHomePage().section_txt.isDisplayed();
    }

    @Then("user verifies the {string} are clickable")
    public void user_verifies_the_are_clickable(String string) {

        if (string.equals("subscriber1 ")){

            Assert.assertTrue(getCompanyHomePage().btn_sub1.isEnabled());

        }else if(string.equals("subscriber2 ")){

            Assert.assertTrue(getCompanyHomePage().btn_sub2.isEnabled());

        }else if(string.equals("subscriber3 ")){

            Assert.assertTrue(getCompanyHomePage().btn_sub3.isEnabled());


        }else if (string.equals("contact")){

            Assert.assertTrue(getCompanyHomePage().btn_contact.isEnabled());

        }else if(string.equals("requestDemo1")){

            Assert.assertTrue(getCompanyHomePage().btn_requestDemo1.isEnabled());

        }else if(string.equals("requestDemo2")) {

            Assert.assertTrue(getCompanyHomePage().btn_requestDemo2.isEnabled());
        }
    }


}
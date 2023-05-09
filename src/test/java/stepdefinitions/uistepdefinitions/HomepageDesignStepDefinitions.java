package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomepageDesignStepDefinitions extends BasePage {


    @And("user should be able to be see the logo of the page without any problems")
    public void user_should_be_able_to_be_see_the_logo_of_the_page_without_any_problems() {

        assertTrue(getCandidateHomePage().companyLogo.isDisplayed());

    }

    @Then("user sees the message {string}")
    public void user_sees_the_message(String expectedMessage) {

        assertEquals(expectedMessage,getCandidateHomePage().companyMotto.getText());

    }


}


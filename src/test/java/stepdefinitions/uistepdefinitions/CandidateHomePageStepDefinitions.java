package stepdefinitions.uistepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BasePage;
import pages.CandidateHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import javax.imageio.stream.ImageInputStream;
import java.util.List;
import java.util.List;
import java.util.prefs.BackingStoreException;

import static stepdefinitions.Hooks.actions;
import static stepdefinitions.Hooks.driver;

public class CandidateHomePageStepDefinitions extends BasePage {

    @When("user verifies the {string} logo is clickable")
    public void user_verifies_the_logo_is_clickable(String string) {

        if (string.equals("facebook")) {

            Assert.assertTrue(getCandidateHomePage().facebookLogo.isEnabled());

        } else if (string.equals("twitter")) {

            Assert.assertTrue(getCandidateHomePage().twitterLogo.isEnabled());

        } else if (string.equals("linkedin")) {

            Assert.assertTrue(getCandidateHomePage().linkedInLogo.isEnabled());

        }
    }

    @When("user clicks {string} button")
    public void user_clicks_button(String string) {

        if (string.equals("facebook")) {

            getCandidateHomePage().facebookLogo.click();

        } else if (string.equals("twitter")) {

            getCandidateHomePage().twitterLogo.click();

        } else if (string.equals("linkedin")) {

            getCandidateHomePage().linkedInLogo.click();

        }
    }

    @Then("user is on {string} page")
    public void user_is_on_page(String string) {

        if (string.contains("facebook")) {

            for (String handle : Driver.getDriver().getWindowHandles()) {
                Driver.getDriver().switchTo().window(handle);
                if (Driver.getDriver().getTitle().equals(string)) {
                    return;
                }
            }
            String currentUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(currentUrl.contains(string));

        } else if (string.contains("twitter")) {

            for (String handle : Driver.getDriver().getWindowHandles()) {
                Driver.getDriver().switchTo().window(handle);
                if (Driver.getDriver().getTitle().equals(string)) {
                    return;
                }
            }
            String currentUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(currentUrl.contains(string));

        } else if (string.contains("linkedin")) {

            for (String handle : Driver.getDriver().getWindowHandles()) {
                Driver.getDriver().switchTo().window(handle);
                if (Driver.getDriver().getTitle().equals(string)) {
                    return;
                }
            }
            String currentUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(currentUrl.contains(string));


        }

    }


    @Then("user verifies the tile is clickable")
    public void userVerifiesTheTileIsClickable(DataTable dataTable){

        for(int i = 0; i<getCandidateHomePage().titlesName.size(); i++){
            ReusableMethods.waitFor(3);
            ReusableMethods.scrollToElement(getCandidateHomePage().titlesName.get(i));
            ReusableMethods.waitFor(3);
            Assert.assertTrue(getCandidateHomePage().titlesName.get(i).isEnabled());

        }

    }

    @When("user clicks {string} title")
    public void userClicksTitle(String arg0) {

        if (arg0.equals("Data Scientist")) {
            ReusableMethods.waitFor(3);
            ReusableMethods.scrollToElement(getCandidateHomePage().dataScientist);
            ReusableMethods.waitFor(3);
            getCandidateHomePage().dataScientist.click();
        } else if (arg0.equals("ML Engineer")) {
            ReusableMethods.waitFor(3);
            ReusableMethods.scrollToElement(getCandidateHomePage().mlEngineer);
            ReusableMethods.waitFor(3);
            getCandidateHomePage().mlEngineer.click();
        } else if (arg0.equals("Data Engineer")) {
            ReusableMethods.waitFor(3);
            ReusableMethods.scrollToElement(getCandidateHomePage().dataEngineer);
            ReusableMethods.waitFor(3);
            getCandidateHomePage().dataEngineer.click();
        } else if (arg0.equals("Data Analyst")) {
            ReusableMethods.waitFor(3);
            ReusableMethods.scrollToElement(getCandidateHomePage().dataAnalyst);
            ReusableMethods.waitFor(3);
            getCandidateHomePage().dataAnalyst.click();
        } else if (arg0.equals("Business Analyst")) {
            ReusableMethods.waitFor(3);
            ReusableMethods.scrollToElement(getCandidateHomePage().businessAnalyst);
            ReusableMethods.waitFor(3);
            getCandidateHomePage().businessAnalyst.click();
        } else if (arg0.equals("Big Data Engineer")) {
            ReusableMethods.waitFor(3);
            ReusableMethods.scrollToElement(getCandidateHomePage().bigDataEngineer);
            ReusableMethods.waitFor(3);
            getCandidateHomePage().bigDataEngineer.click();
        }
    }

    @Then("user sees the candidate sign up page")
    public void user_sees_the_candidate_sign_up_page() {

        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(getCandidateHomePage().signUp);
    }


    @Given("user goes to homepage")
    public void user_goes_to_homepage() {
        driver.get(ConfigReader.getProperty("app_url"));
    }

    @When("user verifies that the page should go down")
    public void userVerifiesThatThePageShouldGoDown() {

        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

    }

    @Then("user verifies that contact are visible and clickable")
    public void userVerifiesThatContactAreVisibleAndClickable(DataTable dataTable) {
        List<String> contactListe = dataTable.column(0);
        for (int i = 0; i < getCandidateHomePage().contactSections.size(); i++) {
            Assert.assertEquals(contactListe.get(i), getCandidateHomePage().contactSections.get(i).getText());
            Assert.assertTrue(getCandidateHomePage().contactSections.get(i).isEnabled());


        }
    }
}
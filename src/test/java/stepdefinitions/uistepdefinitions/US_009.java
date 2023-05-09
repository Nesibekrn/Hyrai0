package stepdefinitions.uistepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.List;
import static stepdefinitions.Hooks.driver;

public class US_009 extends BasePage {

    @Given("user goes to company page")
    public void user_goes_to_company_page() {
        driver.get(ConfigReader.getProperty("baseUrlCompany"));

    }

    @When("user click on logo")
    public void user_click_on_logo() {
//        WebElement logo = driver.findElement(By.cssSelector(".navbar_gg10__2fDwo"));  kullanilmamasi gerekiyor

        getCandidateHomePage().navbarList.get(0).click();
    }

    @Then("assert link is {string}")
    public void assert_link_is(String expectedUrl) {
        String currentUrl = driver.getCurrentUrl();   // ctrl alt V

        ReusableMethods.waitFor(3);
        Assert.assertEquals(
                "\n \n" +
                        "expected was : " + expectedUrl + "\n" +
                        "actual is : " + currentUrl +
                        "\n \n"
                ,

                expectedUrl,
                currentUrl);

    }

    @When("user click on home icon")
    public void user_click_on_home_icon() {
        getCandidateHomePage().navbarList.get(1).click();


    }

    @When("user click on about")
    public void user_click_on_about() {
        getCandidateHomePage().navbarList.get(2).click();


    }

    @When("user click on contact us")
    public void user_click_on_contact_us() {
        getCandidateHomePage().navbarList.get(3).click();


    }

    @When("user click on for companies")
    public void user_click_on_for_companies() {
        getCandidateHomePage().navbarList.get(4).click();


    }

    @When("user click on sign up")
    public void user_click_on_sign_up() {
        getCandidateHomePage().navbarList.get(5).click();


    }

    @When("user click on login")
    public void user_click_on_login() {
        getCandidateHomePage().navbarList.get(6).click();
    }

    @When("user click on then assert")
    public void userClickOnThenAssert(DataTable dataTable) {
        List<String> index = dataTable.column(0);
        List<String> expectedUrl = dataTable.column(1);


        System.out.println("index = " + index);
        System.out.println("expectedUrl = " + expectedUrl);

        for (int i = 0; i < index.size(); i++) {
            // click
            int clickIndex = Integer.parseInt(index.get(i));
            getCandidateHomePage().navbarList.get(clickIndex).click();
            // wait
            ReusableMethods.waitFor(3);
            // assertion
            String currentUrl = driver.getCurrentUrl();   // ctrl alt V
            String expected = expectedUrl.get(i);

            Assert.assertEquals(expected, currentUrl);


        }


    }
}

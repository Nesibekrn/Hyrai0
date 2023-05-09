package stepdefinitions.uistepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BasePage;
import utilities.ReusableMethods;

import java.util.List;

import static stepdefinitions.Hooks.driver;

public class US_001 extends BasePage {

    @Then("Check that the URL redirects to the expected page")
    public void check_that_the_url_redirects_to_the_expected_page() {

        String expectedTitle =  "Hyrai";

        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }


    @When("user click on the button then assert")
    public void userClickOnTheButtonThenAssert(DataTable dataTable) {

        List<String> index = dataTable.column(0);
        List<String> expectedUrl = dataTable.column(1);


        System.out.println("index = " + index);
        System.out.println("expectedUrl = " + expectedUrl);

        for (int i = 0; i < index.size(); i++) {
            // click
            int clickIndex = Integer.parseInt(index.get(i));
            //ReusableMethods.waitForClickablility(getCandidateHomePage().navbarList2.get(clickIndex),2);
            getCandidateHomePage().navbarList2.get(clickIndex).click();
            // wait
            ReusableMethods.waitFor(1);
            // assertion
            String currentUrl = driver.getCurrentUrl();   // ctrl alt V
            String expected = expectedUrl.get(i);

            Assert.assertEquals(expected, currentUrl);



          if(i==6) {
              // getCandidateHomePage().navbarList2.get(5).click();
              driver.navigate().back();
          }

            }

        }

    }


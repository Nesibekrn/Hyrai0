package stepdefinitions.uistepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BasePage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class US_016_CompanySignUpStepDefinitions extends BasePage {
    @Then("user verifies company labels are visible")
    public void user_verifies_company_labels_are_visible() {
        // List<String> labels=dataTable.column(0);
        int size = getCompanySignUpPage().companyLabels.size();
        /*
        for (int i = 0; i < size-2; i++) {
           assertEquals(labels.get(i),getCompanySignUpPage().companyLabels.get(i).getText());
        }*/
        assertEquals("Company Name", getCompanySignUpPage().companyLabels.get(0).getText());
        assertEquals("Company Website", getCompanySignUpPage().companyLabels.get(1).getText());
        assertEquals("Work Email", getCompanySignUpPage().companyLabels.get(2).getText());
    }

    @Then("user verifies company inputbox are active")
    public void user_verifies_company_inputbox_are_active() {
        int size = getCompanySignUpPage().companyInputBoxes.size();
        for (int i = 0; i < size - 2; i++) {
            assertTrue(getCompanySignUpPage().companyInputBoxes.get(i).isEnabled());
        }
    }

    @Then("user fills out the company informations")
    public void user_fills_out_the_company_informations(DataTable dataTable) {
        List<String> companyInformation = dataTable.column(0);
        for (int i = 0; i < companyInformation.size(); i++) {
            getCompanySignUpPage().companyInputBoxes.get(i).sendKeys(companyInformation.get(i));
        }

    }

    @Then("user enters {string} Company Name box")
    public void user_enters_company_name_box(String companyName) {
        getCompanySignUpPage().companyInputBoxes.get(0).sendKeys(companyName+ Keys.ENTER);

    }

    @Then("user verifies {string} is visible")
    public void user_verifies_is_visible(String message) {
        assertEquals( message,getCompanySignUpPage().message.getText());
      //  assertEquals(message,getCompanySignUpPage().alertMessages.get(0).getText());
    }

    @Then("user enters {string} Company Website box")
    public void user_enters_company_website_box(String companyWebSite) {
        getCompanySignUpPage().companyInputBoxes.get(1).sendKeys(companyWebSite+Keys.ENTER);
    }


    @Then("user enters {string} Work Email box")
    public void user_enters_work_email_box(String workEmail) {
        //getCompanySignUpPage().workEmail.sendKeys(workEmail);
         getCompanySignUpPage().companyInputBoxes.get(2).sendKeys(workEmail+Keys.TAB);
       // getCompanySignUpPage().boxWorkEmail.sendKeys(workEmail);
    }


    @And("user fills out the company information")
    public void userFillsOutTheCompanyInformation(DataTable dataTable) {
        List<String> companyName = dataTable.column(0);
        List<String> companyWebSite = dataTable.column(1);
        List<String> workEmail = dataTable.column(2);
        List<String> numberOfMessage = dataTable.column(3);
        List<String> messages = dataTable.column(4);
        for (int i = 0; i < messages.size() - 2; i++) {
            getCompanySignUpPage().companyInputBoxes.get(i).sendKeys(companyName.get(i));
            getCompanySignUpPage().companyInputBoxes.get(i + 1).sendKeys(companyWebSite.get(i));
            // getCompanySignUpPage().companyInputBoxes.get(i + 2).sendKeys(workEmail.get(i));
            int alertMessageSize = (int) getCompanySignUpPage().alertMessages.size();
            assertEquals(Integer.parseInt(numberOfMessage.get(i)), alertMessageSize);

            String[] arr = messages.get(i).split(",");
            for (String alMes : arr) {
                ReusableMethods.waitFor(2);
                //   Assert.assertTrue(getCompanySignUpPage().alertMessages.stream().anyMatch(t -> t.getText().contains(alMes)));
            }

            ReusableMethods.clearValue(getCompanySignUpPage().companyInputBoxes.get(i));
            ReusableMethods.clearValue(getCompanySignUpPage().companyInputBoxes.get(i + 1));
            ReusableMethods.clearValue(getCompanySignUpPage().companyInputBoxes.get(i + 2));


        }

    }

}

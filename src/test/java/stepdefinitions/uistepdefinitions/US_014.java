package stepdefinitions.uistepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.BasePage;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;

import static stepdefinitions.Hooks.driver;

public class US_014 extends BasePage {
    @And("user clicks on Contact at the bottom of the page")
    public void userClicksOnContactAtTheBottomOfThePage() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, document.body.scrollHeight);");
        ReusableMethods.waitFor(3);
        JSUtils.clickWithJS(getCompanyHomePage().contactFooter);
//        commonPage.getCompanyPage().contactFooter.click();
    }

    @Then("user verifies address and contact information are visible")
    public void userVerifiesAddressAndContactInformationAreVisible() {
        Assert.assertTrue(getCompanyHomePage().address.isDisplayed());
        Assert.assertEquals("4701 Patrick Henry DrUnit 25 Santa Clara, CA 95054United States", getCompanyHomePage().address.getText().replaceAll("\n", ""));
        System.out.println(("4701 Patrick Henry Dr Unit 25 Santa Clara, CA 95054 United States\n" + getCompanyHomePage().address.getText().replaceAll("\n", "")));
        Assert.assertTrue(getCompanyHomePage().phone.isDisplayed());
        Assert.assertTrue(getCompanyHomePage().email1.isDisplayed());

    }

    @When("user fills out the contact us form")
    public void userFillsOutTheContactUsForm(DataTable dataTable) {
        List<String> firstName = dataTable.column(0);
        List<String> lastName = dataTable.column(1);
        List<String> email = dataTable.column(2);
        List<String> subject = dataTable.column(3);
        List<String> message = dataTable.column(4);
        List<String> numberOfMessage = dataTable.column(5);
     /*   List<Integer> noOfMessage = new ArrayList<>();
        for (int i = 0; i < numberOfMessage.size(); i++) {
            noOfMessage.add(Integer.parseInt(numberOfMessage.get(i)));
        }*/
        List<String> messages = dataTable.column(6);

        //tum senaryolarimizi denemek icin
        for (int i = 0; i < messages.size(); i++) {
            ReusableMethods.scrollToElement(getCompanyHomePage().firstName);
            getCompanyHomePage().firstName.sendKeys(firstName.get(i));
            getCompanyHomePage().lastName.sendKeys(lastName.get(i));
            ReusableMethods.scrollToElement(getCompanyHomePage().email);
            getCompanyHomePage().email.sendKeys(email.get(i));
            getCompanyHomePage().subject.sendKeys(subject.get(i));
            ReusableMethods.scrollToElement(getCompanyHomePage().message);
            getCompanyHomePage().message.sendKeys(message.get(i));
//            commonPage.getContactPage().sendMessage.click();
            JSUtils.clickWithJS(getCompanyHomePage().sendMessage);
            Assert.assertEquals(Integer.parseInt(numberOfMessage.get(i)), (int) getCompanyHomePage().alertMessages.size());

            String[] arr = messages.get(i).split(",");
            for (String alMes : arr) {
                Assert.assertTrue(getCompanyHomePage().alertMessages.stream().anyMatch(t -> t.getText().contains(alMes)));
            }

            ReusableMethods.clearValue(getCompanyHomePage().firstName);
            ReusableMethods.clearValue(getCompanyHomePage().lastName);
            ReusableMethods.clearValue(getCompanyHomePage().email);
            ReusableMethods.clearValue(getCompanyHomePage().subject);
            ReusableMethods.clearValue(getCompanyHomePage().message);

        }

    }

    @When("user clicks on For Companies button")
    public void userClicksOnForCompaniesButton() {
        getCandidateHomePage().btn_forCompanies.click();
    }


    @When("user fills out the contact us form successfully")
    public void userFillsOutTheContactUsFormSuccessfully() {
        getCompanyHomePage().firstName.sendKeys("aaa");
        getCompanyHomePage().lastName.sendKeys("aaa");
        getCompanyHomePage().email.sendKeys("aaaaa@aaaa.aaa");
        getCompanyHomePage().subject.sendKeys("aaaaaaaaaaaaaaaaa");
        getCompanyHomePage().message.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        JSUtils.clickWithJS(getCompanyHomePage().sendMessage);
    }

    @Then("user verifies toast message is visible")
    public void userVerifiesToastMessageIsVisible() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getCompanyHomePage().toastMessage.isDisplayed());
        Assert.assertEquals("Your message has been sent successfully", getCompanyHomePage().toastMessage.getText());
    }

    @DataTableType(replaceWithEmptyString = "[blank]")
    public String stringType(String cell) {
        return cell;
    }

}

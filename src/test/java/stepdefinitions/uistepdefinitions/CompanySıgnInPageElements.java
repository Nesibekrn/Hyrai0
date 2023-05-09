package stepdefinitions.uistepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

import static stepdefinitions.Hooks.driver;

public class CompanySıgnInPageElements extends BasePage {
    @Then("user verifies that texts are visible")
    public void userVerifiesThatTextsAreVisible(DataTable dataTable) {
        List<String> textsList=dataTable.column(0);
        for (String text:textsList) {
            WebElement element=driver.findElement(By.xpath("//*[text()='"+text+"']"));
            Assert.assertTrue(element.isDisplayed());
        }

    }

    @Then("user verifies that Sign In \\(Tab) are clickable")
    public void userVerifiesThatSignInTabAreClickable() {
        Assert.assertTrue(getCompanySignInPage().tab_signIn.isEnabled());

    }

    @Then("user verifies that Sign Up \\(Tab) are clickable")
    public void userVerifiesThatSignUpTabAreClickable() {
        Assert.assertTrue(getCompanySignInPage().tab_signUp.isEnabled());
    }

    @Then("user verifies that gmail icon,github icon,linkedIn icon are clickable")
    public void userVerifiesThatGmailIconGithubIconLinkedInIconAreClickable() {
        for (int i = 0; i <getCompanySignInPage().socialMediaIcons.size() ; i++) {
            Assert.assertTrue(getCompanySignInPage().socialMediaIcons.get(i).isEnabled());
        }

    }

    @Then("user verifies that Forget Password are clickable")
    public void userVerifiesThatForgetPasswordAreClickable() {
        Assert.assertTrue(getCompanySignInPage().link_forget_password.isEnabled());
    }

    @Then("user verifies that Sign In \\(Button) are clickable")
    public void userVerifiesThatSignInButtonAreClickable() {
        Assert.assertTrue(getCompanySignInPage().btn_signin.isEnabled());
    }
}

package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;

import static stepdefinitions.Hooks.driver;

public class ForCompaniesLink {
    @Then("user verifies that {string} url is visible")
    public void userVerifiesThatUrlIsVisible(String url) {
        Assert.assertEquals(url,driver.getCurrentUrl());
    }
}

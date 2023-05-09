package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_014_StepDefinations {

        @Then("go to the end of the page")
        public void goToTheEndOfThePage() {
        }

        @And("click the Contact button")
        public void clickTheContactButton() {
        }

        @Then("Contact us page open")
        public void contactUsPageOpen() {
        }

        @And("verify the text information under the Address as {string}")
        public void verifyTheTextInformationUnderTheAddressAs(String arg0) {
        }

        @And("verify the text information under the Contact Info as Phone :\\({int}) {int}{int} Email :contact@hyrai.com")
        public void verifyTheTextInformationUnderTheContactInfoAsPhoneEmailContactHyraiCom(int arg0, int arg1, int arg2) {
        }

        @And("fill out the required fields on First Name, Last Name, Email, Subject, Message")
        public void fillOutTheRequiredFieldsOnFirstNameLastNameEmailSubjectMessage() {
        }

        @And("verify a a warning message as {string} if I left blank any required fields")
        public void verifyAAWarningMessageAsIfILeftBlankAnyRequiredFields(String arg0) {
        }

        @And("verify wheter enter at least {int} characters in the Subject box")
        public void verifyWheterEnterAtLeastCharactersInTheSubjectBox(int arg0) {
        }

        @And("verify a warning message as {string} when I enter less than {int} characters in the Subject box")
        public void verifyAWarningMessageAsWhenIEnterLessThanCharactersInTheSubjectBox(String arg0, int arg1) {
        }

        @And("verify wheter enter at least {int} characters in the Message box")
        public void verifyWheterEnterAtLeastCharactersInTheMessageBox(int arg0) {
        }

        @And("verify a warning message as {string} when I enter less than {int} characters in the Message box")
        public void verifyAWarningMessageAsWhenIEnterLessThanCharactersInTheMessageBox(String arg0, int arg1) {
        }

        @Then("verify enter only consist of letter without spaces in the First Name box")
        public void verifyEnterOnlyConsistOfLetterWithoutSpacesInTheFirstNameBox() {
        }

        @When("enter numbers in the First Name box and the test shouldn't pass")
        public void enterNumbersInTheFirstNameBoxAndTheTestShouldnTPass() {
        }

        @When("enter letter with spaces in the First Name box and the test shouln't pass")
        public void enterLetterWithSpacesInTheFirstNameBoxAndTheTestShoulnTPass() {
        }

        @When("enter numbers in the Last Name box and the test shouldn't pass")
        public void enterNumbersInTheLastNameBoxAndTheTestShouldnTPass() {
        }

        @When("enter letter with spaces in the Last Name box and the test shouln't pass")
        public void enterLetterWithSpacesInTheLastNameBoxAndTheTestShoulnTPass() {
        }

        @And("enter email id and should contain {string} and {string}")
        public void enterEmailIdAndShouldContainAnd(String arg0, String arg1) {
        }

        @When("enter email id without contain {string} and {string}, the test shouldn't pass")
        public void enterEmailIdWithoutContainAndTheTestShouldnTPass(String arg0, String arg1) {
        }

        @And("verify whether the {string} clickable")
        public void verifyWhetherTheClickable(String arg0) {
        }

        @And("see the notification as {string} when sent the message")
        public void seeTheNotificationAsWhenSentTheMessage(String arg0) {
        }
    }



package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.*;
import pages.BasePage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class FrequentlyAskedQuestionsStepDefs extends BasePage {

    @When("user scrolls down to Frequently Asked Questions")
    public void user_scrolls_down_to_frequently_asked_questions() {
        ReusableMethods.scrollToElement(getCompanyHomePage().header_frequentlyAskedQuestions);

    }

    @Then("user verifies Frequently Asked Questions header is displayed")
    public void user_verifies_frequently_asked_questions_header_is_displayed() {
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(getCompanyHomePage().header_frequentlyAskedQuestions);

    }

    @And("User verifies Why Hyrai? question is present on the page")
    public void userVerifiesWhyHyraiQuestionIsPresentOnThePage() {
        ReusableMethods.verifyElementDisplayed(getFrequentlyAskedQuestionsPage().btn_firstQuestion);
    }

    @And("User verifies Is Hyrai staffing agency? question is present on the page")
    public void userVerifiesIsHyraiStaffingAgencyQuestionIsPresentOnThePage() {
        ReusableMethods.verifyElementDisplayed(getFrequentlyAskedQuestionsPage().btn_secondQuestion);
    }

    @And("User verifies Can I hire contractors through Hyrai? question is present on the page")
    public void userVerifiesCanIHireContractorsThroughHyraiQuestionIsPresentOnThePage() {
        ReusableMethods.verifyElementDisplayed(getFrequentlyAskedQuestionsPage().btn_thirdQuestion);
    }

    @Then("User verifies Do you provide F{int}F interview platform? question is present on the page")
    public void userVerifiesDoYouProvideFFInterviewPlatformQuestionIsPresentOnThePage(int arg0) {
        ReusableMethods.verifyElementDisplayed(getFrequentlyAskedQuestionsPage().btn_fourthQuestion);
    }

    @Then("User verifies Why Hyrai? question is clickable on the page")
    public void userVerifiesWhyHyraiQuestionIsClickableOnThePage() {
        assertTrue(getFrequentlyAskedQuestionsPage().btn_firstQuestion.isEnabled());
    }

    @Then("User clicks Why Hyrai? question and verifies the answer is displayed")
    public void userClicksWhyHyraiQuestionAndVerifiesTheAnswerIsDisplayed() {
        getFrequentlyAskedQuestionsPage().btn_firstQuestion.click();
        ReusableMethods.verifyElementDisplayed(getFrequentlyAskedQuestionsPage().lbl_firstAnswer);
    }

    @Then("user clicks Is Hyrai staffing agency? question and verifies the answer is displayed")
    public void userClicksIsHyraiStaffingAgencyQuestionAndVerifiesTheAnswerIsDisplayed() {
        ReusableMethods.waitForClickablility(getFrequentlyAskedQuestionsPage().btn_secondQuestion,5);
        getFrequentlyAskedQuestionsPage().btn_secondQuestion.click();
        ReusableMethods.verifyElementDisplayed(getFrequentlyAskedQuestionsPage().lbl_secondAnswer);
    }

    @And("User clicks Can I hire contractors through Hyrai? question and verifies the answer is displayed")
    public void userClicksCanIHireContractorsThroughHyraiQuestionAndVerifiesTheAnswerIsDisplayed() {
        getFrequentlyAskedQuestionsPage().btn_thirdQuestion.click();
        ReusableMethods.verifyElementDisplayed(getFrequentlyAskedQuestionsPage().lbl_thirdAnswer);
    }

    @Then("User clicks Do you provide F{int}F interview platform? question and verifies the answer is displayed")
    public void userClicksDoYouProvideFFInterviewPlatformQuestionAndVerifiesTheAnswerIsDisplayed(int arg0) {
        getFrequentlyAskedQuestionsPage().btn_fourthQuestion.click();
        ReusableMethods.verifyElementDisplayed(getFrequentlyAskedQuestionsPage().lbl_fourthAnswer);
    }


}

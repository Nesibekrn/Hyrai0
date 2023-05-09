@US11 @UI
Feature: Frequently Asked Questions

  Background:
    Given user goes to homepage
    When user clicks For Companies button
    And user scrolls down to Frequently Asked Questions

  @US11_TC01
  Scenario: US11_TC01_Frequently_Asked_Questions_header_must_be_displayed
    Then user verifies Frequently Asked Questions header is displayed

  @US11_TC02
  Scenario: US11_TC02_All_questions_must_be_displayed
      And User verifies Why Hyrai? question is present on the page
      And User verifies Is Hyrai staffing agency? question is present on the page
      And User verifies Can I hire contractors through Hyrai? question is present on the page
      Then User verifies Do you provide F2F interview platform? question is present on the page

    @US11_TC03
    Scenario: US11_TC03_All_questions_must_be_clickable
      Then User verifies Why Hyrai? question is clickable on the page

    @US11_TC04
    Scenario: US11_TC04_All_questions_must_be_clickable
      Then User clicks Why Hyrai? question and verifies the answer is displayed

    @US11_TC05
    Scenario: US11_TC05_All_Is_Hyrai_staffing_agency?_question_must_be_viewable
      Then user clicks Is Hyrai staffing agency? question and verifies the answer is displayed

    @US11_TC06
    Scenario: US11_TC06_All_Can_I_hire_contractors_through_Hyrai?_question_must_be _viewable
      And User clicks Can I hire contractors through Hyrai? question and verifies the answer is displayed

    @US11_TC07
    Scenario: US11_TC07_All_Do_you_provide_F2F_interview_platform?_question_must_be_viewable
      Then User clicks Do you provide F2F interview platform? question and verifies the answer is displayed
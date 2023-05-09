@candidateLogin @UI
Feature: Login

  Background:
    Given user is on homepage

#  @login_as_candidate @UI
#  Scenario: Login_as_candidate
#    When user login with "candidate_username"
#    Then verify your profile field is displayed
#
#  @login_as_company @UI
#  Scenario: Login_as_company
#    When user clicks for companies button
#    When user login with "company_username"
#    Then verify hire button is displayed

  @loginWithInvalidFormatEmail @UI
  Scenario: TC001_User_must_not_be_able_to_login_with_an_email_in_invalid_format
    When user clicks Login button
    And user submits an email in invalid format
    Then user verifies Invalid email message is present
    And user submits a valid password
    Then user verifies Invalid email message is present

  @loginWithInvalidFormatEmail2 @UI
  Scenario: TC002_User_must_not_be_able_to_login_with_an_email_in_invalid_format_2
    When user clicks Login button
    And user submits an email in another invalid format
    Then user verifies Invalid email message is present
    And user submits a valid password
    Then user clicks Sign In button
    Then user verifies Invalid email message is present

  @loginWithInvalidEmail @UI
  Scenario: TC003_User_must_not_be_able_to_login_with_an_invalid_email
    When user clicks Login button
    And user submits an invalid email
    And user submits a valid password
    Then user clicks Sign In button
    Then user verifies Wrong Credentials message is present

  @loginWithInvalidPassword @UI
  Scenario: TC003_User_must_not_be_able_to_login_with_an_invalid_email
    When user clicks Login button
    And user submits a valid email
    And user submits an invalid password
    Then user clicks Sign In button
    Then user verifies Wrong Credentials message is present

  @successfulLogin @UI
  Scenario: TC003_User_must_not_be_able_to_login_with_an_invalid_email
    When user clicks Login button
    And user submits a valid email
    And user submits a valid password
    Then user clicks Sign In button
    Then verify that user is on candidate dashboard page
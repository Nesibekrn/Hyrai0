@US021 @UI
Feature: US021

    Background:
    Given user goes to homepage
    When user clicks on For Companies button
    Then user clicks on login link


  Scenario: @US021_TC01 @UI
    Then user enters invalid value into email box
    Then user enters valid value into password box
    Then user clicks on sign in button
   Then User verifies Email or password is not valid! is displayed.

  Scenario: US021_TC02
    When User insert a valid email .
    And User inserts an invalid password.
    Then user clicks on sign in button
    #Then User should verify Wrong credentials! Are you trying to login as a company is displayed.
    Then User verifies Email or password is not valid! is displayed.

  Scenario:US021_TC03
    Then user enters invalid value into email box
    And User inserts an invalid password.
    Then user clicks on sign in button
    Then User verifies Email or password is not valid! is displayed.
    Then User verifies the Forgot Password link visible


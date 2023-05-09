Feature: US_008 As a user, I should be able to click the For Companies link on the Home page
@UI @US_008
  Scenario: US_008 As a user, I should be able to click the For Companies link on the Home page
  Given user goes to homepage
  When user clicks on For Companies button
  Then user verifies that "https://hyrai.com/company" url is visible

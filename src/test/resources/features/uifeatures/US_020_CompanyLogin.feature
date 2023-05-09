@US020 @UI
Feature:US_020

  Background:
    Given User goes on homepageee
    Then user clicks For Company button.
    Then User clicks login buttonn.
    Then user verifies that the page should go down

  @US20_TC01 @UI
    Scenario:US_020_TC01
      Then User verifies the Forgot Password link visible
      Then User clicks the Forgot Password Link

  @US20_TC02 @UI
    Scenario:US_020-TC02
      When User verifies the Forgot Password link visible
      Then User clicks the Forgot Password Link
      Then User verifies the text Please verify your Email is displayed.


  @US20_TC03 @UI
    Scenario:US_020-TC03
      When User verifies the Forgot Password link visible
      Then User clicks the Forgot Password Link
      Then User verifies the email input box insert text.

  @US20_TC04 @UI
    Scenario:US_020-TC04
      When User verifies the Forgot Password link visible
      Then User clicks the Forgot Password Link
      Then User clicks Verify Email button.

  @US20_TC05 @UI
      Scenario:US_020-TC05
        When User verifies the Forgot Password link visible
        Then User clicks the Forgot Password Link
        #Then User clicks the email box
        And User types a valid email to email box.
        Then User clicks Verify Email button.
        #Then User verifies Email verification was successful, please check your e-mail address. Text must be visible.





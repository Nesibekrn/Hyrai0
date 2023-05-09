#  1-"Password" text must be visible.
#  2-"Password" input must be active.
#  3- When "Password" is left blank, "This field is required" warning should be given.
#  4-"Password" must be at least 6 characters long.
#  5- If "Password" is less than 6 characters, "Must be at least 6 characters" should warn
#  6-"Confirm Password" text should be visible.
#  7-"Confirm Password" input must be active.
#  8-When "Confirm Password" is left blank, "This field is required" warning should be given.
#  9- "Passwords must match" warning should be received when "Confirm Password" incorrect password is entered

@US017 @UI
Feature: :As a user,  I must be able to register with valid credentials on the
  Company SIGN UP page (https://hyrai.com/company/auth?tab=SIGN_UP)
  Background: User goes to related url
    Given user goes to homepage
    Then user clicks For Companies button
    Then user clicks Sign Up button
    Then User enters valid value for Company Name box
    Then User enters valid value for Company Website box
    Then User enters valid value for Work Email box


  @UI
  Scenario Outline: User verifies getting warning message Password
    When User verifies password text is visible
    Then User verifies password input is active
    Then User enters "<Password>" passeword box
    And User verifies "<Message>" is visible
    Examples:
      |Password     |Message                          |
      |             |❗ This field is required       |
      |abcd0        |❗ Must be at least 6 characters  |

  @Ui
  Scenario Outline: User checks for warning message for password box
    Then User enters valide value for password box
    Then User verifies Confirm password text is visible
    Then User verifies Confirm password text is active
    Then User enters "<Confirm Password>" for Confirm Password box
    And User verifies "<Message>" is visible
    Examples:
      |Confirm Password    |Message                    |
      |                    |❗ This field is required |
      |abc123              |❗ Passwords must match    |


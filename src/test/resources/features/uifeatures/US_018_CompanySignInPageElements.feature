#1-"Company" text must be visible.
#2- "Sign In" button must be active.
#3- "Sign In" text must be visible
#4-"Email" text must be visible.
#5-"Password" text must be visible.
#6-"Sign Up" button must be clickable.
#7-The "gmail icon" should be clickable.
#8-"github icon" must be clickable.
#9-"linkedIn icon" must be clickable
#10-"Forget Password" must be clickable.
#11- "Sign In" button must be clickable.
Feature: US_018 As a user, on the Company SIGN IN page ( https://hyrai.com/auth?tab=SIGN_IN ) I should be able to see
  and click the "Company" text and other buttons

  @UI @US_018
  Scenario: US_018 As a user, on the Company SIGN IN page ( https://hyrai.com/auth?tab=SIGN_IN ) I should be able to
  see and click the "Company" text and other buttons
    Given user goes to homepage
    When user clicks on For Companies button
    And user click on login
    Then user verifies that texts are visible
      | Company  |
      | Sign In  |
      | Email    |
      | Password |
    Then user verifies that Sign In (Tab) are clickable
    Then user verifies that Sign Up (Tab) are clickable
    Then user verifies that gmail icon,github icon,linkedIn icon are clickable
    Then user verifies that Forget Password are clickable
    Then user verifies that Sign In (Button) are clickable
#1-"Email" input must be active.
#2-"Password" input must be active
#3-Forget Password" must be clickable.
#4-Sign In" Button must be clickable.
#5-When Valid Information is Entered, " https://hyrai.com/company/hire " Page should be accessible

Feature: US_019
 @US019 @UI @firefox
  Scenario: US_019_TC01
   Given user is on homepage
   Then user clicks for companies button
   Then user clicks Login link
   Then user verifies that email box is active
   Then user verifies that Password box is active
   Then user verifies that Forget Password link is active
   Then user verifies that Sign In button is active
   When user enters valid information in email and Password box
   Then user verifies "https://hyrai.com/company/hire" page is visible



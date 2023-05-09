@UI
Feature: US_015

  Background:
    Given User is on homepage
    Then user clicks for companies button
@TC001
 Scenario: "Company" text must be visible
   Then User see and click "sign up" button
   And User see "Company" text middle of page

@TC002
Scenario: "Sign Up" button must be active
  Then Verify the "Sign Up" button

@TC003
Scenario: "Sign Up" text must be visible
  Then User see and click "sign up" button
  And User see the "sign up" text middle of page

@TC004
Scenario: The "Sign In" button must be clickable
  Then User see and click "sign up" button
  And User check the clickable for "Sign in" button

@TC005
Scenario: The "gmail icon" must be clickable
  Then User see and click "sign up" button
  Then User see and click "gmail icon"


@TC006
Scenario: "github icon" should be clickable
  Then User see and click "sign up" button
  Then User see and click "github" icon
 # And User see the "github" page after click  "github icon"

@TC007
Scenario: "linkedIn icon" must be clickable
  Then User see and click "sign up" button
  Then User see and click "linkedIn" icon.
 # And User should see the "linkedIn" page after click the button

@TC008
Scenario: "Your personal data will be used to support your experience throughout this website,to manage access to your account, and for other purposes described in our privacy policy."text must be visible
  Then User see and click "sign up" button
  Then User should see "Your personal data will be used to support your experience throughout this website,to manage access to your account and for other purposes described in our privacy policy." under page

@TC009
Scenario: "Sign Up as a Candidate" should be clickable
  Then User see and click "sign up" button
  Then User should see and click "Sign Up as a Candidate" button
  Then User should see the "Candidate "page after click the button

@TC010
Scenario: "Sign Up" button must be clickable.
  Then User see and click "sign up" button
  Then User should click "Sign Up" button under page
  And User should see "❗ This field is required" text under all fields after click "Sign Up button

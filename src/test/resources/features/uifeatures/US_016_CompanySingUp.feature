#1-"Company Name" must be visible.1-"Company Name" must be visible.
#2- "Company Name" input must be active.
#3- When "Company Name" is left blank, "This field is required" should be given.
#3- "Company Name" must be at least 2 letters long.
#4- "Company Name" less than 2 letters "Must be at least 2 characters" should warn
#5-"Company Website" text must be visible.
#6- "Company Website" input must be active.
#7-When "Company Website" is left blank, "This field is required" should be given.
#8- URL address must be entered in "Company Website".
#9- If URL address is not entered in "Company Website", "Enter correct url!" should warn
#10-"Email" text must be visible.
#11-"Work Email" input must be active.
#12-When "Work Email" is left blank, "This field is required" warning should be given.
#13-"Work Email" must contain "@" character.
#14- "Work Email" does not contain "@" character, it should give "Invalid e-mail" warning

@fatma @UI
Feature: US016

  Background:
    Given user is on homepage
    When user clicks for companies button
    Then user clicks Sign Up button

  @UI
  Scenario: US016 - TC01-positive case
    And user verifies company labels are visible
    * user verifies company inputbox are active
    * user fills out the company informations
      | AFG Consultancy               |
      | https://afgitconsultancy.com/ |
      | afgitconsultancy@gmail.com    |
 # @UI
  #Scenario: US016 - TC02 - negative case
   # And user fills out the company information
      #| CN | CW         | WE            | #message | message                                                                   |
    #  | \n | \n         | \n            | 5        | This field is required                                                    |
    #  | a  | \n         | \n            | 5        | This field is required,Must be at least 2 characters                      |
     # | a  | aa         | \n            | 5        | This field is required,Must be at least 2 characters  ,Enter correct url! |
    #  | aa | aa         | afg           | 5        | Enter correct url!,Invalid e-mail                                         |
    #  | \n | https://aa | afg@gmail.com | 3        | This field is required                                                    |
    #  | a  | https://aa | \n            | 5        | This field is required,Must be at least 2 characters                      |
  @UI
  Scenario Outline: US016 -TC02 - Negative case
    And user enters "<Company Name>" Company Name box
    * user enters "<Company Website>" Company Website box
    * user enters "<Work Email>" Work Email box
    * User enters "<Password>" passeword box
    * User enters "<Confirm Password>" for Confirm Password box
    * user verifies "<Message>" is visible
    Examples:
      | Company Name | Company Website               | Work Email     | Password | Confirm Password | Message                         |
      |              | af                            | aafg@gmail.com | abcdef   | abcdef           | ❗ This field is required        |
      | af           |                               | aafg@gmail.com | abcdef   | abcdef           | ❗ This field is required        |
      | af           | https://afgitconsultancy.com/ |                | abcdef   | abcdef           | ❗ This field is required        |
      | a            | https://afgitconsultancy.com/ | aafg@gmail.com | abcdef   | abcdef           | ❗ Must be at least 2 characters |
      | afg          | afgit                         | aafg@gmail.com | abcdef   | abcdef           | ❗ Enter correct url!            |
      | afg          | https://afgitconsultancy.com/ | afg            | abcdef   | abcdef           | ❗ Invalid e-mail                |










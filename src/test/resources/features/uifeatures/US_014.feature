
Feature: As a user I should be able to see the contact information when I click contact.
When I want to send a message fill in the required fields and
I should be able to successfully send a message to the system.

Background: Given I'm on the home page

  Scenario:US014_TC01 The user should be able to read the address and contact information
    Then go to the end of the page
    And click the Contact button
    Then Contact us page open
    And verify the text information under the Address as "4701 Patrick Henry Dr Unit 25 Santa Clara, CA 95054 United States"
    And verify the text information under the Contact Info as Phone :(480) 508-4475 Email :contact@hyrai.com

  Scenario:US014_TC02 You should fill in the required fields to write a message, and receive a warning
    And fill out the required fields on First Name, Last Name, Email, Subject, Message
    And verify a a warning message as "This field is required" if I left blank any required fields
    And verify wheter enter at least 10 characters in the Subject box
    And verify a warning message as "Must be at least 10 characters" when I enter less than 10 characters in the Subject box
    And verify wheter enter at least 20 characters in the Message box
    And verify a warning message as "Must be at least 20 characters" when I enter less than 20 characters in the Message box

  Scenario:US014_TC03 The name part should only consist of letters and no spaces.
    Then verify enter only consist of letter without spaces in the First Name box
    When enter numbers in the First Name box and the test shouldn't pass
    When enter letter with spaces in the First Name box and the test shouln't pass

  Scenario:US014_TC04 Last Name part should consist of only letters and no spaces
    When enter numbers in the Last Name box and the test shouldn't pass
    When enter letter with spaces in the Last Name box and the test shouln't pass
    When enter letter with spaces in the Last Name box and the test shouln't pass

  Scenario:US014_TC05 email id is "@" and "." should contain the system should warn if the user does not use them
    And enter email id and should contain "@" and "."
    When enter email id without contain "@" and ".", the test shouldn't pass

  Scenario:US014_TC06 Send message must be clickable. Notification about message when user clicks. The system should send the message "your message has been sent successfully
    And verify whether the "Send Message" clickable
    And see the notification as "Your messag has been sent successfully" when sent the message


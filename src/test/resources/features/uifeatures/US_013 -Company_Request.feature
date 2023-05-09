@US013 @UI
Feature: US_13

  Background:
    Given user is on the company homepage
    Given user clicks For Companies button
    Given go to the Source qualified candidates section of the page

  @US13_TC01
  Scenario: TC1_User clicks on the request demo the system will display the page.
    Then user clicks the REQUEST A DEMO button
    Then user verifies Request a Demo


  @US13_TC02
  Scenario: TC2_User open a text box asking for email and company name and the user should fill in the requested information.
    Then user clicks is the Subscribe now button
    And user writes company name box
    And user writes email
    Then user clicks Continue button
    And user clicks the I read and agree with the terms and conditions box
    Then User clicks is SubscribeSubmit button
    Then user verifies Log in to PayPal

  @US13_TC03
  Scenario: TC3_User after the requested information is filled, the user should see the payment method.
    Then user clicks is the Subscribe now button
    And user writes company name box
    And user writes email
    Then user clicks Continue button
    And user clicks the I read and agree with the terms and conditions box
    Then User clicks is SubscribeSubmit button
    Then user verifies Log in to PayPal
    Then the user writes is the email
    And user clicks is in the SubscribeNext button
    Then user verifies the payment method


 # Scenario: TC4_User filling card information or PayPal information,it should be able to press agree&subscribe

    #Then User fill in card information
    #And User clicks the agree&subscribe button


 # Scenario: TC5_User whether the payment has been made and send invoice information as an e-mail.

    #Then User fill in card information
    #And User clicks the agree&subscribe button
    #Then User see invoice information as an e-mail
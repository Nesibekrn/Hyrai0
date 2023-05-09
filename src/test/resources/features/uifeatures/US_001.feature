Feature: US001

  Background:
    Given user goes to homepage

  @UI @US01_TC01
  Scenario: TC1

    Then Check that the URL redirects to the expected page

  @UI @firefox @US=01_TC02
  Scenario: TC2
    Then Check that the URL redirects to the expected page

  @UI @US01_TC03
  Scenario: As a user, when I enter the company page web elements at the top must be clickable
    When user click on the button then assert
      | 0 | https://hyrai.com/                         |
      | 1 | https://hyrai.com/                         |
      | 2 | https://hyrai.com/                         |
      | 3 | https://hyrai.com/about-us                 |
      | 4 | https://hyrai.com/contact-us               |
      | 5 | https://hyrai.com/company                  |
      | 6 | https://hyrai.com/company/auth?tab=SIGN_UP |
      | 7 | https://hyrai.com/company/auth?tab=SIGN_IN  |










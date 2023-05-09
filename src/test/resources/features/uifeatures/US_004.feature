@US_004 @UI
Feature: US_004 As a user, I should be able to navigate to visitor websites on the homepage

  Background:
    Given user is on homepage
  @US_004 @UI
  Scenario Outline: Verifying the following logos are clickable under the main image on the main page
    Then user verifies the "<logoName>" logo is clickable

    Examples:
      |logoName|
      |facebook|
      |twitter |
      |linkedin|

  @US_004 @UI
  Scenario Outline: After clicking the following logos, user should be taken to the relevant page
    When user clicks "<logoName>" button
    Then user is on "<logoName>" page
    Examples:
      |logoName|
      |facebook|
      |twitter |
      |linkedin|

  @US_004 @UI
  Scenario: Verifying the following titles are clickable under the Begin your evaluation process now on homepage
    Then user verifies the tile is clickable
      |Data Scientist   |
      |ML Engineer      |
      |Data Engineer    |
      |Data Analyst     |
      |Business Analyst |
      |Big Data Engineer|

  @US_004 @UI
  Scenario Outline: After clicking the following titles, user should be see the candidate sign up page
    When user clicks "<titleName>" title
    Then user sees the candidate sign up page
    Examples:
      |titleName        |
      |Data Scientist   |
      |ML Engineer      |
      |Data Engineer    |
      |Data Analyst     |
      |Business Analyst |
      |Big Data Engineer|



# When the page is opened, the logo of the page should be able to be seen without any problems.
#When the page is opened, the message on the main page should be seen
#Message on page: Progress your career with AI powered standardized assessment system
#When the page is opened, the pictures, graphics and designs used should be able to be seen without any problems.


@UI
Feature:US002 Homepage design of the page

  User story: As a user, when I go to the home page the page should open completely
              and there should be no problem with the design of the page



 Background:user is on homepage




    Given user is on homepage

  @Design
  Scenario:US002_TC01 Homepage designs
    And  user should be able to be see the logo of the page without any problems
    Then user sees the message "Progress your career with AI powered standardized assessment system"
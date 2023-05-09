@UI
  @pageNav
Feature:US003 Page navigation

  Scenario: TC001_should_navigate_to_other_pages_from_homepage
    Given user goes to homepage
    When user clicks sign up button

  Scenario: TC002_return_homepage_when_the_logo_or_home_icon_is_clicked
    Given user goes to candidate homepage
    When user clicks on logo
    Then user clicks on home icon

  Scenario: TC003_About/ContactUs/ForCompanies/ForCandidates/Login_submenus_should_be_accessible
    Given user goes to homepage
    Then user clicks on about
    Then user clicks on contact us
    Then user clicks on for companies
    Given user goes to company home page
    Then user clicks on for candidates
    Then user clicks on login

    Scenario: TC004_User_returns_to_homepage_by_clicking_Hyrai_word_next_to_the_logo
      Given user goes to homepage
      Then user clicks on the word Hyrai












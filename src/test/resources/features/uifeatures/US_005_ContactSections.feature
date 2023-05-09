Feature: US005

  @US005
  @UI
  Scenario:TC01
    Given user goes to homepage
    When user verifies that the page should go down
    Then user verifies that contact are visible and clickable
      | About Us         |
      | Contact          |
      | Privacy Policy   |
      | Terms of Service |





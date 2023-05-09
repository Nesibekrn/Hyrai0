@US010 @UI
Feature: As a user, I should be able to click the LEARN MORE button and create a record by entering valid information.

  Background:
    Given user goes to homepage
    And User clicks on learn more button

  @H1-107
  Scenario: TC1
    Then User verifies that "Name" input box is visible

  @H1-108
  Scenario: TC2
    Then User verifies that "Name" input box is enabled

  @H1-109
  Scenario: TC3
    When User clicks on the Request a Demo button
    Then This field is required text is displayed below the "Name" input box.

  @H1-110
  Scenario: TC4
    When User enters "J" into the Name input box
    And User enters "ABC Ltd." into the Company input box
    And User enters "Director" into the Title input box
    And User enters "0123456789" into the Phone Number input box
    And User enters "john@abc.com" into the Email input box
    And User clicks on the Request a Demo button
    Then User verifies your request has been submit.. message is not displayed

  @H1-111
  Scenario: TC5
    When User enters "J" into the Name input box
    And User clicks on the Request a Demo button
    Then Must be at least 2 characters text is displayed

  @H1-112
  Scenario: TC6
    Then User verifies that "Company" input box is visible

  @H1-113
  Scenario: TC7
    Then User verifies that "Company" input box is enabled

  @H1-114
  Scenario: TC8
    When User clicks on the Request a Demo button
    Then This field is required text is displayed below the "Company" input box.

  @H1-115
  Scenario: TC9
    When User enters "John" into the Name input box
    And User enters "A" into the Company input box
    And User enters "Director" into the Title input box
    And User enters "0123456789" into the Phone Number input box
    And User enters "john@abc.com" into the Email input box
    And User clicks on the Request a Demo button
    Then User verifies your request has been submit.. message is not displayed

  @H1-116
  Scenario: TC10
    When User enters "A" into the Company input box
    And User clicks on the Request a Demo button
    Then Must be at least 2 characters text is displayed

  @H1-117
  Scenario: TC11
    Then User verifies that "Title" input box is visible

  @H1-118
  Scenario: TC12
    Then User verifies that "Title" input box is enabled

  @H1-119
  Scenario: TC13
    When User clicks on the Request a Demo button
    Then This field is required text is displayed below the "Title" input box.

  @H1-120
  Scenario: TC14
    When User enters "John" into the Name input box
    And User enters "ABC Ltd." into the Company input box
    And User enters "D" into the Title input box
    And User enters "0123456789" into the Phone Number input box
    And User enters "john@abc.com" into the Email input box
    And User clicks on the Request a Demo button
    Then User verifies your request has been submit.. message is not displayed

  @H1-121
  Scenario: TC15
    When User enters "D" into the Title input box
    And User clicks on the Request a Demo button
    Then Must be at least 2 characters text is displayed

  @H1-122
  Scenario: TC16
    Then User verifies that "Phone Number" input box is visible

  @H1-123
  Scenario: TC17
    Then User verifies that "Phone Number" input box is enabled

  @H1-124
  Scenario: TC18
    When User clicks on the Request a Demo button
    Then This field is required text is displayed below the "Phone Number" input box.

  @H1-125
  Scenario: TC19
    When User enters "John" into the Name input box
    And User enters "ABC Ltd." into the Company input box
    And User enters "Director" into the Title input box
    And User enters "012345678" into the Phone Number input box
    And User enters "john@abc.com" into the Email input box
    And User clicks on the Request a Demo button
    Then User verifies your request has been submit.. message is not displayed

  @H1-126
  Scenario: TC20
    When User enters "012345678" into the Phone Number input box
    And User clicks on the Request a Demo button
    Then Must be at least 10 characters text is displayed

  @H1-127
  Scenario: TC21
    Then User verifies that "Phone Number" input box is visible

  @H1-128
  Scenario: TC22
    Then User verifies that "Phone Number" input box is enabled

  @H1-129
  Scenario: TC23
    When User clicks on the Request a Demo button
    Then This field is required text is displayed below the "Phone Number" input box.

  @H1-130
  Scenario: TC24
    When User enters "John" into the Name input box
    And User enters "ABC Ltd." into the Company input box
    And User enters "Director" into the Title input box
    And User enters "0123456789" into the Phone Number input box
    And User enters "johnabc.com" into the Email input box
    And User clicks on the Request a Demo button
    Then User verifies your request has been submit.. message is not displayed

  @H1-131
  Scenario: TC25
    When User enters "johnabc.com" into the Email input box
    And User clicks on the Request a Demo button
    Then Invalid email text is displayed

  @H1-132
  Scenario: TC26
    Then User verifies that Request a Demo button is visible

  @H1-133
  Scenario: TC27
    When User enters "John" into the Name input box
    And User enters "ABC Ltd." into the Company input box
    And User enters "Director" into the Title input box
    And User enters "0123456789" into the Phone Number input box
    And User enters "john@abc.com" into the Email input box
    And User clicks on the Request a Demo button
    Then User verifies that Request a Demo button is clickable

  @H1-134
  Scenario: TC28
    When User enters "John" into the Name input box
    And User enters "ABC Ltd." into the Company input box
    And User enters "Director" into the Title input box
    And User enters "0123456789" into the Phone Number input box
    And User enters "john@abc.com" into the Email input box
    And User clicks on the Request a Demo button
    Then User verifies your request has been submit.. message is displayed



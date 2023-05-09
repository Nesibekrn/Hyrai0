# 1-"Source qualified candidates.'' should be visible, relevant sections should be clickable.


  Feature: US012
    @UI
    Scenario Outline: TC001_User_must_be_able_to_see_source_qualified_candidates
      Given the user is on the company homepage
      Then the user verifies "Source Qualified Candidates" text is visible
      Then user verifies the "<buttonName>" are clickable
      Examples:

      |buttonName    |
      |subscriber1 |
      |subscriber2|
      |subscriber3|
      |contact     |
      |requestDemo1 |
      |requestDemo2 |



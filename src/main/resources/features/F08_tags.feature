@smokeTest
Feature: Select different tags
  Scenario: user could select different tags
    Given user go to searchPage
    When user select hover on a tag from the popular tag section
    And user click on the tag
    Then the products related to this tag will be shown



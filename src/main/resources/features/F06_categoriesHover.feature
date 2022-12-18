@smokeTest
Feature: user could select different Categories
  Scenario: user hover on a categories and open sub-Category
    When user hovers on a category
    And user select sub-category
    Then user find the sub-category title in the page title

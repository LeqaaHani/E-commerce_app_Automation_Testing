@smokeTest
Feature: user could select specified Categories
  Scenario: user hover on a categories and open sub-Category
    When user hovers on a specific category
    And user select specific sub-category
    And user select specific color
    Then user find the specific sub-category title in the page title
    And the specific products with specific color are shown
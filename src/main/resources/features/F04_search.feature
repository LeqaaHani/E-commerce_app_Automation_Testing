@smokeTest
Feature: user could search for any product
  Scenario: user could search for any product using the product name
    When user click on search field
    And user enter the product name
    Then user find the product in the search result

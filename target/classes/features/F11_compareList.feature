@smokeTest
Feature: user could add different products to CompareList
  Scenario: user add product to compareList
    When user click on the add to compareList button
    Then The successful message shows that the product added successfully to compareList
    And The product added successfully to compareList

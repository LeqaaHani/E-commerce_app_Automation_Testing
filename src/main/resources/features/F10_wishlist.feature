@smokeTest
Feature: user could add different products to Wishlist
  Scenario: user add product to wishlist
    When user click on the add to wishlist button
    Then The successful message shows that the product added successfully
    And The product added successfully to wishlist

@smokeTest
Feature: Create successful Order
  Background:
    Given user navigate to login page
    When user enter "leqaahani@example.com" and "123456"
    And User click on login button
    Then User could login successfully and navigate to home page
    When user click on the add to cart button
    And choose the specified features of the product
    And confirm adding to shopping cart
    Then The product added successfully to shopping cart
  Scenario: user could create successful order
    When user click on shopping cart button
    And accept the terms of service
    And click on checkout button
    And enter his data
    And choose shipping method
    And choose payment method
    And choose payment information
    And confirm the order
    Then the order will make successfully

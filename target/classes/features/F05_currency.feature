@smokeTest
Feature: user change between currencies US-Euro
  Scenario: user choose euro
    When user select euro from the options
    Then all products price will turned to euro
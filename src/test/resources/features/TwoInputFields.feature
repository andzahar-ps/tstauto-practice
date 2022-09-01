Feature: Two inputs Form Test

  Scenario: As a user I want to be able to display the sum of two numbers a and b that I introduce in the user message field
    Given that the user is on Two Input page
    And the user enters 2 values in the input fields
    When the user submits the numeric values from the input fields
    Then the sum is displayed

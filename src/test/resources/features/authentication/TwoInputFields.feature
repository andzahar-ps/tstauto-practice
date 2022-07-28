Feature: Two Input Fields

  Scenario: As a user I want to be able to display the sum of two values
    Given that the user is on Simple form page
    When the user submits two numeric values in the input fields
    Then the sum value is displayed
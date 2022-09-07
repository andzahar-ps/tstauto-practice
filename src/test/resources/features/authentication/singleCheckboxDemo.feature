Feature: Single Checkbox Demo

  Scenario Outline: As a user I want to be able to see the correct message after selecting the checkbox
    Given the user is on the Checkbox Demo page
    When the user selects the age checkbox
    Then a "<successMessage>" is displayed

    Examples:
      | successMessage                 |
      | Success - Check box is checked |
Feature: Single CheckBox Demo Page

  Scenario Outline: As a user I want to see a success message after clicking on the checkbox
    Given that the user is on the CheckBox Demo page
    When the user selects the checkbox
    Then a "<successMessage>" is displayed

    Examples:
    | successMessage                 |
    | Success - Check box is checked |
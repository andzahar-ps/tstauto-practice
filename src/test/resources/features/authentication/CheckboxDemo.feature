@checkboxDemo
Feature: Single Checkbox

  @singleCheckbox
  Scenario Outline: As as user I want to be displayed a success message when I click the checkbox
    Given that the user is on Checkbox page
    When the user clicks the checkbox button
    Then a "<successMessage>" is displayed

    Examples:
      | successMessage                 |
      | Success - Check box is checked |
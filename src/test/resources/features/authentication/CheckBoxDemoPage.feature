Feature: Single CheckBox Demo Page

  Scenario: As a user I want to see a success message after clicking on the checkbox
    Given that the user is on the CheckBox Demo page
    When the user selects the checkbox
    Then a "Success - Checkbox is checked" message is displayed




Feature: Multiple CheckBox Demo Page

  Scenario: As a user I want to select all the checkboxes by clicking the "Check All" button
    Given that the user is on the multiple CheckBox Demo Page
    When the user click on the check all button
    Then all the checkboxes are selected
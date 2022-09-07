Feature: Multiple Checkbox Demo

  Scenario: As a user I want to be able to select all the checkboxes by clicking the "Check All" button
    Given the user is on the Multiple Checkbox Demo page
    When the user clicks the Check All button
    Then all the checkboxes are selected

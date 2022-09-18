@checkboxPage
Feature: Single Checkbox

  @singleCheckbox
  Scenario: As as user I want to be displayed a success message when I click the checkbox
    Given that the user is on checkbox page
    When the user clicks the checkbox button
    Then a success message is displayed

  @multipleCheckboxes
  Scenario: As as user I want to be able to select all checkboxes
    Given that the user is on checkbox page
    When the user clicks the check all button
    Then all checkboxes are selected

  @multipleCheckboxes
  Scenario: As as user I want to be able to unselect all the checkboxes
    Given that the user is on checkbox page
    And the checkboxes are selected
    When the user clicks the uncheck all button
    Then all checkboxes are unselected


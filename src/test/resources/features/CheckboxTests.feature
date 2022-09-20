@Checkbox
Feature: Checkbox

  @simpleCheckbox
  Scenario: As as user I want to be able to select the checkbox
    Given that the user is on Simple checkbox page
    When the user clicks on the checkbox
    Then the message "Success - check box is checked" is displayed


  @multipleCheckbox
  Scenario: As as user I want to be able to unselect all the checkboxes
    Given that the user is on Simple checkbox page
    When the user clicks the uncheck all button
    Then all the checkboxes are unselected
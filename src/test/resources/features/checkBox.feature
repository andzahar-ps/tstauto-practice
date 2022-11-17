Feature: Input Forms

  @checkBox
  Scenario: As a user I want to be able to see the message when I click the checkbox
    Given that the user is on Check Box page
    When the user click on the single Check Box item
    Then the message "Success - Check box is checked" is displayed

  @multipleCheckBox
  Scenario: As a user when I check all the checkboxes the button text changes
    Given that the user is on Check Box page
    When the user check all the checkboxes
    Then the button display the message "Uncheck All"
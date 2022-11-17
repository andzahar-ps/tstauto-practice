Feature: Input Forms

  @checkBox
  Scenario: As a user I want to be able to see the message when I click the checkbox
    Given that the user is on Check Box page
    When the user click on the single Check Box item
    Then the message "Success - Check box is checked" is displayed


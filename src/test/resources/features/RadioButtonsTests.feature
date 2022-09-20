@RadioButtons
Feature: Radio Buttons

  @RadioButtonsDemo
  Scenario Outline: As a user I want to see that the proper message is displayed when I choose male/female radio button
    Given that the user is on Radio buttons form page
    When the user clicks on radio button "<gender>"
    Then the message Radio button "<gender>" is checked is displayed

    Examples:
      | gender   |
      | Male     |
      | Female   |

Feature: Input Forms

  @radioButton
  Scenario Outline: As a user I want to be able to click on a radio button and see the correct message displayed
    Given that the user is on Radio button page
    When the user press the button "<valueButtonA>"
    Then the message "<valueMessage>" is displayed on Radio Button Page

    Examples:
      | valueButtonA | valueMessage                     |
      | Male         | Radio button 'Male' is checked   |
      | Female       | Radio button 'Female' is checked |
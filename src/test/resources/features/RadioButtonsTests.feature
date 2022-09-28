@RadioButtons
Feature: Radio Buttons

  @RadioButtonsDemo
  Scenario Outline: As a user I want to see that the proper message is displayed when I choose male/female radio button
    Given that the user is on Radio buttons form page
    When the user clicks on radio button "<gender>"
    Then a proper message with "<gender>" value is displayed

    Examples:
      | gender   |
#      | Male     |
      | Female   |

  @GroupRadioButtonsDemo
  Scenario Outline: As a user I want to see that the proper messages are displayed when I choose sex and age group radio buttons
    Given that the user is on Radio buttons form page
    When the user clicks on "<gender>" radio button and "<age group>" radio button
    Then the gender "<gender>" and age group "<age group>" are displayed

    Examples:
      | gender | age group |
      | Male   | 0 - 5     |
      | Female | 5 - 15    |
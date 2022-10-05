Feature: Radio Buttons Demo

  Scenario Outline: As a user I want to be able to get the correct value of the selected radio button in the text message
    Given the user is on the Radio Buttons Demo page
    When the user clicks one of the "<gender>"
    And the user clicks the Get Checked value button
    Then the "<gender>" value is shown correctly in the text message

    Examples:
      | gender |
      | Male   |
      | Female |


  Scenario Outline: As a user I want to be able to get the correct values of the selected radio buttons in the text message
    Given the user is on the Radio Buttons Demo page at the Group Radio Buttons section
    When the user clicks on one of the "<sex>" radio buttons and one of the "<ageGroup>" radio buttons
    And the user clicks on the Get values button
    Then the "<sex>" and the "<ageGroup>" are correctly displayed in the text message

    Examples:
      | sex  | ageGroup |
#      | Male | 0 - 5    |
      | Male   | 5 - 15  |
#      | Male   | 15 - 50 |
#      | Female | 0 - 5   |
#      | Female | 5 - 15  |
#      | Female | 15 - 50 |




Feature: Radio Buttons Demo page

  Scenario Outline: As a user I want to be able to get the correct value of the selected radio button in the text message
    Given that the user is on the Radio Buttons demo page
    When the user clicks on "<gender>" radio button
    And the user clicks on Get checked value button
    Then the "<gender>" value is show correctly in the text message

    Examples:
    | gender |
    | Male   |
    | Female |


    Scenario Outline: As a user I want to be able to get the correct values of the selected radio buttons in the text message
      Given that the user is on the Radio Buttons demo page on group Radio Buttons section
      When the user clicks on one of "<sex>" radio button and one of the "<ageGroup>" radio buttons
      And the user clicks on Get values button
      Then the selected values for "<sex>" and "<ageGroup>" should be correctly displayed

      Examples:
      | sex | ageGroup |
      | Male| 0-5      |

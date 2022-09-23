Feature: Radio Buttons page

  Scenario Outline: As a user I want to be displayed the selected gender after clicking the radio button
    Given that the user is on the Radio Buttons page
    When the user clicks on "<gender>" radio button
    And the user clicks on Get checked value button
    Then the user gets a message with the selected "<gender>" value

    Examples:
      | gender |
      | Male   |
#      | Female |

#  Scenario Outline: As a user I want to be displayed the selected gender and age after clicking the radio buttons
#    Given that the user is on the Radio Buttons page
#    When the user clicks on "<sex>" radio button and "<age>" radio button
#    And the user clicks on Get values button
#    Then the gender "<sex>" and age group "<age>" are displayed
#
#    Examples:
#      | sex  | age   |
#      | Male | 0 - 5 |
##      | Male   | 5 - 15  |
##      | Male   | 15 - 50 |
##      | Female | 0 - 5   |
##      | Female | 5 - 15  |
##      | Female | 15 - 50 |
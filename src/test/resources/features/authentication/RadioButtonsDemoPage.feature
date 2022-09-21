Feature: Radio Buttons Demo page

  Scenario Outline: As a user I want to be displayed the selected gender after clicking the "Get Checked value" button
    Given that the user is on the radio buttons demo page
    When the user clicks on <gender> radio button
    And the user clicks on "Get checked value" button
    Then a "Radio button <gender> is checked" success message should be displayed

    Examples:
Feature: Radio Buttons page

  Scenario Outline: As a user I want to be displayed the selected gender after clicking the radio button
    Given that the user navigates to radio buttons page
    When the user clicks on "<gender>" radio button
    And the user clicks on 'Get checked value' button
    Then the user gets a proper success message containing the checked "<gender>" value

    Examples:
      | gender | valueB | valueSum |
      | male   | 2      | 3        |
      | female | 3      | 5        |
Feature: Input Form Validation

  @InputFormSubmit
  Scenario Outline: As a user I want to select a state and to get an error when is not selected anymore
    Given the user navigated to the input form submit page
    When the user clicks on "<state>"
    And the user click on "Please select your state"
    Then an error message is displayed
  Examples:
    | state      |
    | California |
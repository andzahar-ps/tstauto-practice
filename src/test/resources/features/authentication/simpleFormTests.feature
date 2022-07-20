Feature: Simple Form Test

  Scenario: As as user I want to be able to display the value that I introduce in the user message field
    Given that the user is on Simple form page
    When the user submits a value in the input field
    Then that values is displayed

Feature: Two Inputs Simple Form Test

  Scenario: As a user I want to be able to display the value that I introduce in the sum1 field
    Given that the user is on simple form page and try to introduce a value in the two input fields
    When the user submits a value in the first input
    Then that value is displayed
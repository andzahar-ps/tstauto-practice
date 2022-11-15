Feature: Basic First Form Demo

  Scenario Outline: As a user I want to see the same message after I submit values in the input fields
    Given that the user is on basic first form demo
    When the user inputs first value "<valueA>" and second value "<valueB>" in the fields
    And the user presses the get total button
    Then the sum "<valueSum>" of the values are displayed

    Examples:
      | valueA | valueB | valueSum |
      | 8      | 11     | 19       |
     # | -2     | 4      | 2        |
     # | 5      |        | 5        |
     # | a      | b      | NaN      |
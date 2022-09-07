Feature: Two Input Fields

  Scenario Outline: As a user I want to able to get the sum of any two values
    Given the user is on the Simple Form page
    When the user enters the "<firstValue>" in the first field
    And the user enters the "<secondValue>" in the second field
    And the user submits the two numbers
    Then the "<totalValue>" is displayed

    Examples:
      | firstValue | secondValue | totalValue |
      | 22         | 33          | 55         |
      | 14         | -7          | 7          |
      | -3         | -8          | -11        |
      | x          | y           | NaN        |

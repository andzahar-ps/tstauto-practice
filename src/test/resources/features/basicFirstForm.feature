@inputForms
Feature: Input Forms

  @test1
  Scenario Outline: Display the value introduced in the user message field
    Given that the user is on Basic First Form Page
    When the user inputs text "<toni>" in the input field
    Then that text "<toni>" is displayed next to the Your Message section
    Examples:
      | toni |
      | ceva |


  @test2
  Scenario Outline: Display the result of the sum
    Given that the user is on Basic First Form Page
    When the user inputs numberA "<numberA>" in the field
    And the user inputs numberB "<numberB>" in the field
    Then the user clicks on Get Total button to see the result "<result>"
    Examples:
    | numberA | | numberB | | result |
    |1        | |2        | |3       |
    |0        | |99       | |99      |
    |a        | |f        | |NaN     |

  @test3
  Scenario Outline: Clicking on the checkbox will display a success message
    Given that the user is on Basic Checkbox Demo Page
    When the user clicks on the check box
    Then the "<message>" success message will be displayed
    Examples:
    | message                        |
    | Success - Check box is checked |
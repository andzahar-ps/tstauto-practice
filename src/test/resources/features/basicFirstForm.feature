@inputForms
Feature: Input Forms

  @test1
  Scenario Outline: Display the value introduced in the user message field
    Given that the user is on Basic First Form Page
    When the user inputs text "<toni>" in the input field
    Then that text "<toni>" is displayed next to the Your Message section
    Examples:
      | toni |


  @test2
  Scenario Outline: Display the result of the sum
    Given that the user is on Basic First Form Page
    When the user inputs numberA "<numberA>" in the field
    And the user inputs numberB "<numberB>" in the field
    Then the user clicks on Get Total button to see the result "<result>"
    Examples:
      | numberA | | numberB | | result |
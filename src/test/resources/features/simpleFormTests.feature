@inputForms
Feature: Input Forms

  @simpleForm
  Scenario: As as user I want to be able to display the value that I introduce in the user message field
    Given that the user is on Simple form page
    When the user submits a value in the input field
    Then that values is displayed


  @simpleForm
  Scenario Outline: As a user I want to be able to display the sum of two values
    Given that the user is on Simple form page
    When the user submits the values "<valueA>" and "<valueB>" in the the two input field
    Then the sum "<valueSum>" is displayed

    Examples:
      | valueA    |  valueB   | valueSum |
      | 1         | 2         | 3        |
      | 2         | 3         | 5        |
      |-1         |-2         |-3        |
      | a         | b         | NaN      |
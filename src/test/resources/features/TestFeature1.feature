@inputForms
Feature: Input Forms

  @simpleForm
  Scenario Outline: As a user I want to input some values
    Given That the user is on the Simple Forms page
    When the user enters a value in fields "<valueA>" and "<valueB>"
    Then The total sum "<valueSum>" of the values is displayed


    Examples:
    |valueA    |valueB    |valueSum |
    |2         |4         |6        |
    |-1        |-2        |-3       |
    |a         |b         |NaN      |

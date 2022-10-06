Feature: Dropdown List

  Scenario Outline: As a user I want to be displayed the proper message after I choose an option from the dropdown
    Given that the user is on Select Dropdown List page
    When the user selects a day of the week from the dropdown
    Then a proper message with selected "<weekday>" value is displayed

    Examples: | weekday |
              | Sunday  |
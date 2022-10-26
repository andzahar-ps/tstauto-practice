Feature: Dropdown List

  Scenario Outline: As a user I want to be able to see that the selected option from the dropdown list is displayed
    Given that the user is on Select Dropdown List page
    When the user selects a "<weekday>" of the week from the dropdown
    Then a proper message with selected "<weekday>" value is displayed

    Examples: | weekday |
              | Sunday  |
@DropdownList
Feature: Dropdown List

  @SelectListDemo
  Scenario Outline: As a user I want to see that the proper message is displayed when I when I choose an option from the dropdown
    Given that the user is on Select Dropdown List page
    When the user opens the dropdown list
    And the user clicks on "<weekday>"
    Then a proper message with "<weekday>" value will be visible

    Examples:
      | weekday |
      | Sunday  |
#      | Monday  |
#      | Tuesday |
#      | Wednesday  |
#      | Thursday |
#      | Friday  |
#      | Saturday  |

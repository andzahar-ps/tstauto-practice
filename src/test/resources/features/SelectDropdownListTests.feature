@DropdownList
Feature: Dropdown List

  @SelectListDemo
  Scenario Outline: As a user I want to see that the proper message is displayed when I when I choose an option from the dropdown
    Given that the user is on Select Dropdown List page
    When the user clicks on a day of the week
    Then a proper message with "<weekday>" value will be visible

  Examples:
    | weekday   |
#     | Male     |
    | Sunday   |
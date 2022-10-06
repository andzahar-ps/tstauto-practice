@SelectDropdownListPage
Feature: Select dropdown demo

  @SelectListDemo
  Scenario: As a user I want the single select dropdown menu to have a placeholder
    Given that the user is present on Select Dropdown List Page
    When the user inspects the single select dropdown menu
    Then the user sees the dropdown has the placeholder 'Please select'

  Scenario Outline: As a user I want to be displayed a correct message after selecting a day from the dropdown menu
    Given that the user is present on Select Dropdown List Page
    When the user selects the week day "<day>" from the dropdown list
    Then the user is displayed a message with the selected day "<day>"

    Examples:
      | day       |
#      | Sunday    |
#      | Monday    |
#      | Tuesday   |
      | Wednesday |
#      | Thursday  |
#      | Friday    |
#      | Saturday  |

#  @MultiSelectListDemo
#  Scenario : As a user I want the be displayed a message with all selected states from the dropdown menu after clicking Get All Selected button
#    Given that the user is present on Select Dropdown List
#    When the user selects multiple states from the dropdown menu
#    And the user the user clicks the Get All Selected button
#    Then the user is displayed a message with the selected states

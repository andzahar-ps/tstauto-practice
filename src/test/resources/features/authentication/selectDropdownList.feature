Feature: Select Dropdown List


#  SCENARIOS FOR  ===  Select List Demo

    # First Scenario
  Scenario Outline: As a user I want to be able to see the selected option from the dropdown inside the text message
    Given the user is on the Select Dropdown List page
    When the user clicks on the select field
    And the user selects one from the dropdown list
    Then the selected "<option>" is shown inside the text message

    Examples:
      | option    |
      | Sunday    |
      | Monday    |
      | Tuesday   |
      | Thursday  |
      | Wednesday |
      | Friday    |
      | Saturday  |


    # Second Scenario
  Scenario: As a user I want to not be able to select the first option from the dropdown
    Given the user is on the Select Dropdown List demo page
    When the user clicks on the Please select field
    Then the user is not able to click on first option of the dropdown


    # Third Scenario
  Scenario Outline: As a user I want to be able to see my selection as the new placeholder
    Given the user is on Select Dropdown List demo
    When the user clicks on Select Field dropdown
    And the user selects an option from the dropdown
    Then the placeholder of the field shows the previously made "<selection>"

    Examples:
      | selection |
      | Sunday    |
      | Monday    |
      | Tuesday   |
      | Thursday  |
      | Wednesday |
      | Friday    |
      | Saturday  |




  # SCENARIOS FOR  ===  Multi Select List Demo

    # First Scenario
    Scenario: As a user I want to be able to see the first option selected in the text message
      Given the user is on the Select Dropdown List page demo
      When the user selects multiple options from the list
      And the user clicks the First Selected button
      Then the user is able to see the first option that was selected


    # Second Scenario
    Scenario: As a user I want to be able to see all my selected options in the text message
      Given the user has navigated to the Select Dropdown List demo page
      When the user is selecting multiple options from the list
      And the user is clicking the Get All Selected button
      Then the user is able to see all the selected options
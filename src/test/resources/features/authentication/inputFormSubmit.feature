Feature: Input Form Submit


  # First Scenario -> First Name Field

  Scenario: As a user I want the First Name field to display a validation message and to change its UI, according to my actions
    Given the user navigated to the input form submit page
    When the user clicks on the send button
    And the field displays an error message
    And the border color of the field turns red
    And the field displays an error icon
    And the user fills in the field with valid data
    And the border color of the field turns green
    And the user clicks on the last name field
    Then the field displays a successful icon
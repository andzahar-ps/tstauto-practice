Feature: Input Form Submit


  Scenario: As a user I want the State field to display a successful icon when i select an option from the dropdown list
    Given that the user is on Input Form Submit page
    When the user selects a value from the State dropdown list
    And clicks on the send button
    Then the field displays a successful icon
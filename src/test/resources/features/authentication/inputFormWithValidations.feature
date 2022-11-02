Feature: Input Form Validations

  Scenario: As as user I want to display an error message when the first name field is blank
    Given that the user is on input form validations page
    When the user input the form without completing the first name field
    Then an error message is shown for first name field
Feature: Input form validation

  @validFirstNameInputValidation
  Scenario: First name validation
    Given the user is on input form validation page
    When he enters a correct first name
    Then the first name field should be valid

  @validLastNameInputValidation
  Scenario: Last name validation
    Given the user is on input form validation page
    When he enters a correct last name
    Then the last name field should be valid

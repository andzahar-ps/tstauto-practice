@inputFormWhitValidations
Feature: Input Form Validations

  @phoneNumberField
  Scenario: As as user I want to see an error message when the phone number field is blank
    Given that the user is on input form validations page
    When the user submits the form without completing the phone number field
    Then an error message is shown for phone number field

  @phoneNumberField
  Scenario: As as user I want to display an error message when the phone number field is populated wrong
    Given that the user is on input form validations page
    When the user inputs invalid data in the phone number field
    And the user clicks outside the phone number input filed
    Then an error message is displayed for the phone number field

  @phoneNumberField
  Scenario: As as user I want to display an success icon when I enter a valid phone number
    Given that the user is on input form validations page
    When the user inputs a valid number in the phone number field
    And the user clicks outside the phone number input filed
    Then a success icon is displayed on the right side of the phone number field

  @inputForm
  Scenario: As as user I want to see all error messages when I submit a blank form
    Given that the user is on input form validations page
    When the user submits the form without completing the phone number field
    Then all error messages are displayed
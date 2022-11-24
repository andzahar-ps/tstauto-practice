Feature: Ajax Form Submit

  @SeleniumEasy @AjaxFormSubmit
  Scenario: As a user I want to get a successful message after submitting the form
    Given the user navigates to the Ajax Form Submit page
    When the user fills in both of the fields
    And the user clicks the Submit button
    Then a successful message is displayed
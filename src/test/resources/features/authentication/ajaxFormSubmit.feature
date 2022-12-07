Feature: Ajax Form Submit

  @SeleniumEasy @AjaxFormSubmit @FirstScenario
  Scenario: As a user I want to get a successful message after submitting the form
    Given the user navigates to the Ajax Form Submit page
    When the user fills in both of the fields
    And the user clicks the Submit button
    Then a successful message is displayed


  @SeleniumEasy @AjaxFormSubmit @SecondScenario
  Scenario: As a user I want the successful message to appear after the loading spinner disappears
    Given the user navigates to the Ajax Form Submit page
    When the user fills in both of the fields
    And the user clicks the Submit button
    Then a successful message is displayed when the loading spinner disappears
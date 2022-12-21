@AjaxSubmitForm
Feature: AjaxSubmitForm

  Scenario: As as user I want to see a success message after I click on the submit button
    Given that the user is AjaxFormSubmit page
    When the user fills in the required fields
    And the user clicks on submit button
    Then a successful message is displayed



  Scenario: As as user I want to check that the loading spinner is present
    Given that the user is AjaxFormSubmit page
    When the user fills in the required fields
    And the user clicks on submit button
    Then a successful message is displayed after the loading spinner disappears
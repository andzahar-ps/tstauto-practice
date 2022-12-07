Feature: Ajax Form Submit

  @AjaxFormSubmit
  Scenario: As a user I want to get a success message after the waiting messages disappears
    Given that the user is on ajax form submit page
    When that the user enters valid data in the form
    And the user clicks the submit button
    Then a success message is displayed under the form

  @AjaxFormSubmit
  Scenario: As a user I want to get a success message after the loader disappears
    Given that the user is on ajax form submit page
    When that the user enters valid data in the form
    And the user clicks the submit button
    Then a success message appears under the form
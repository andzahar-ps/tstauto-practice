Feature: Ajax Form Submit

  @AjaxFormSubmit
  Scenario: As a user I want to get a success message after submitting the form
    Given that the user is on ajax form submit page
    When the user enters data in both of the fields
    And the user clicks the Submit button
    Then a success message is displayed
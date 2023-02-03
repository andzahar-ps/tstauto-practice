Feature: Ajax Form Submit

  @ajaxForm
  Scenario: Form is submitted
    Given user is on Ajax Form Submit page
    When he tries to submit his name and a comment
    Then he should see that the form is processed

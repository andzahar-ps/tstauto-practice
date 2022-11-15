@inputForms
  Feature: Checkbox Demo

    @simpleForm
    Scenario: As a user I want to be able to click on the checkbox from the Single Checkbox Demo window
      Given that the user is on the Checkbox Demo page
      When the user checks the single check mark from the Single Checkbox Demo window
      Then the message attesting the checkbox has been checked is displayed
      And the checkbox selection is validated


    @simpleForm
    Scenario: As a user I want to know if all of the checkboxes from the Multiple Checkbox Demo window have been checked
      Given that the user is on the Checkbox Demo page
      When the user checks all of the checkboxes from the Multiple Checkbox Demo window
      Then the user is notified that all of the checkboxes have been checked
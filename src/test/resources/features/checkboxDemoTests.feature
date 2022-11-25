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
      Then all of the checkboxes have been checked
      And the uncheck all button is clicked


    @simpleForm
    Scenario: As a user I want to know if clicking on the Check all button automatically checks all the boxes
      Given that the user is on the Checkbox Demo page
      When the user clicks on the check all button
      Then all of the checkboxes have been checked automatically


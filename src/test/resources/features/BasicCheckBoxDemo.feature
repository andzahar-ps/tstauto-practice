         Feature: Checkbox

           @simpleCheckBox
           Scenario: As a user I want to be able to select the simple checkbox
             Given  the user is on simple checkbox page
             When the user clicks on the checkbox
             Then a message "Success - Check box is checked" is displayed


           @multipleCheckBox
           Scenario: As a user I want to be able to select all the checkboxes
             Given the user is on multiple checkbox page
             When the user clicks on the "Check all" button
             Then the user sees all checkboxes are selected
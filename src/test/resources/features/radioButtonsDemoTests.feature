@inputForms
  Feature: Radio Buttons Demo
    
    
    @simpleForm
    Scenario: As a user, when I click on the Male radio button, the message returned should correctly return the chosen value
      Given that the user is on the Radio Buttons Demo page
      When the user clicks on the "Male" radio button
      And the user clicks on the Get Checked Value button
      Then the message displays the "Male" value

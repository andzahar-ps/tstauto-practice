@inputForms
  Feature: Radio Buttons Demo
    
    
    @simpleForm
    Scenario Outline: As a user, when I click on the Male radio button, the message returned should correctly display the chosen value
      Given that the user is on the Radio Buttons Demo page
      When the user clicks on the "<gender>" radio button
      And the user clicks on the Get Checked Value button
      Then the message displays the "<gender>" value

      Examples:
      |gender|
      |Male  |
      |Female|


      @simpleForm
      Scenario Outline: As a user, when I click on a value from each of the group radio buttons, the message returned should correctly display the chosen values
        Given that the user is on the Radio Buttons Demo page
        And the user clicks on the age group "<age>" radio button
        And the user also clicks on the gender group "<gender>" radio button
        When the user clicks on the Get Values button
        Then the message displays the corresponding "<gender>" and "<age>" values

        Examples:
        |age     | gender|
        |0 - 5   | Male  |
        |0 - 5   | Female|
        |5 - 15  | Male  |
        |5 - 15  | Female|
        |15 - 50 | Male  |
        |15 - 50 | Female|
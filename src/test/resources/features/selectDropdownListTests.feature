@inputForms
  Feature: Select Dropdown List

    @simpleForm
    Scenario Outline: As a user, I want to be able to select any value from the dropdown list and the validation message to return the chosen value
      Given that the user is on the Select Dropdown List webpage
      When the user selects one value "<day>" from the dropdown list
      Then the message returned, displays the value "<day>" selected by the user

      Examples:
      |day      |
      |Monday   |
      |Tuesday  |
      |Wednesday|
      |Thursday |
      |Friday   |
      |Saturday |
      |Sunday   |


    @simpleForm
    Scenario: As a user I want to be able to randomly select any values from the dropdown list and the validation message to return the chosen values
      Given that the user is on the Select Dropdown List webpage
      When the user selects multiple values from the Multi Select dropdown list
      And the user clicks on the First selected button
      Then the message returned, displays the values selected by the user



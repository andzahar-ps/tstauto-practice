@InputForms
  Feature: Input Form Submit

    @simpleForm
    Scenario Outline: As a user, I want to be able to validate an input form with the following fields completed
      Given that the user is on the Input Form Submit page
      When the user enters a valid name in the First Name "<name>" field
      And the user also enters a valid zipcode "<zip code>"
      And the user selects the hosting choice "<Yes/No>"
      And the user selects a state from the state dropdown list
      Then the user clicks on the Send button to validate the form

      Examples:
      |name   | Yes/No | zip code |
      |Michael| Yes    | 1234   |

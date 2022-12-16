Feature: Input Forms

  @dropdownList
  Scenario Outline: As a user I want to be able to select an option from the form and see the correct message displayed
    Given that the user is on Dropdown List page
    When the user select the option "<optionSelected>" from the form
    Then the correct message is displayed in Dropdown List Page

    Examples:
      | optionSelected |
      | Monday         |
      | Tuesday      |
      | Wednesday        |
      | Thursday        |
      | Friday      |
      | Saturday        |
      | Sunday        |
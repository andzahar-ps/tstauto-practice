Feature: Login functionality on the SportVision site

  Scenario: As a user I want to be able to perform the login action
    Given the user is on the SportVision Homepage
    And the user clicks on the Login button from the Homepage
    When the user fills in both of the credentials fields
    And the user clicks on the Login button from the Login Page
    Then the user is able to see the name of my account

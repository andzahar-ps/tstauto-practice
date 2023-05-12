Feature: Search and Add to cart functionalities

  Background: Perform the login action
    Given the user is on the SportVision Homepage
    And the user clicks on the Login button from the Homepage
    And the user fills in both of the credentials fields
    And the user clicks on the Login button from the Login Page

  Scenario: As a user I want to be able to add items to the cart
    When the user goes to the search results page of the desired brand
    And the user adds the desired product to the cart
    Then the user is able to see the cart icon value being changed
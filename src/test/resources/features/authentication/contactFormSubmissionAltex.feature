Feature: Contact Form Submission on the PHPTravels site

  Scenario: As a user I want to be able to submit a contact form
    Given the user has navigated to the Altex homepage
    And the user clicks on the Contact link button
    When the user fills in all the required fields
    And the user submits the form
    Then the user is able to see a successful message being displayed

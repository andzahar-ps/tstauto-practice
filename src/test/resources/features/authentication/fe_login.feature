Feature: Login - FE

  @smoke @fe @login @TestRailId-153832
  Scenario: A non-federated globalAdmin is able to login with valid credentials
    Given that the user's browser is opened on the login page
    When the globalAdmin logs in with valid credentials
    Then the globalAdmin sees login success message




Feature: As a user I should be able to see all the available items in the home page

  Background: User is logged into sauce demo page
    Given I am in the Sauce Labs Demo Page
    And I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button
    Then I should be in the home page

  Scenario Outline: Products are available in the home page
    When I am in the home page
    Then I verify that "<product>" is displayed
  Examples:
    |product|
    |Sauce Labs Onesie |
    |Sauce Labs Bike Light|


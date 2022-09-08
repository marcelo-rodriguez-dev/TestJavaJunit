Feature: As a user i should be able to checkout a purchase
  Background: User is logged into sauce demo page
    Given I am in the Sauce Labs Demo Page
    And I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button
    Then I should be in the home page

  Scenario: delete Sauce Labs Bike Light from cart
    When I add Sauce Labs Bike Light product to the cart
    And I click on the cart button
    And I click on the remove button
    Then I should be able to see the cart page without the item Sauce Labs Bike Light into the cart



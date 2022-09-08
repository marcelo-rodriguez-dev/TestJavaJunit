Feature: As a user to be able to login into Sauce Labs Demo Web Page

  Background: User is in the sauce labs page
    Given I am in the Sauce Labs Demo Page

  Scenario: Login into Sauce Demo page with valid credentials
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button
    Then I should be in the home page


    Scenario:Login into Sauce Demo page with invalid credentials
      When I set the user name text box with "wrong_user"
      And I set the password text box with "wrong_password"
      And I click on the login button
      Then I verify that a error message that says "Epic sadface: Username and password do not match any user in this service" is displayed

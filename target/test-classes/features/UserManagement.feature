@crater
Feature: Title of your feature
  I want to use this template for my feature file

  @invalidEmailLogin
  Scenario: Invalid email login attempts
    Given As a user, I am on the login page
    When I enter invalid username and valid password
    And Click on login button
    Then I should not be logged in

    @invalidPasswordLogin
  Scenario: Invalid password login attemps
    Given As a user, I am on the login page
    When I enter valid username and invalid password
    And Click on login button
    Then I should not be logged in
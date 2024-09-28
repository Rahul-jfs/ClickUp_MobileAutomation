Feature: login
  Scenario: logging in app
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
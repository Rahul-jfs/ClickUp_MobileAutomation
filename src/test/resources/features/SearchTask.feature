Feature: search a task

  Background:
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in

  Scenario: search a task
    Given user is on home page
    When  user clicks on search icon
    And user enters task name as "user.taskName"
    Then verify task is visible
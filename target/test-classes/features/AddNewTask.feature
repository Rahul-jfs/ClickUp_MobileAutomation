Feature: Add new task functionality

  Scenario: verify user can add new task
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    When user clicks on add button
    And user enters task title as "task.title"
    And user enters assignee
    And user clicks on sets date
    And user sets due date as "due.date"
    And user clicks on create button
    Then verify task is created


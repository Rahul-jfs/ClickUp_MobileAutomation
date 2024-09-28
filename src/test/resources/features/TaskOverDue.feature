Feature:Overdue Task Complete

  Background:
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    And user is on home page

  Scenario: Verify user can complete the overDue task
    When user clicks on add button
    And user enters task title as "overdueTask.name"
    And user enters assignee
    And user clicks on sets date
    And user sets due date
    And user clicks on create button
    Then verify task is created
    When user clicks on see all of my work
    Then verify my work page is displayed
    When user clicks on overdue task button
    Then verify tasks of name "overdueTask.name" displayed
    When user clicks on the task name as "overdueTask.name"
    Then verify user is on task description page
    When user clicks on task status type
    Then verify status types is displayed
    When user clicks on complete task option
    Then verify task is marked as complete
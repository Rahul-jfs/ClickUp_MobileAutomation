Feature: Complete task by swipe functionality

  Scenario: verify user can complete a task by swipe
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    And user is on home page
    When user clicks on add button
    And user enters task title as "task.title"
    And user enters assignee
    And user clicks on sets date
    And user sets due date as "due.date"
    And user clicks on create button
    Then verify task is created
    When user clicks on see all of my work
    Then verify my work page is displayed
    When user clicks on Next button
    Then verify tasks of name "nextTask.name" displayed
    When user clicks swipes on task name as "nextTask.name"
    Then verify task is completed

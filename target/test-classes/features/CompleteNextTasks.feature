Feature: Complete Next task functionality

  Background:
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    And user is on home page

  Scenario: verify user can add new task
    When user clicks on add button
    And user enters task title as "task.title"
    And user enters assignee
    And user clicks on sets date
    And user sets due date as "due.date"
    And user clicks on create button
    Then verify task is created

  Scenario: Verify user can complete the next task
    When user clicks on see all of my work
    Then verify my work page is displayed
    When user clicks on Next button
    Then verify tasks of name "nextTask.name" displayed
    When user clicks on the task name as "nextTask.name"
    Then verify user is on task description page
    When user clicks on task status type
    Then verify status types is displayed
    When user clicks on complete task option
    Then verify task is marked as complete

  Scenario: Verify user mark the next task as inProgress
    When user clicks on see all of my work
    Then verify my work page is displayed
    When user clicks on Next button
    Then verify tasks of name "nextTask.name" displayed
    When user clicks on the task name as "nextTask.name"
    Then verify user is on task description page
    When user clicks on task status type
    Then verify status types is displayed
    When user clicks on inProgress task option
    Then verify task is marked as inProgress


  Scenario: Verify user can add a task to favorite
    When user clicks on see all of my work
    Then verify my work page is displayed
    When user clicks on done button
    Then verify tasks of name "favoriteTask.name" displayed
    When user clicks on the task name as "favoriteTask.name"
    Then verify user is on task description page
    When user clicks on options button
    Then verify options popup is displayed
    When user clicks on favorite option
    Then verify the option is changed to unFavorite
    When user clicks on done button of options popup
    And user clicks on back button
    And clicks on back button of myWork page
    And user clicks on see all of favorite
    Then verify favorite page is displayed
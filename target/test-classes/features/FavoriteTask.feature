Feature: Favorite Task Validation

  Background:
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    And user is on home page

  Scenario: Verify user can create and complete the next task
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

  Scenario: Verify user can remove a favorite task from the list
    When user clicks on see all of favorite
    And clicks on the favorite task "favoriteTask.name"
    Then verify user is on task description page
    When user clicks on options button
    Then verify options popup is displayed
    When user clicks on unFavorite option
    Then verify the option is changed to favorite
    When user clicks on done button of options popup
    And user clicks on back button
    Then verify favorite task is removed
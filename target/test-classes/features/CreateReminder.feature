Feature: create a reminder

  Background:
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in

  Scenario: create a reminder
    Given user is on home page
    When  user clicks on add reminder
    And user enters reminder name as "user.reminder"
    And user clicks on create reminder button
    Then verify reminder is visible

  Scenario: verify user can delete a remainder
    When user clicks on see all of reminder
    Then verify reminder page is displayed
    When user clicks on overdue option
    Then verify list of overdue remainders are displayed
    When user clicks on overdue remainder of name "overdueReminder.name"
    Then verify reminder details page is displayed
    When user clicks on more option
    And clicks on delete button of reminder
    Then verify reminder is deleted


Feature: Create Notepad Functionality

  Background:
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    And user is on home page
    When user clicks on more button
    And user clicks on notepad option
    Then verify notepad page is displayed

  Scenario: verify note is created
    When user clicks on create new note button
    And user creates a new note name as "note.name"
    And user clicks on edit note button
    And user enters the note message as "note.msg"
    And user clicks on back button
    Then verify note is present of name "note.name"
    When user clicks on the note name from the list "note.name"
    Then verify note is present with noteName "note.name" and noteMsg "note.msg"


  Scenario: Verify user can delete note
    When user clicks on the note to be deleted of name "deleteNote.name"
    And user clicks on notepad more option
    And clicks on delete button
    And clicks on confirm delete button
    Then verify note is deleted of name "deleteNote.name"




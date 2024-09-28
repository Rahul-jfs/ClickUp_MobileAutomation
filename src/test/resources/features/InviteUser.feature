Feature: Invite User Functionality

  Scenario: Verify user can invite a new member
    Given user enters email "email"
    When  user enters password "password"
    Then user clicks on login btn
    And verify user logged in
    And user is on home page
    When user clicks on invite option
    Then verify invite popup is displayed
    When user enters email of member to invite
    And clicks on invite button
    Then verify invite is sent
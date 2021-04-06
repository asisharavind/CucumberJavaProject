Feature: Feature to test login functionality
@smoke
Scenario: Check login is successful
    Given user is on login page1
    When user enters username and password1
    And clicks on login button1
    Then user is navigated to home page1
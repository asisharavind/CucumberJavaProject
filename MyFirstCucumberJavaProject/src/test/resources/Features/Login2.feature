Feature: Feature to test login functionality
Scenario: Check login is successful
    Given user is on login page2
    When user enters username and password2
    And clicks on login button2
    Then user is navigated to home page2
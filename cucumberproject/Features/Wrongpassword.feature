Feature: login releated scenario
Scenario: Invalid login
Given user navigates to application
When user enters valid username and invalid pasword
And user clicks on login button
Then system is displays error message
Feature: This is login feature for facebook

Scenario: login functionality
Given user is on the facebook login page
When user enters the valid emailaddress and password
And  click on facebook login  button
Then the user should be navigated to facebook home page

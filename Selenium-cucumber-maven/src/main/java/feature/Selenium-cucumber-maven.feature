Feature: Shopping website test

Scenario: User is able to Sign in successfully

Given user opens browser
Then user is on login page
Then user enters username as "helohelohelo@gmail.com" and password as "helohelohelo@gmail.com" and user clicks on sign-in button

Scenario: User saves all the prices of womens dress in excel sheet

Then user clicks on women button
Then user saves all data in excel sheet
Then user closes browser


26 ,27 to be removed

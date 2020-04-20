Feature: Shopping website test

Scenario: User is able to Sign in successfully

Given user opens browser
Then user is on login page
Then user enters "username" and "password"
Then user clicks on sign-in button
Then user closes browser


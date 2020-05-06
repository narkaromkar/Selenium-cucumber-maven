$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Omkar/git/Selenium-cucumber-maven/Selenium-cucumber-maven/src/main/java/feature/Selenium-cucumber-maven.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping website test",
  "description": "",
  "id": "shopping-website-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User is able to Sign in successfully",
  "description": "",
  "id": "shopping-website-test;user-is-able-to-sign-in-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters username as \"helohelohelo@gmail.com\" and password as \"helohelohelo@gmail.com\" and user clicks on sign-in button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_opens_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "helohelohelo@gmail.com",
      "offset": 25
    },
    {
      "val": "helohelohelo@gmail.com",
      "offset": 66
    }
  ],
  "location": "StepDefination.user_enters_username_as_and_password_as_and_user_clicks_on_sign_in_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 9,
  "name": "User saves all the prices of womens dress in excel sheet",
  "description": "",
  "id": "shopping-website-test;user-saves-all-the-prices-of-womens-dress-in-excel-sheet",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user clicks on women button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user saves all data in excel sheet",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user closes browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "StepDefination.user_closes_browser()"
});
formatter.result({
  "status": "skipped"
});
});
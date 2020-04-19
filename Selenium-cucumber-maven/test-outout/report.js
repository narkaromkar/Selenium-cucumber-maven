$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Omkar/eclipse-workspace/Selenium-cucumber-maven/src/main/java/feature/Selenium-cucumber-maven.feature");
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
  "name": "user enters \"username\" and \"password\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user cicks on sign-in button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_opens_browser()"
});
formatter.result({
  "duration": 11415463400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_is_on_login_page()"
});
formatter.result({
  "duration": 1107749500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    },
    {
      "val": "password",
      "offset": 28
    }
  ],
  "location": "StepDefination.user_enters_and(String,String)"
});
formatter.result({
  "duration": 2160500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_cicks_on_sign_in_button()"
});
formatter.result({
  "duration": 14000,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login in the Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch the Adactin in Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter the \"\u003cUsername\u003e\" in Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter the \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click the Login Button And it Navigates to search Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_the_Adactin_in_Application()"
});
formatter.result({
  "duration": 4610064700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cUsername\u003e",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_the_in_Username_Field(String)"
});
formatter.result({
  "duration": 283227301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cpassword\u003e",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 112224001,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_Login_Button_And_it_Navigates_to_search_Hotel_page()"
});
formatter.result({
  "duration": 355430200,
  "status": "passed"
});
});
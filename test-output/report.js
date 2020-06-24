$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/eclipse-workspace/CucumberFramework/src/main/java/Features/deal.feature");
formatter.feature({
  "line": 1,
  "name": "CRM Deals Test",
  "description": "",
  "id": "crm-deals-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Deals Creation",
  "description": "",
  "id": "crm-deals-test;deals-creation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already in Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user title of login page is crm",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "gijoraju@gmail.com",
        "Summer800!"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on deals",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on new",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "BDD01",
        "100",
        "100"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "clicks on save",
  "keyword": "Then "
});
formatter.match({
  "location": "DealCreateStepDefinition.user_is_already_in_Login_page()"
});
formatter.result({
  "duration": 14179569337,
  "status": "passed"
});
formatter.match({
  "location": "DealCreateStepDefinition.user_title_of_login_page_is_crm()"
});
formatter.result({
  "duration": 26292768,
  "status": "passed"
});
formatter.match({
  "location": "DealCreateStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 451280154,
  "status": "passed"
});
formatter.match({
  "location": "DealCreateStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 84634657,
  "status": "passed"
});
formatter.match({
  "location": "DealCreateStepDefinition.user_is_on_Homepage()"
});
formatter.result({
  "duration": 4000154768,
  "status": "passed"
});
formatter.match({
  "location": "DealCreateStepDefinition.user_clicks_on_deals()"
});
formatter.result({
  "duration": 4357589360,
  "status": "passed"
});
formatter.match({
  "location": "DealCreateStepDefinition.user_clicks_on_new()"
});
formatter.result({
  "duration": 4326941764,
  "status": "passed"
});
formatter.match({
  "location": "DealCreateStepDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 4611286017,
  "status": "passed"
});
formatter.match({
  "location": "DealCreateStepDefinition.clicks_on_save()"
});
formatter.result({
  "duration": 4841253623,
  "status": "passed"
});
});
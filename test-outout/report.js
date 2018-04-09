$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/yogeeswar/workspace/CucumberAutomation/src/main/java/featurefiles/dealsmap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8788756,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 15065953399,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 42630021,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 403052307,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 4623620059,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 12544066,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_moves_to_new_deals_page()"
});
formatter.result({
  "duration": 1094149020,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 24039011762,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1315496815,
  "status": "passed"
});
formatter.after({
  "duration": 261422,
  "status": "passed"
});
formatter.after({
  "duration": 87543,
  "status": "passed"
});
});
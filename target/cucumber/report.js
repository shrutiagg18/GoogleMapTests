$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/TestScenarios.Feature");
formatter.feature({
  "line": 1,
  "name": "Google Map Page",
  "description": "",
  "id": "google-map-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "Verify User is able to search City on Google map",
  "id": "google-map-page;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@GoogleMapSearch"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Initialise Driver",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to WebSite",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter \"\u003cCity\u003e\" in the search box",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Search",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify left panel has \"\u003cCity\u003e\" as a headline text",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click Directions Icon",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify Destination field is \"\u003cCity\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "google-map-page;;",
  "rows": [
    {
      "cells": [
        "City"
      ],
      "line": 16,
      "id": "google-map-page;;;1"
    },
    {
      "cells": [
        "Dublin"
      ],
      "line": 17,
      "id": "google-map-page;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "Verify User is able to search City on Google map",
  "id": "google-map-page;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@GoogleMapSearch"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Initialise Driver",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to WebSite",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter \"Dublin\" in the search box",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Search",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify left panel has \"Dublin\" as a headline text",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click Directions Icon",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify Destination field is \"Dublin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitons.Initialise_Driver()"
});
formatter.result({
  "duration": 7714323600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitons.navigate_to_BBC_Site()"
});
formatter.result({
  "duration": 4717359400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dublin",
      "offset": 7
    }
  ],
  "location": "StepDefinitons.enter_text_in_the_search_box(String)"
});
formatter.result({
  "duration": 1220197300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitons.click_on_search()"
});
formatter.result({
  "duration": 398421100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dublin",
      "offset": 23
    }
  ],
  "location": "StepDefinitons.verify_left_panel_has_searched_city_as_headline_text(String)"
});
formatter.result({
  "duration": 3295089700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitons.click_directions_icon()"
});
formatter.result({
  "duration": 497883900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dublin",
      "offset": 29
    }
  ],
  "location": "StepDefinitons.verify_destination_field_is_searched_city(String)"
});
formatter.result({
  "duration": 263176900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitons.close_the_browser()"
});
formatter.result({
  "duration": 11104414000,
  "status": "passed"
});
});
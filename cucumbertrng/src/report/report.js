$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeletonDay1/sample.feature");
formatter.feature({
  "name": "Shout Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Saun and Lucia are within range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Saun is 20 meters away from Lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "sample.saun_is_meters_away_from_Lucia(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saun shouts \"Free Coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "sample.saun_shouts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia Listens to the message",
  "keyword": "Then "
});
formatter.match({
  "location": "sample.lucia_Listens_to_the_message()"
});
formatter.result({
  "status": "passed"
});
});
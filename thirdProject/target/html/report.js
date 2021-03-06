$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/website/tests/GoogleTest.feature");
formatter.feature({
  "line": 2,
  "name": "Google Test",
  "description": "",
  "id": "google-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Run"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Testing the Google site",
  "description": "",
  "id": "google-test;testing-the-google-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search \"School\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Google results page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleTest_stepsDefs.i_am_on_website()"
});
formatter.result({
  "duration": 12378169382,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "School",
      "offset": 10
    }
  ],
  "location": "GoogleTest_stepsDefs.i_search_for(String)"
});
formatter.result({
  "duration": 0,
  "error_message": "cucumber.runtime.AmbiguousStepDefinitionsException: ✽.When I search \"School\"(com/website/tests/GoogleTest.feature:6) matches more than one step definition:\n  ^I search \"(.*)\"$ in GoogleTest_stepsDefs.i_search_for(String)\n  ^I search (.*)$ in YahooTest_stepDefs.i_search(String)\n\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:71)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:266)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:78)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:212)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:68)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:483)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)\n",
  "status": "failed"
});
formatter.match({
  "location": "GoogleTest_stepsDefs.google_results_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1794590358,
  "status": "passed"
});
});
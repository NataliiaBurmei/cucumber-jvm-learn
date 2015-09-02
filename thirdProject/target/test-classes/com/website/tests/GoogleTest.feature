@Run
Feature: Google Test

  Scenario: Testing the Google site
    Given I am on website
    When I search "School"
    Then Google results page should be displayed
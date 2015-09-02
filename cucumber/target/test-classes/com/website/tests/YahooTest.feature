@DontRun
Feature: Yahoo Test
  Scenario: Yahoo Search news test
    Given I am on Yahoo on Yahoo news website
    When I search health
    Then I should get the health  news
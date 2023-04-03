@AGL-418
Feature: Tasks function feature
  As a user, I should be able to use Tasks function on Tasks Page


  @AGL-416
  Scenario: User should be able to display tasks "In Progress" by clicking "All " tab.
    Given user is on the Tasks page
    When user clicks All tab
    Then user should be able to display tasks -In progress-

  @AGL-417
  Scenario: User should be able to display tasks "Ongoing" by clicking "Ongoing" tab.
    Given user is on the Tasks page
    When user clicks Ongoing tab
    Then user should be able to display tasks -Ongoing-

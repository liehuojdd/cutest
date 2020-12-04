Feature: Basic Add Test

  Background: give x and y value
    Given x and y value

  Scenario: Addition
    Given x is 4 and y is 5
    When invoke add Method
    Then the result is 9

  Scenario: Sub
    And sub operation
    When invoke calculate button
    Then the result is x-y
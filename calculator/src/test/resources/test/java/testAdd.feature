@tag
Feature: Test add function of calculator

@tag1
Scenario: Add two numbers
    Given init the object of calculator
    When clear the result to zero
    And add 2 and 3
    Then check the actual result 5

@tag1
Scenario Outline: Add two numbers outline
    Given init the object of calculator
    When clear the result to zero
    And add <num1> and <num2>
    Then check the actual result <expected>

    Examples:
      | num1 | num2 | expected |
      |  1   |  2   |    3     |
      |  2   |  3   |    5     |
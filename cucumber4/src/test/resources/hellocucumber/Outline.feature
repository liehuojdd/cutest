Feature: With Scenario Outline

  #Background: public steps
  #  Given public steps wit Scenario Outline
  Background: public steps
     Given public steps with Scenario Outline

  @v1.0.0
  Scenario Outline: use failed username and password
    When use failed "<UserName>" and "<Password>" to login
    Then return failed

    Examples:
      | UserName | Password |
      | hzqiuxm  | 123321   |
      | simon    | 123321   |

  @v1.0.1
  Scenario: use right username and password
    When use right "hzqiuxm" and "123456" to login
    Then return pass
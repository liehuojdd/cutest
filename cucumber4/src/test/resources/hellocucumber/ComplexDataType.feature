Feature: Complex data type

  Scenario: multiple then keywords
    Given the user account infomation
    Then we can found user "hzqiuxm", with password "123456", phone "13989461462"
    Then we can found user "linjiangxian", with password "123456", phone "13989461462"
    Then we can found user "queqiaoxian", with password "123456", phone "13989461462"

  Scenario:
    Given use complex data
    Then verify user account info
      | name    | password | phone |
      | hzqiuxm | 123456   | 13989461462 |
      | linjiangxian | 123456   | 13989461462 |
      | queqiaoxian | 123456   | 13989461462 |
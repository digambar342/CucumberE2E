Feature: SuaceDemo
  Scenario Outline: Login with valid credentials
    Given user enters correct userName "<userName>"
    And user enters correct password "<password>"
    Examples:
      |userName      | password   |
      |standard_user |secret_sauce|
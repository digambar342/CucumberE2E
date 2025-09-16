Feature: SuaceDemo2

  Scenario Outline: Login with incorrect username
    Given user enters correct userName "<userName>"
    And user enters correct password "<password>"
    And user clicks on submit button
    And user verifies the error message
    Examples:
      |userName      | password   |
      |standard_user1 |secret_sauce|

  Scenario Outline: Login with incorrect username2
    Given user enters correct userName "<userName>"
    And user enters correct password "<password>"
    And user clicks on submit button
    And user verifies the error message
    Examples:
      |userName      | password   |
      |standard_user2 |secret_sauce|
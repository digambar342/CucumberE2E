Feature: SuaceDemo3

  Scenario Outline: Login with incorrect password
    Given user enters correct userName "<userName>"
    And user enters correct password "<password>"
    And user clicks on submit button
    And user verifies the error message
    Examples:
      |userName      | password   |
      |standard_user |secret_sauce1|

  Scenario Outline: Login with incorrect password2
    Given user enters correct userName "<userName>"
    And user enters correct password "<password>"
    And user clicks on submit button
    And user verifies the error message
    Examples:
      |userName      | password   |
      |standard_user |secret_sauce2|
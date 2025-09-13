Feature: SuaceDemo1
  Scenario Outline: Login with valid credentials
    Given user enters correct userName "<userName>"
    And user enters correct password "<password>"
    And user clicks on submit button
    And user verifies that product page appears
    Examples:
      |userName      | password   |
      |standard_user |secret_sauce|
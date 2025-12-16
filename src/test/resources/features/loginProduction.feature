@prod
Feature: Login feature- Production
    In order to sucessful login
    As a user
    I have to enter correct username and password

  Scenario Outline: Login to facebook website with as user in Production
    Given user navigates to facebook website
    When user validates the homepage title
    Then user enters the "<username>" username
    And user enters the "<password>" password
    And user validateds captcha image
    And user clicks on signin button

    Examples:
      | username | password |
      | valid    | valid    |
      | valid    | invalid  |
      | invalid  | valid    |
      | invalid  | invalid  |

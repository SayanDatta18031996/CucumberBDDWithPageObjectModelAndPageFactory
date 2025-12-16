@stagging
Feature: Login feature - Stagging
    In order to sucessful login
    As a user
    I have to enter correct username and password

  Background:
    Given user navigates to facebook website
    When user validates the homepage title

  Scenario: Login to facebook website with as valid user in Stagging
    Then user enters the "valid" username
    And user enters the "valid" password
    And user validateds captcha image
    And user clicks on signin button

  Scenario: Login to facebook website with as invalid user in Stagging
    Then user enters the "invalid" username
    And user enters the "invalid" password
    And user validateds captcha image
    And user clicks on signin button

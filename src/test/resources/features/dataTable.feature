@datatable
Feature: Login feature - data table
    In order to sucessful login
    As a user
    I have to enter correct username and password

  Background:
    Given user navigates to facebook website
    When user validates the homepage title

  Scenario Outline: Login to facebook website with as valid user in datatable
    Then user enters the "valid" username
    And user enters the "valid" password
    And user validateds captcha image
    And user enter "<firstName>" and "<lastName>"
      | firstname | lastname |
      | Sayan     | Datta    |
      | Dani      | Danials  |
    And user clicks on signin button

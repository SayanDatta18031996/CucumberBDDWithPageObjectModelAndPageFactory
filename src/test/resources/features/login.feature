Feature: Login feature
	In order to sucessful login
	As a user
	I have to enter correct username and password

  Scenario: Login to facebook website
    Given user navigates to facebook website
    When user validates the homepage title
    Then user enters the username
    And user enters the password
    And Then user clicks on signin button

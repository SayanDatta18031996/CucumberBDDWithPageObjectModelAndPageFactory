package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    
    @Given("user navigates to facebook website")
    public void user_navigates_to_facebook_website() {
        System.out.println("--- Running @Given: user navigates to facebook website ---");
        // Actual browser navigation code goes here
    }

    @When("user validates the homepage title")
    public void user_validates_the_homepage_title() {
        System.out.println("--- Running @When: user validates the homepage title ---");
        // Actual title validation code goes here
    }

    @Then("user enters the {string} username")
    // The value from the <username> column is passed as the 'username' parameter.
    public void user_enters_the_username(String username) {
        System.out.println("--- Running @Then: Entering username: " + username + " ---");
        // Code to enter 'username' into the username field goes here
    }

    @And("user enters the {string} password")
    // The value from the <password> column is passed as the 'password' parameter.
    public void user_enters_the_password(String password) {
        System.out.println("--- Running @And: Entering password: " + password + " ---");
        // Code to enter 'password' into the password field goes here
    }

    @And("user clicks on signin button")
    public void user_clicks_on_signin_button() {
        System.out.println("--- Running @And: Clicking signin button ---");
        // Code to click the signin button goes here
    }
}
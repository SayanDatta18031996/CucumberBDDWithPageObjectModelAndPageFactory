package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user navigates to facebook website")
	public void user_navigates_to_facebook_website() {
	    System.out.println("@Given -- user navigates to facebook website");
	}

	@When("user validates the homepage title")
	public void user_validates_the_homepage_title() {
		System.out.println("@When -- user validates the homepage title");
	}

	@Then("user enters the username")
	public void user_enters_the_username() {
		System.out.println("@Then -- user enters the username");
	}

	@And("user enters the password")
	public void user_enters_the_password() {
		System.out.println("@And -- user enters the password");
	}

	@And("Then user clicks on signin button")
	public void then_user_clicks_on_signin_button() {
		System.out.println("@And -- Then user clicks on signin button");
	}

}

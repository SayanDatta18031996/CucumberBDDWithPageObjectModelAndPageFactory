package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All - Connect DB");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All - Closing DB connection");
	}
	@Before
	public void setUp() {
		System.out.println("Before test - Openning browser");
	}
	@After
	public void tearDown() {
		System.out.println("After test - Closing browser");
	}
	@BeforeStep("@stagging")
	public void beforeStep() {
		System.out.println("Before Step - Adding log");
	}
	@AfterStep("@stagging")
	public void afterStep() {
		System.out.println("After Step - Deleting log");
	}
}

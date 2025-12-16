package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",tags="@datatable", glue = { "steps" }, plugin = {
		"html:target/cucumber-reports/cucumber-html-reports.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class RunCukes extends AbstractTestNGCucumberTests {

}

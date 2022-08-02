 package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfigurator;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ("classpath:features"),
		glue="step.definition",
		tags = "@Regression",
		dryRun = false,
		monochrome = true,
		plugin = {
				"pretty",
				"html:target/htmlReports/cucumber-pretty",
				"json:target/jsonReports/cucumber.json"
		},
		publish = true
		)

public class TestRunner {
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfigurator.reportConfig();
	}
}

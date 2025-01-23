package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featurefiles/demo.feature", // Path to your feature file
		glue = "stepdefinations/login", // Package containing step definition classes
		plugin = { "pretty", "html:report/login/cucumber-reports.html",
				"json:report/login/cucumber.json" }, monochrome = true)
public class LoginPageRunner extends AbstractTestNGCucumberTests {

}

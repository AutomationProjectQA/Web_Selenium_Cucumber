package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featurefiles/demo.feature", // Path to your feature file
		glue = "stepdefinations/firstPage", // Package containing step definition classes
		plugin = { "pretty", "html:report/module/cucumber-reports.html",
				"json:report/module/cucumber.json" }, monochrome = true)
public class FirstPageRunner extends AbstractTestNGCucumberTests {

}

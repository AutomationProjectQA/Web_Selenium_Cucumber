package stepdefinations.login;

import org.testng.SkipException;

import io.cucumber.core.backend.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class loginHook {

	private static boolean isPreviousScenarioFailed = false; // Flag to track failure
	private static boolean isDataScenarioSkipp = false;

	@Before
	public void beforeScenario(Scenario scenario) {
		if (isPreviousScenarioFailed || isDataScenarioSkipp) {
			// If the previous scenario failed, skip the current one
			System.out.println("Skipping scenario due to previous failure: " + scenario.getName());
			throw new SkipException("Skipping this scenario due to previous failure."); // This will abort the
																						// current scenario
		}
	}

	@After
	public void afterScenario(Scenario scenario) {
		System.out.println(scenario.getStatus().toString());
		if (scenario.isFailed()) {
			System.out.println("Scenario failed: " + scenario.getName());
			isPreviousScenarioFailed = true; // Mark flag if the current scenario fails
		} else if (scenario.getStatus().toString().equals(Status.SKIPPED.toString())) {
			System.out.println("Scenario failed: " + scenario.getName());
			isDataScenarioSkipp = true; // Mark flag if the current scenario fails

		} else {
			isPreviousScenarioFailed = false; // Reset the flag if the scenario passes
			isDataScenarioSkipp = false;
		}
	}
}

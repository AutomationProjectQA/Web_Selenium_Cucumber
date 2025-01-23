package stepdefinations.firstPage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Firstpage {

	// Scenario 1: Title of your scenario
	@Given("I want to write a step with precondition")
	public void givenPrecondition() {
		System.out.println("Precondition step executed.");
	}

	@And("some other precondition")
	public void givenOtherPrecondition() {
		System.out.println("Other precondition executed.");
	}

	@When("I complete action")
	public void whenCompleteAction() {
		System.out.println("Action completed.");
	}

	@And("some other action")
	public void whenOtherAction() {
		System.out.println("Other action completed.");
	}

	@And("yet another action")
	public void whenYetAnotherAction() {
		System.out.println("Yet another action completed.");
	}

	@Then("I validate the outcomes")
	public void thenValidateOutcomes() {
		System.out.println("Outcomes validated.");
		Assert.assertFalse(true);
	}

	@And("check more outcomes")
	public void thenCheckMoreOutcomes() {
		System.out.println("More outcomes checked.");
	}

	// Scenario Outline: Title of your scenario outline
	@Given("I want to write a step with {string}")
	public void givenStepWithName(String name) {
		System.out.println("Step with name: " + name);
	}

	@When("I check for the {int} in step")
	public void whenCheckForValue(int value) {
		System.out.println("Checked for value: " + value);
	}

	@Then("I verify the {string} in step")
	public void thenVerifyStatus(String status) {
		// For the purpose of demonstration, let's assume the verification is simple:
		System.out.println("Verification of status: " + status);
		assertEquals(status, "success"); // Simple check for "success"
	}
}

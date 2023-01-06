package com.tremend.practice.keywords;

import com.tremend.practice.steps.InputFormDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InputFormKeywords {

    @Steps
    private InputFormDemoSteps inputFormDemoSteps;

    @Given("the user is on input form validation page")
    public void theUserIsOnInputFormValidationPage() {
        inputFormDemoSteps.user_navigates_to_input_form_page();
    }

    @When("he enters a correct first name")
    public void heEntersACorrectFirstName() {
        inputFormDemoSteps.user_enters_a_valid_first_name();
    }

    @Then("the first name field should be valid")
    public void theFirstNameFieldShouldBeValid() {
        inputFormDemoSteps.user_expects_ok_item_to_be_displayed();
    }

    @When("he enters a correct last name")
    public void heEntersACorrectLastName() {
        inputFormDemoSteps.user_enters_a_valid_last_name();
    }

    @Then("the last name field should be valid")
    public void theLastNameFieldShouldBeValid() {
        inputFormDemoSteps.user_expects_last_name_ok_item_to_be_displayed();
    }
}

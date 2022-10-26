package com.tremend.practice.keywords;

import com.tremend.practice.steps.InputFormsValidationSteps;
import com.tremend.practice.steps.MultipleCheckboxDemoSteps;
import com.tremend.practice.util.InputFormTestConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InputFormsValidationKeywords {

    @Steps
    private InputFormsValidationSteps inputFormsValidationSteps;

    @Given("that the user is on input form validations page")
    public void thatTheUserIsOnInputFormValidationsPage() {
        inputFormsValidationSteps.user_navigates_to_page();
    }

    @When("the user input the form without completing the first name field")
    public void theUserInputTheFormWithoutCompletingTheFirstNameField() {
        inputFormsValidationSteps.user_submits_form();
    }

    @Then("an error message is shown for first name field")
    public void anErrorMessageIsShownForFirstNameField() {
        inputFormsValidationSteps.assert_first_name_validation_error(1, InputFormTestConstants.START_ERROR_MESSAGE + "firstname");
    }
}

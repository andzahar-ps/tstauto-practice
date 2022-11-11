package com.tremend.practice.keywords;

import com.tremend.practice.steps.InputFormsValidationSteps;
import com.tremend.practice.util.InputFormTestConstants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InputFormsValidationKeywords {

    @Steps
    private InputFormsValidationSteps inputFormsValidationSteps;

    // ======== GIVEN Keywords

    @Given("that the user is on input form validations page")
    public void thatTheUserIsOnInputFormValidationsPage() {
        inputFormsValidationSteps.user_navigates_to_page();
    }

    // ======== WHEN Keywords

    @When("the user submits the form without completing the phone number field")
    public void theUserSubmitsTheFormWithoutCompletingThePhoneNumberField() {
        inputFormsValidationSteps.user_submits_form();
    }

    @When("the user inputs invalid data in the phone number field")
    public void theUserInputsInvalidDataInThePhoneNumberField() {
        inputFormsValidationSteps.user_sets_phone_number_field("123");
    }

    @When("the user inputs a valid number in the phone number field")
    public void theUserInputsAValidNumberInThePhoneNumberField() {
        inputFormsValidationSteps.user_sets_phone_number_field("0722222222");
    }

    @And("the user clicks outside the phone number input filed")
    public void theUserClicksOutsideThePhoneNumberInputField(){
        inputFormsValidationSteps.user_clicks_address_field();
    }

    // ======== THEN Keywords

    @Then("an error message is shown for phone number field")
    public void anErrorMessageIsShownForPhoneNumberField() {
        inputFormsValidationSteps.assert_phone_number_error(InputFormTestConstants.START_ERROR_MESSAGE + "phone number");
        inputFormsValidationSteps.assert_phone_number_error_icon_is_displayed("remove");
    }

    @Then("an error message is displayed for the phone number field")
    public void anErrorMessageIsDisplayedForThePhoneNumberField() {
        inputFormsValidationSteps.assert_invalid_phone_number_error("Please supply a vaild phone number with area code");
        inputFormsValidationSteps.assert_phone_number_error_icon_is_displayed("remove");
    }

    @Then("a success icon is displayed on the right side of the phone number field")
    public void aSuccessIconIsDisplayedOnTheRightSideOfThePhoneNumberField() {
        inputFormsValidationSteps.assert_phone_number_ok_icon_is_displayed("ok");
    }

    @Then("all error messages are displayed")
    public void allErrorMessagesAreDisplayed() {
        inputFormsValidationSteps.assert_number_of_error_messages(9);
    }
}


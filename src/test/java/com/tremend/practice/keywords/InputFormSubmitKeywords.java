package com.tremend.practice.keywords;

import com.tremend.practice.steps.InputFormSubmitSteps;
import com.tremend.practice.util.InputFormSubmitConstants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InputFormSubmitKeywords {

    @Steps
    private InputFormSubmitSteps inputFormSubmitSteps;



    // ================ First Scenario Keywords -> First Name Field

    // ======== GIVEN Keywords


    @Given("the user navigated to the input form submit page")
    public void theUserNavigatedToTheInputFormSubmitPage() {
        inputFormSubmitSteps.navigate_to_input_form_submit_page();
    }


    // ======== WHEN Keywords

    @When("the user clicks on the send button")
    public void theUserClicksOnTheSendButton() {
        inputFormSubmitSteps.the_user_clicks_send_button();
    }

    @And("the field displays an error message")
    public void theFieldDisplaysAnErrorMessage() {
        inputFormSubmitSteps.assert_displayed_error_message(InputFormSubmitConstants.ERROR_MESSAGE + "first name");
    }

    @And("the border color of the field turns red")
    public void theBorderColorOfTheFieldTurnsRed() {
        inputFormSubmitSteps.assert_first_name_field_border_color("rgb(169, 68, 66)");
    }

    @And("the field displays an error icon")
    public void theFieldDisplaysAnErrorIcon() {
        inputFormSubmitSteps.assert_error_icon_is_displayed();
    }

    @And("the user fills in the field with valid data")
    public void theUserFillsInTheFieldWithValidData() {
        inputFormSubmitSteps.the_user_fills_first_name_field_with_valid_data("John");
    }

    @And("the border color of the field turns green")
    public void theBorderColorOfTheFieldTurnsGreen() {
        inputFormSubmitSteps.assert_first_name_field_border_color("rgb(60, 118, 61)");
    }

    @And("the user clicks on the last name field")
    public void theUserClicksOnTheLastNameField() {
        inputFormSubmitSteps.the_user_clicks_on_last_name_field();
    }


    // ======== THEN Keywords

    @Then("the field displays a successful icon")
    public void theFieldDisplaysASuccessfulIcon() {
        inputFormSubmitSteps.assert_successful_icon_is_displayed();
    }
}

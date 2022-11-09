package com.tremend.practice.keywords;

import com.tremend.practice.steps.InputFormSubmitSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InputFormSubmitKeywords {

    @Steps
    private InputFormSubmitSteps inputFormSubmitSteps;

    @Given("that the user is on Input Form Submit page")
    public void thatTheUserIsOnInputFormSubmitPage() {
        inputFormSubmitSteps.navigate_to_input_form_submit_page();
    }

    @When("the user selects a value from the State dropdown list")
    public void theUserSelectsAValueFromTheStateDropdownList(String value) {
        inputFormSubmitSteps.the_user_select_state_from_dropdown_list(value);
    }

    @And("clicks on the send button")
    public void clicksOnTheSendButton() {
        inputFormSubmitSteps.the_user_click_send_button();
    }

    @Then("the field displays a successful icon")
    public void theFieldDisplaysASuccessfulIcon() {
        inputFormSubmitSteps.assert_successful_icon_is_displayed();
    }

}

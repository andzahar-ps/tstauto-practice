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


    // ======== GIVEN Keywords


    @Given("the user navigated to the input form submit page")
    public void theUserNavigatedToTheInputFormSubmitPage() {
        inputFormSubmitSteps.navigate_to_input_form_submit_page();
    }


    // ======== WHEN Keywords

    @When("the user clicks on {string}")
    public void theUserClicksOnState(String state) {
        inputFormSubmitSteps.user_clicks_on_state(state);
    }

    @And("the user click on \"Please select your state\"")
    public void theUserClicksOnPleaseSelectYourState() {
        inputFormSubmitSteps.user_clicks_on_please_select_your_state("Please select your state");
    }

    // ======== THEN Keywords

    @Then("an error message is displayed")
    public void assert_message_is_displayed() {
        inputFormSubmitSteps.assert_message_is_displayed("Please select your state");
    }
}


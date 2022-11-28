package com.tremend.practice.keywords;

import com.tremend.practice.steps.AjaxFormSubmitSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AjaxFormSubmitKeywords {

    @Steps
    AjaxFormSubmitSteps ajaxFormSubmitSteps;

    @Given("that the user is on ajax form submit page")
    public void thatTheUserIsOnTheAjaxFormSubmit() {
        ajaxFormSubmitSteps.navigate_to_ajax_form_submit_page();
    }

    @When("the user enters data in both of the fields")
    public void theUserEntersDataInBothOfTheFields(String value1, String value2) {
        ajaxFormSubmitSteps.the_user_fills_in_the_name_input(value1);
        ajaxFormSubmitSteps.the_user_fills_in_the_comment_input(value2);
    }

    @And("the user clicks the Submit button")
    public void theUserClicksTheSubmitButton() {
        ajaxFormSubmitSteps.the_user_clicks_the_submit_button();
    }

    @Then("a success message is displayed")
    public void aSuccessMessageIsDisplayed() {
        ajaxFormSubmitSteps.wait_for_ajax_message_to_disappear();
        ajaxFormSubmitSteps.assert_successful_message_is_displayed("Form submited Successfully!");

    }



}

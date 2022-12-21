package com.tremend.practice.keywords;

import com.tremend.practice.steps.AjaxFormSubmitSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AjaxFormSubmitKeywords {

    @Steps
    private AjaxFormSubmitSteps ajaxFormSubmitSteps;


    @Given("that the user is AjaxFormSubmit page")
    public void thatTheUserIsAjaxFormSubmitPage() {

        ajaxFormSubmitSteps.navigate_to_ajax_form_submit_page();
    }


    // ======== WHEN Keywords

    @When("the user fills in the required fields")
    public void theUserFillsInTheRequiredFields() {
        ajaxFormSubmitSteps.the_user_fills_in_title_field("Happy");
        ajaxFormSubmitSteps.the_user_fills_in_description_field("Friday");
    }

    @And("the user clicks on submit button")
    public void theUserClicksOnSubmitButton() {
        ajaxFormSubmitSteps.the_user_clicks_the_submit_button();
    }

    // ======== THEN Keywords

    @Then("a successful message is displayed")
    public void aSuccessfulMessageIsDisplayed() {
        ajaxFormSubmitSteps.wait_for_the_ajax_message_to_disappear();
        ajaxFormSubmitSteps.assert_message_is_displayed("Form submited Successfully!");
    }

    @Then("a successful message is displayed after the loading spinner disappears")
    public void aLoadingSpinnerIsPresent() {
//        ajaxFormSubmitSteps.assert_loading_spinner_is_present("LoaderIcon.gif");
        ajaxFormSubmitSteps.wait_for_the_loading_spinner_to_disappear();
        ajaxFormSubmitSteps.assert_message_is_displayed("Form submited Successfully!");
    }
}


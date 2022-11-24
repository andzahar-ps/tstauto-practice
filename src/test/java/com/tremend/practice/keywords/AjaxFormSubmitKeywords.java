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


    // ========= Ajax Form Submit keywords


    // ====== GIVEN Keywords

    @Given("the user navigates to the Ajax Form Submit page")
    public void theUserNavigatesToTheAjaxFormSubmitPage() {
        ajaxFormSubmitSteps.navigate_to_ajax_form_submit_page();
    }


    // ====== WHEN Keywords

    @When("the user fills in both of the fields")
    public void theUserFillsInBothOfTheFields() {
        ajaxFormSubmitSteps.the_user_fills_in_name_field("ASDA Project");
        ajaxFormSubmitSteps.the_user_fills_in_comment_field("ASDA team is the best team");
    }


    // ====== AND Keywords

    @And("the user clicks the Submit button")
    public void theUserClicksTheSubmitButton() {
        ajaxFormSubmitSteps.the_user_clicks_the_submit_button();
    }


    // ====== THEN Keywords

    @Then("a successful message is displayed")
    public void aSuccessfulMessageIsDisplayed() {
        ajaxFormSubmitSteps.wait_for_ajax_message_to_disappear();
        ajaxFormSubmitSteps.assert_successful_message_is_shown("Form submited Successfully!");
    }
}

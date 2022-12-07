package com.tremend.practice.keywords;

import com.tremend.practice.steps.AjaxSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AjaxKeywords {

    @Steps
    private AjaxSteps ajaxSteps;

    // ======== GIVEN Keywords

    @Given("that the user is on ajax form submit page")
    public void thatTheUserIsOnAjaxFormSubmitPage() {
        ajaxSteps.user_navigates_to_ajax_form_page();
    }

    // ======== WHEN Keywords

    @When("that the user enters valid data in the form")
    public void thatTheUserEntersValidDataInTheForm() {
        ajaxSteps.user_sets_name_field("island");
        ajaxSteps.user_sets_comment_field("boy");
    }

    // ======== AND Keywords

    @And("the user clicks the submit button")
    public void theUserClicksTheSubmitButton() {
        ajaxSteps.user_clicks_submit_button();
    }

    // ======== THEN Keywords

    @Then("a success message is displayed under the form")
    public void aSuccessMessageIsDisplayedUnderTheForm() {
        ajaxSteps.wait_for_ajax_message_to_disappear();
        ajaxSteps.assert_success_message_is_displayed("Form submited Successfully!");
    }

    @Then("a success message appears under the form")
    public void aSuccessMessageAppearsUnderTheForm() {
        ajaxSteps.wait_for_ajax_spinner_to_disappear();
        ajaxSteps.assert_success_message_is_displayed("Form submited Successfully!");

    }

}

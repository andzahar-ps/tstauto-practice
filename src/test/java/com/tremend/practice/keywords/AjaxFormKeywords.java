package com.tremend.practice.keywords;

import com.tremend.practice.steps.AjaxFormDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class AjaxFormKeywords {

    @Steps
    AjaxFormDemoSteps ajaxFormSteps;

    @Given("user is on Ajax Form Submit page")
    public void userIsOnAjaxFormSubmitPage() {
        ajaxFormSteps.user_navigates_to_ajax_form_demo_page();
    }

    @When("he tries to submit his name and a comment")
    public void heTriesToSubmitHisNameAndAComment() {
        ajaxFormSteps.user_completes_name_and_comment();
    }

    @Then("he should see that the form is processed")
    public void heShouldSeeThatTheFormIsProcessed() {
        ajaxFormSteps.user_should_see_that_the_form_is_being_processed();
    }
}

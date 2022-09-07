package com.tremend.practice.keywords;

import com.tremend.practice.steps.SingleCheckboxDemoSteps;
import com.tremend.practice.steps.SubscribeModalSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class SingleCheckboxDemoKeywords {

    @Steps
    private SingleCheckboxDemoSteps singleCheckboxDemoSteps;
    @Steps
    private SubscribeModalSteps subscribeModalSteps;


    // ================ GIVEN Keywords

    @Given("the user is on the Checkbox Demo page")
    public void theUserIsOnTheSingleCheckboxDemoPage() {
        singleCheckboxDemoSteps.navigate_to_checkbox_demo();
//        subscribeModalSteps.the_user_closes_the_subscribe_modal();
    }


    // ================ WHEN Keywords

    @When("the user selects the age checkbox")
    public void theUserSelectsTheAgeCheckbox() {
        singleCheckboxDemoSteps.the_user_selects_checkbox();
    }


    // ================ THEN Keywords

    @Then("a {string} is displayed")
    public void aIsDisplayed(String message) {
        singleCheckboxDemoSteps.assert_success_message_is_displayed(message);
    }
}

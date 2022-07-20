package com.tremend.practice.keywords;

import com.tremend.practice.steps.SimpleFormDemoSteps;
import com.tremend.practice.steps.SubscribeModalSteps;
import com.tremend.practice.tpages.SimpleFormDemoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SimpleFormDemoKeywords {

    @Steps
    SimpleFormDemoSteps simpleFormDemoSteps;
    @Steps
    SubscribeModalSteps subscribeModalSteps;


    // ========== GIVEN Keywords


    @Given("that the user is on Simple form page")
    public void thatTheUserIsOnSimpleFormPage() {
        simpleFormDemoSteps.navigate_to_simple_form_page();
        subscribeModalSteps.user_closes_the_subscribe_modal();
    }


    // ========== WHEN Keywords

    @When("the user submits a value in the input field")
    public void theUserSubmitsAValueInTheInputField() {
        simpleFormDemoSteps.username_sets_user_message_field("asta este textul nostru");
        simpleFormDemoSteps.username_clicks_show_message_button();
    }


    // ========== THEN Keywords

    @Then("that values is displayed")
    public void thatValuesIsDisplayed() {
        simpleFormDemoSteps.assert_message_is_displayed("asta este textul nostru");
    }
}

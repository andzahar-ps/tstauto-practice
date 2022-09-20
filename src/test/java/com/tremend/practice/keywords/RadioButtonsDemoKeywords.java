package com.tremend.practice.keywords;

import com.tremend.practice.steps.RadioButtonsDemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RadioButtonsDemoKeywords {

    @Steps
    private RadioButtonsDemoSteps radioButtonsDemoSteps;

    // ========== GIVEN Keywords

    @Given("that the user navigates to radio buttons page")
    public void that_the_user_navigates_to_radio_buttons_page() {
        radioButtonsDemoSteps.navigate_to_radio_buttons_page();
    }

    // ========== WHEN Keywords

    @When("the user clicks on {string} radio button")
    public void the_user_clicks_on_a_radio_button(){
        radioButtonsDemoSteps.user_clicks_on_get_checked_value_button();
    }

    // ========== And Keywords
    @And("the user clicks on 'Get checked value' button")
    public void the_user_clicks_on_get_checked_value_button() {
        radioButtonsDemoSteps.user_clicks_on_get_checked_value_button();
    }

    // ========== THEN Keywords

    @Then("the user gets a proper success message containing the checked {string} value")
    public void the_user_gets_success_message_containing_the_checked_value(String message) {
        radioButtonsDemoSteps.assert_message_is_displayed(message);
    }
}

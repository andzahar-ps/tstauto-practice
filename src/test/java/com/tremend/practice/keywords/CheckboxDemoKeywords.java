package com.tremend.practice.keywords;

import com.tremend.practice.steps.CheckboxDemoSteps;
import com.tremend.practice.steps.ModalSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class CheckboxDemoKeywords {

    @Steps
    private CheckboxDemoSteps checkboxDemoSteps;
    @Steps
    private ModalSteps modalSteps;

    // ========== GIVEN Keywords

    @Given("that the user is on checkbox page")
    public void that_the_user_is_on_checkbox_page() {
        checkboxDemoSteps.navigate_to_checkbox_demo_page();
        modalSteps.user_closes_the_modal();
    }

    // ========== WHEN Keywords

    @When("the user clicks the checkbox button")
    public void the_user_clicks_the_checkbox_button() {
        checkboxDemoSteps.user_clicks_single_checkbox();
    }

    @When("the user clicks the check all button")
    public void the_user_clicks_the_check_all_button(){
        checkboxDemoSteps.the_user_clicks_on_all_checkbox_button();
    }

    @When("the user clicks the uncheck all button")
    public void the_user_clicks_the_uncheck_all_button(){
        checkboxDemoSteps.the_user_clicks_on_all_checkbox_button();
    }

    // ========== AND Keywords

    @And("the checkboxes are selected")
    public void the_checkboxes_are_selected(){
        checkboxDemoSteps.the_user_clicks_on_all_checkbox_button();
    }

    // ========== THEN Keywords

    @Then("a success message is displayed")
    public void a_string_is_displayed(String message) {
        checkboxDemoSteps.assert_message_is_displayed(message);
    }

    @Then("all checkboxes are selected")
    public void all_checkboxes_are_selected() {
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,0);
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,1);
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,2);
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,3);
    }
    @Then("all checkboxes are unselected")
    public void all_checkboxes_are_unselected() {
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,0);
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,1);
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,2);
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,3);
    }

}

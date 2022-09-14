package com.tremend.practice.keywords;

import com.tremend.practice.steps.CheckboxDemoSteps;
import com.tremend.practice.steps.ModalSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckboxDemoKeywords {

    @Steps
    private CheckboxDemoSteps checkboxDemoSteps;
    @Steps
    private ModalSteps modalSteps;

    // ========== GIVEN Keywords

    @Given("that the user is on Checkbox page")
    public void thatTheUserIsOnCheckboxPage() {
        checkboxDemoSteps.navigate_to_checkbox_demo_page();
        modalSteps.user_closes_the_modal();
    }

    @When("the user clicks the checkbox button")
    public void theUserClicksTheCheckboxButton() {
        checkboxDemoSteps.user_clicks_single_checkbox();
    }

    @Then("a {string} is displayed")
    public void aSuccessMessageIsDisplayed(String label) {
        checkboxDemoSteps.success_message_is_displayed(label);
    }

}

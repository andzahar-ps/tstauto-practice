package com.tremend.practice.keywords;

import com.tremend.practice.steps.CheckBoxDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckBoxKeywords {
    @Steps
    private CheckBoxDemoSteps checkBoxDemoSteps;

    @Given("that the user is on Check Box page")
    public void thatTheUserIsOnCheckBoxPage() {
        checkBoxDemoSteps.user_navigates_to_simple_checkbox_demo_page();
    }

    @When("the user click on the single Check Box item")
    public void theUserClickOnTheSingleCheckBoxItem() {
        checkBoxDemoSteps.user_clicks_on_single_checkbox();
    }

    @Then("the message {string} is displayed")
    public void theMessageIsDisplayed(String message) {
        checkBoxDemoSteps.user_checks_that_the_success_message_is_displayed(message);
    }

    @When("the user check all the checkboxes")
    public void theUserCheckAllTheCheckboxes() {
        checkBoxDemoSteps.user_clicks_on_all_checkboxes();
    }

    @Then("the button display the message {string}")
    public void theButtonDisplayTheMessage(String message) {
        checkBoxDemoSteps.check_button_message(message);
    }
}

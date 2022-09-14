package com.tremend.practice.keywords;

import com.tremend.practice.steps.SingleCheckBoxDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SingleCheckBoxDemoKeywords {

    @Steps
    SingleCheckBoxDemoSteps  singleCheckBoxDemoSteps;

    @Given("that the user is on the CheckBox Demo page")
    public void thatTheUserIsOnTheCheckBoxDemoPage() {
        singleCheckBoxDemoSteps.navigate_to_simple_checkbox_demo_page();
    }

    @When("the user selects the checkbox")
    public void theUserSelectsTheCheckbox() {
        singleCheckBoxDemoSteps.select_check_box();
    }

    @Then("a {string} is displayed")
    public void aIsDisplayed(String arg) {
        singleCheckBoxDemoSteps.assert_message_is_displayed(arg);
    }
}

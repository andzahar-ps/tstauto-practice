package com.tremend.practice.keywords;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.tremend.practice.steps.BasicCheckBoxDemoSteps;
import net.thucydides.core.annotations.Steps;

public class BasicCheckBoxDemoKeywords {

    @Steps
    BasicCheckBoxDemoSteps basicCheckBoxDemoSteps;

    @Given("the user is on simple checkbox page")
    public void theUserIsOnSimpleCheckboxPage() {
        basicCheckBoxDemoSteps.navigate_to_check_box_demo_page();
    }

    @When("the user clicks on the checkbox")
    public void theUserClicksOnTheCheckbox() {
        basicCheckBoxDemoSteps.user_clicks_on_the_checkbox();
    }

    @Then("a message {string} is displayed")
    public void messageIsDisplayed(String message) {
        basicCheckBoxDemoSteps.assert_success_message_is_displayed("Success - Check box is checked");
    }


    @Given("the user is on multiple checkbox page")
    public void theUserIsOnMultipleCheckboxPage() {
        basicCheckBoxDemoSteps.navigate_to_check_box_demo_page();
    }

    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String arg0) {
        basicCheckBoxDemoSteps.user_clicks_check_all_button();
    }

    @Then("the user sees all checkboxes are selected")
    public void theUserSeesAllCheckboxesAreSelected() {
        basicCheckBoxDemoSteps.assert_check_box_selected_state(true,0);
        basicCheckBoxDemoSteps.assert_check_box_selected_state(true,1);
        basicCheckBoxDemoSteps.assert_check_box_selected_state(true,2);
        basicCheckBoxDemoSteps.assert_check_box_selected_state(true,3);
    }
}

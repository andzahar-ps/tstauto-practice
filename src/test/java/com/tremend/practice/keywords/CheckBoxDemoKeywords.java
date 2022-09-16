package com.tremend.practice.keywords;

import com.tremend.practice.steps.CheckBoxDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckBoxDemoKeywords {

    @Steps
    CheckBoxDemoSteps checkBoxDemoSteps;

    @Given("that the user is on the CheckBox Demo page")
    public void thatTheUserIsOnTheCheckBoxDemoPage() {
        checkBoxDemoSteps.navigate_to_checkbox_demo_page();
    }

    @When("the user selects the checkbox")
    public void theUserSelectsTheCheckbox() {
        checkBoxDemoSteps.select_check_box();
    }

    @Then("a {string} message is displayed")
    public void aIsDisplayed(String arg) {
        checkBoxDemoSteps.assert_message_is_displayed(arg);
    }

    //Multiple Checkbox

    @Given("that the user is on the multiple CheckBox Demo Page")
    public void thatTheUserIsOnTheMultipleCheckBoxDemoPage() {
        checkBoxDemoSteps.navigate_to_checkbox_demo_page();
    }

    @When("the user click on the check all button")
    public void theUserClickOnTheButton() {
        checkBoxDemoSteps.the_user_click_on_all_checkboxes_button();
    }

    @Then("all the checkboxes are selected")
    public void allTheCheckboxesAreUnselected() {
        checkBoxDemoSteps.assert_checkbox_selection_state_is(true, 0);
        checkBoxDemoSteps.assert_checkbox_selection_state_is(true, 1);
        checkBoxDemoSteps.assert_checkbox_selection_state_is(true, 2);
        checkBoxDemoSteps.assert_checkbox_selection_state_is(true, 3);
    }
}

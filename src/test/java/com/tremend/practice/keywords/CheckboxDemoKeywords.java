package com.tremend.practice.keywords;

import com.tremend.practice.steps.CheckboxDemoSteps;
import com.tremend.practice.steps.SubscribeModalSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class CheckboxDemoKeywords {

    @Steps
    private CheckboxDemoSteps checkboxDemoSteps;
    @Steps
    private SubscribeModalSteps subscribeModalSteps;


    // ================ GIVEN Keywords

    @Given("that the user is on Simple checkbox page")
    public void theUserIsOnCheckboxDemoPage() {
        checkboxDemoSteps.navigate_to_checkbox_demo_page();
//        subscribeModalSteps.the_user_closes_the_subscribe_modal();
    }


    // ================ WHEN Keywords

    @When("the user clicks on the checkbox")
    public void theUserClicksOnTheCheckbox() {
        checkboxDemoSteps.the_user_clicks_on_the_checkbox();
    }

    @When("the user clicks the uncheck all button")
    public void clickOnTheFirstCheckbox() {
        checkboxDemoSteps.the_user_clicks_on_all_checkboxes_button();
    }

        // ================ THEN Keywords

    @Then("the message {string} is displayed")
    public void messageIsDisplayed(String message) {
          checkboxDemoSteps.assert_success_message_is_displayed(message);
        }

    @Then("all the checkboxes are unselected")
    public void allTheCheckboxesAreUnselected() {
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,0);
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,1);
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,2);
        checkboxDemoSteps.assert_checkbox_selection_state_is(true,3);
    }


}
package com.tremend.practice.keywords;

import com.tremend.practice.steps.MultipleCheckboxDemoSteps;
import com.tremend.practice.steps.SubscribeModalSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MultipleCheckboxDemoKeywords {

    @Steps
    private MultipleCheckboxDemoSteps multipleCheckboxDemoSteps;
//    @Steps
//    private SubscribeModalSteps subscribeModalSteps;

    // ================ GIVEN Keywords

    @Given("the user is on the Multiple Checkbox Demo page")
    public void theUserIsOnTheMultipleCheckboxDemoPage() {
        multipleCheckboxDemoSteps.navigate_to_checkbox_demo();
//        subscribeModalSteps.the_user_closes_the_subscribe_modal();
    }

    @When("the user clicks the Check All button")
    public void theUserClicksTheCheckAllButton() {
        multipleCheckboxDemoSteps.the_user_clicks_check_all_button();
    }

    @Then("all the checkboxes are selected")
    public void allTheCheckboxesAreSelected() {
        multipleCheckboxDemoSteps.assert_first_checkbox_is_selected(true);
    }
}

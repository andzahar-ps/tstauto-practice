package com.tremend.practice.keywords;

import com.tremend.practice.steps.SimpleFormDemoSteps;
import com.tremend.practice.steps.SubscribeModalSteps;
import com.tremend.practice.tpages.SimpleFormDemoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SimpleFormDemoKeywords {

    @Steps
    private SimpleFormDemoSteps simpleFormDemoSteps;
    @Steps
    private SubscribeModalSteps subscribeModalSteps;


    // ========== GIVEN Keywords


    @Given("that the user is on Simple form page")
    public void thatTheUserIsOnSimpleFormPage() {
        simpleFormDemoSteps.navigate_to_simple_form_page();
      //  subscribeModalSteps.user_closes_the_subscribe_modal();
    }


    // ========== WHEN Keywords

    @When("the user submits the values {string} and {string} in the the two input field")
    public void theUserSubmitsTheValuesAndInTheTheTwoInputField(String aValue, String bValue) {
        simpleFormDemoSteps.user_sets_first_numeric_field(aValue);
        simpleFormDemoSteps.user_sets_second_numeric_field(bValue);
        simpleFormDemoSteps.user_clicks_show_total_button();
    }

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

    @Then("the sum {string} is displayed")
    public void theSumIsDisplayed(String valueSum) {
        simpleFormDemoSteps.assert_label_is_displayed(valueSum);
    }


}

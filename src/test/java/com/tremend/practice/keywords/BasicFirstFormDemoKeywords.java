package com.tremend.practice.keywords;

import com.tremend.practice.steps.BasicFirstFormDemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BasicFirstFormDemoKeywords {

    @Steps
    private BasicFirstFormDemoSteps basicFirstFormDemoSteps;

    @Given("that the user is on basic first form demo")
    public void thatTheUserIsOnBasicFirstFormDemo() {
       basicFirstFormDemoSteps.user_navigates_to_form_page();
    }

    @When("the user inputs first value {string} and second value {string} in the fields")
    public void theUserInputsValuesInTheFields(String valuea, String valueb) {
        basicFirstFormDemoSteps.user_sets_message_to_first_field_with_value(valuea);
        basicFirstFormDemoSteps.user_sets_message_to_second_field_with_value(valueb);
    }
    @And("the user presses the get total button")
        public void theUserPressesTheGetTotalButton(){
        basicFirstFormDemoSteps.user_clicks_on_get_total_button();
    }

    @Then("the sum {string} of the values are displayed")
    public void theSumOfTheValuesAreDisplayed(String valueSum) {
        basicFirstFormDemoSteps.asssert_message_is_displayed(valueSum);
    }
}
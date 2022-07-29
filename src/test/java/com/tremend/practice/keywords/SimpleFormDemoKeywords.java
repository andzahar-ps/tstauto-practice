package com.tremend.practice.keywords;

import com.tremend.practice.steps.LoginSteps;
import com.tremend.practice.steps.TwoInputsSimpleFormDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SimpleFormDemoKeywords {
    @Steps
    TwoInputsSimpleFormDemoSteps twoInputsSimpleFormDemoSteps;


    // ========== GIVEN Keywords


    @Given("that the user is on simple form page and try to introduce a value in the two input fields")
    public void thatTheUserIsOnSimpleFormPageAndTryToIntroduceAValueInTheTwoInputFields() {
        twoInputsSimpleFormDemoSteps.navigate_to_simple_form_page();
    }

    @When("the user submits a value in the first input")
    public void theUserSubmitsAValueInTheFirstInput() {
        twoInputsSimpleFormDemoSteps.set_sum_input_field("dfgd  dgfgfdg");
        twoInputsSimpleFormDemoSteps.click_get_total_button();

    }

    @Then("that value is displayed")
    public void thatValueIsDisplayed() {
        twoInputsSimpleFormDemoSteps.assert_message_is_displayed("valdgfgfdg dgfdgfue");
    }
}

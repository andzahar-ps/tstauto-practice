package com.tremend.practice.keywords;

import com.tremend.practice.steps.TwoInputsSimpleFormDemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SimpleFormDemoKeywords {
    @Steps
    TwoInputsSimpleFormDemoSteps twoInputsSimpleFormDemoSteps;


    // ========== GIVEN Keywords


    @Given("that the user is on simple form page")
    public void thatTheUserIsOnSimpleFormPage() {
        twoInputsSimpleFormDemoSteps.navigate_to_simple_form_page();
    }

    @And("introduce a value in the two input fields")
    public void introduceAValueInTheTwoInputFields(String value1, String value2){
        twoInputsSimpleFormDemoSteps.set_sum_input_field(value1, value2);
    }


    @When("the user submits a value in the first input")
    public void theUserSubmitsAValueInTheFirstInput(String value1, String value2) {
        twoInputsSimpleFormDemoSteps.set_sum_input_field(value1, value2);
        twoInputsSimpleFormDemoSteps.click_get_total_button();

    }

    @Then("that value is displayed")
    public void thatValueIsDisplayed() {
        twoInputsSimpleFormDemoSteps.assert_message_is_displayed("valdgfgfdg dgfdgfue");
    }

}

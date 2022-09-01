package com.tremend.practice.keywords;

import com.tremend.practice.steps.TwoInputFormSteps;
import com.tremend.practice.tpages.TwoInputFormPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TwoInputFormKeywords {

    @Steps
    TwoInputFormSteps twoInputFormSteps;

    // ========== GIVEN Keywords

    @Given("that the user is on Two Input page")
    public void thatTheUserIsOnSimpleFormPage() {
        twoInputFormSteps.navigate_to_simple_demo_page();
    }

    @And("the user enters 2 values in the input fields")
    public void introduceAValueInTheTwoInputFields(String value1, String value2) {
        twoInputFormSteps.user_inserts_input_fields(value1, value2);
    }
    // ========== WHEN Keywords

    @When("the user submits the numeric values from the input fields")
    public void clickGetTotalButton(){
        twoInputFormSteps.click_get_total_button();
    }

    // ========== THEN Keywords


    @Then("the sum is displayed")
    public void getTextDisplayValueLabel() {
        twoInputFormSteps.assert_message_is_displayed("5");
    }
}

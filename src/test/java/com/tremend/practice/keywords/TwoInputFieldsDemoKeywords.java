package com.tremend.practice.keywords;

import com.tremend.practice.steps.TwoInputFieldsDemoSteps;
import com.tremend.practice.tpages.TwoInputFieldsDemoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TwoInputFieldsDemoKeywords {

    @Steps
    TwoInputFieldsDemoSteps twoInputFieldsDemoSteps;

    // ========== GIVEN Keywords

    @Given("that the user is on Simple form page")
    public void thatTheUserIsOnSimpleFormPage() {
        twoInputFieldsDemoSteps.navigate_to_simple_demo_page();
    }


    // ========== WHEN Keywords

    @When("the user submits two numeric values in the input fields")
    public void theUserSubmitsTwoNumericValuesInTheInputFields() {
        twoInputFieldsDemoSteps.user_sets_first_numeric_value("12");
        twoInputFieldsDemoSteps.user_sets_second_numeric_value("1");
        twoInputFieldsDemoSteps.user_clicks_show_total_button();
    }

    // ========== THEN Keywords


    @Then("the sum value is displayed")
    public void theSumValueIsDisplayed() {
        twoInputFieldsDemoSteps.assert_label_is_displayed("13");
    }
}

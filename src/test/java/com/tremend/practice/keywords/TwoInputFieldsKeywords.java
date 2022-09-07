package com.tremend.practice.keywords;
import com.tremend.practice.steps.SubscribeModalSteps;
import com.tremend.practice.steps.TwoInputFieldsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class TwoInputFieldsKeywords {

    @Steps
    private TwoInputFieldsSteps twoInputFieldsSteps;
    @Steps
    private SubscribeModalSteps subscribeModalSteps;


    // ================ GIVEN Keywords

    @Given("the user is on the Simple Form page")
    public void theUserIsOnTheSimpleFormPage() {
        twoInputFieldsSteps.navigate_to_simple_page_demo();
        subscribeModalSteps.the_user_closes_the_subscribe_modal();
    }



    // ================ WHEN Keywords

    @When("the user enters the {string} in the first field")
    public void theUserEntersTheInTheFirstField(String theFirstValue) {
        twoInputFieldsSteps.the_user_sets_value_field_a(theFirstValue);
    }

    @And("the user enters the {string} in the second field")
    public void theUserEntersTheInTheSecondField(String theSecondValue) {
        twoInputFieldsSteps.the_user_sets_value_field_b(theSecondValue);
    }

    @And("the user submits the two numbers")
    public void theUserEntersAnyTwoNumbersInTheInputFields() {
        twoInputFieldsSteps.the_user_clicks_get_total_button();
    }



    // ================ THEN Keywords

    @Then("the {string} is displayed")
    public void theIsDisplayed(String totalValue) {
        twoInputFieldsSteps.assert_total_value_is_displayed(totalValue);
    }
}





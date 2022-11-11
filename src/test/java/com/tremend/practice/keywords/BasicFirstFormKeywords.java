package com.tremend.practice.keywords;

import com.tremend.practice.steps.BasicFirstFormSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BasicFirstFormKeywords {

    @Steps
    private BasicFirstFormSteps basicFirstFormSteps;

    @Given("that the user is on Basic First Form Page")
    public void thatTheUserIsOnBasicFirstFormPage(){
        basicFirstFormSteps.navigate_to_basic_first_form_demo();
    }

    @When("the user inputs text {string} in the input field")
    public void theUserInputsTextInTheInputField(String message){
        basicFirstFormSteps.input_message(message);
        basicFirstFormSteps.click_show_message_button();
    }

    @Then("that text {string} is displayed next to the Your Message section")
    public void thatTextIsDisplayedNextToTheYourMessageSection(String message){
        basicFirstFormSteps.testing_normal_assert(message);
    }

    @When("the user inputs numberA {string} in the field")
    public void theUserInputsNumberAInTheField(String number){
        basicFirstFormSteps.enter_value_a(number);
    }

    @And("the user inputs numberB {string} in the field")
    public void theUserInputsNumberBInTheField(String number){
        basicFirstFormSteps.enter_value_b(number);
    }

    @Then("the user clicks on Get Total button to see the result {string}")
    public void theUserClicksOnGetTotalButtonToSeeTheResult(String number){
        basicFirstFormSteps.get_total_result(number);
    }



}

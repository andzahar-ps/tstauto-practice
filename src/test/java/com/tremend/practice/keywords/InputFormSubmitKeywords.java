package com.tremend.practice.keywords;

import com.tremend.practice.steps.InputFormSubmitSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InputFormSubmitKeywords {

    @Steps
    private InputFormSubmitSteps inputFormSubmitSteps;

    //Given keywords:

    @Given("that the user is on the Input Form Submit page")
    public void theUserIsOnTheInputFormSubmitPage(){
        inputFormSubmitSteps.navigate_to_input_form_submit_page();
    }


    //When keywords:
    @When("the user enters a valid name in the First Name {string} field")
    public void theUserEntersFirstName(String value){
        inputFormSubmitSteps.user_enters_first_name(value);
    }


    //And keywords:
    @And("the user also enters a valid zipcode {string}")
    public void theUserEntersZipCode(String value){
        inputFormSubmitSteps.user_enters_zip_code(value);
    }

    @And("the user selects the hosting choice {string}")
    public void theUserSelectsHostingChoice(String value){
        inputFormSubmitSteps.user_selects_hosting_choice(value);
    }

    @And("the user selects a state from the state dropdown list")
    public void theUserSelectsState(){ inputFormSubmitSteps.user_selects_state_from_dropdown_list();}

    //Then keywords:

    @Then("the user clicks on the Send button to validate the form")
    public void theUserClicksTheSendButton(){
        inputFormSubmitSteps.user_clicks_send_button();
    }


}

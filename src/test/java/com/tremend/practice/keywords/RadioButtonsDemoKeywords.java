package com.tremend.practice.keywords;

import com.tremend.practice.steps.RadioButtonsDemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RadioButtonsDemoKeywords {

    @Steps
    private RadioButtonsDemoSteps radioButtonsDemoSteps;

    //GIVEN keywords:
    @Given("that the user is on the Radio Buttons Demo page")
    public void theUserIsOnRadioButtonsDemoPage(){
        radioButtonsDemoSteps.navigate_to_radio_buttons_demo_page();
    }

    //WHEN keywords:
    @When("the user clicks on the {string} radio button")
    public void theUserClicksOnRadioButtonsList(String value){
        radioButtonsDemoSteps.user_clicks_radio_buttons_list(value);
    }

    //THEN keywords:
    @Then("the message displays the {string} value")
    public void theRadioButtonMessageisDisplayed(String value){
        radioButtonsDemoSteps.assert_radio_button_message(value);
    }

    @And("the user clicks on the Get Checked Value button")
    public void theUserClicksOnTheGetCheckedValueButton(){
        radioButtonsDemoSteps.user_clicks_get_checked_value_button();
    }
}

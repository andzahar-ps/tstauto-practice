package com.tremend.practice.keywords;

import com.tremend.practice.steps.RadioButtonsDemoSteps;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;

public class RadioButtonsDemoKeywords {

    @Steps
    private RadioButtonsDemoSteps radioButtonsDemoSteps;

    //GIVEN keywords:
    @Given("that the user is on the Radio Buttons Demo page")
    public void theUserIsOnRadioButtonsDemoPage() {
        radioButtonsDemoSteps.navigate_to_radio_buttons_demo_page();
    }

    //WHEN keywords:
    @When("the user clicks on the {string} radio button")
    public void theUserClicksOnRadioButtonsList(String value) {
        radioButtonsDemoSteps.user_clicks_radio_buttons_list(value);
    }

    @When("the user clicks on the Get Values button")
    public void theUserClicksOnTheGetValuesButton(){
        radioButtonsDemoSteps.user_clicks_get_values_button();
    }


    //THEN keywords:
    @Then("the message displays the {string} value")
    public void theRadioButtonMessageisDisplayed(String value) {
        radioButtonsDemoSteps.assert_radio_button_message(value);
    }

    @Then("the message displays the corresponding {string} and {string} values")
    public void theGroupRadioButtonMessageIsDisplayed(String value1, String value2) {
        radioButtonsDemoSteps.assert_group_radio_buttons_message(value1, value2);
    }


    //AND keywords:
    @And("the user clicks on the Get Checked Value button")
    public void theUserClicksOnTheGetCheckedValueButton() {
        radioButtonsDemoSteps.user_clicks_get_checked_value_button();
    }

    @And("the user clicks on the age group {string} radio button")
    public void theUserClicksOnTheGroupAgeRadioButtonsList(String value) {
        radioButtonsDemoSteps.user_clicks_age_group_radio_buttons_list(value);
    }

    @And("the user also clicks on the gender group {string} radio button")
    public void theUserClicksOnTheGroupGenderRadioButton(String value){
        radioButtonsDemoSteps.user_clicks_gender_radio_buttons_list(value);
    }


}




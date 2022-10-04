package com.tremend.practice.keywords;

import com.tremend.practice.steps.RadioButtonDemoSteps;
import com.tremend.practice.tpages.RadioButtonsDemoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class RadioButtonDemoKeywords {

    @Steps
    private RadioButtonDemoSteps  radioButtonDemoSteps;


    //Radio Button Demo
    @Given("that the user is on the Radio Buttons demo page")
    public void theUserIsOnRadioButtonsDemoPage(){
        radioButtonDemoSteps.navigate_to_radio_button_demo_page();
    }

    @When("the user clicks on {string} radio button")
    public void theUserClicksOnRadioButton(String arg0) {
        radioButtonDemoSteps.user_clicks_on_gender_radio_button(arg0);
    }

    @And("the user clicks on Get checked value button")
    public void theUserClicksOnGetCheckedValueButton() {
        radioButtonDemoSteps.user_clicks_on_get_checked_value_button();
    }


    @Then("the {string} value is show correctly in the text message")
    public void theValueIsShowCorrectlyInTheTextMessage(String arg0) {
        radioButtonDemoSteps.assert_message_is_displayed(arg0);
    }



    //Group Radio Buttons Demo
    @Given("that the user is on the Radio Buttons demo page on group Radio Buttons section")
    public void thatTheUserIsOnTheRadioButtonsDemoPageOnGroupRadioButtonsSection() {
        radioButtonDemoSteps.navigate_to_radio_button_demo_page();
    }

    @When("the user clicks on one of {string} radio button and one of the {string} radio buttons")
    public void theUserClicksOnOneOfRadioButtonAndOneOfTheRadioButtons(String sex, String ageGroup) {
        radioButtonDemoSteps.the_user_clicks_the_sex_radio_buttons(sex, ageGroup);
    }

    @And("the user clicks on Get values button")
    public void theUserClicksOnGetValuesButton() {
        radioButtonDemoSteps.the_user_clicks_get_values_button();
    }

    @Then("the selected values for {string} and {string} should be correctly displayed")
    public void theSelectedValuesForAndShouldBeCorrectlyDisplayed(String sex, String ageGroup) {
        radioButtonDemoSteps.assert_both_values_are_correctly_shown(sex, ageGroup);
    }


}
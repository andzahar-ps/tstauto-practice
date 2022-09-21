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

    @Given("that the user is on the radio buttons demo page")
    public void theUserIsOnRadioButtonsDemoPage(){
        radioButtonDemoSteps.navigate_to_radio_button_demo_page();
    }


    @When("the user clicks on <gender> radio button")
    public void theUserClicksOnGenderRadioButton(String value) {
        radioButtonDemoSteps.user_clicks_on_gender_radio_button(value);
    }

    @And("the user clicks on {string} button")
    public void theUserClicksOnButton() {
        radioButtonDemoSteps.user_clicks_on_checked_value_button();
    }


    @Then("a {string} success message should be displayed")
    public void aSuccessMessageShouldBeDisplayed(String arg0) {
        radioButtonDemoSteps.assert_message_is_displayed(arg0);
    }
}

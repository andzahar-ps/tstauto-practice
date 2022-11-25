package com.tremend.practice.keywords;

import com.tremend.practice.steps.RadioButtonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RadioButtonDemoKeywords {
    @Steps
    RadioButtonSteps radioButtonSteps;

    @Given("that the user is on Radio button page")
    public void thatTheUserIsOnRadioButtonPage() {
        radioButtonSteps.navigate_to_radio_button_demo_page();
    }

    @When("the user press the button {string}")
    public void theUserPressTheButton(String buttonName) {
        radioButtonSteps.click_on_radio_button(buttonName);
    }

    @Then("the message {string} is displayed on Radio Button Page")
    public void theMessageIsDisplayedOnRadioButtonPage(String message) {
        radioButtonSteps.assert_correct_message_is_displayed(message);
    }
}

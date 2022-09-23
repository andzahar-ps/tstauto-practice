package com.tremend.practice.keywords;
import com.tremend.practice.steps.RadioButtonsDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RadioButtonsDemoKeywords {

    @Steps
    private RadioButtonsDemoSteps radioButtonsDemoSteps;


    // ========== GIVEN Keywords

    @Given("that the user is on Radio buttons form page")
    public void thatTheUserIsOnRadioButtonsFormPage() {
        radioButtonsDemoSteps.navigate_to_radio_buttons_page();
    }


    // ========== WHEN Keywords


    @When("the user clicks on radio button {string}")
    public void theUserClicksOnRadioButton(String gender) {
        radioButtonsDemoSteps.the_user_clicks_on_gender_button(gender);
        radioButtonsDemoSteps.user_clicks_get_checked_values_button();
    }

    // ========== THEN Keywords


    @Then("a proper message with {string} value is displayed")
    public void TheMessageRadioButtonIsCheckedIsDisplayed(String gender) {
        radioButtonsDemoSteps.assert_message_is_displayed(gender);
    }
}
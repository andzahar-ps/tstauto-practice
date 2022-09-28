package com.tremend.practice.keywords;
import com.tremend.practice.steps.RadioButtonsDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
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

    // ========================= GROUP RADIO BUTTONS DEMO

    // ================ GIVEN Keywords

    @Given("the user is on the Radio Buttons Demo page at the Group Radio Buttons section")
    public void theUserIsOnTheRadioButtonsDemoPageAtTheGroupRadioButtonsSection() {
        radioButtonsDemoSteps.navigate_to_radio_buttons_page();

    }



    // ================ WHEN Keywords

    @When("the user clicks on one of the {string} radio buttons and one of the {string} radio buttons")
    public void theUserClicksOnOneOfTheRadioButtons(String sex, String ageGroup) {
        radioButtonsDemoSteps.the_user_clicks_the_sex_radio_button(sex, ageGroup);
    }


    @And("the user clicks on the Get values button")
    public void theUserClicksOnTheGetValuesButton() {
        radioButtonsDemoSteps.the_user_clicks_get_values_button();
    }


    // ================ THEN Keywords

    @Then("the {string} and the {string} are correctly displayed in the text message")
    public void theAndTheAreCorrectlyDisplayedInTheTextMessage(String sex, String ageGroup) {
        radioButtonsDemoSteps.assert_both_values_are_correctly_shown(sex, ageGroup);
    }
}

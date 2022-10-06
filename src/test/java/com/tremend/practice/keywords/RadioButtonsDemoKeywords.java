package com.tremend.practice.keywords;

import com.tremend.practice.steps.RadioButtonsDemoSteps;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RadioButtonsDemoKeywords {

    @Steps
    private RadioButtonsDemoSteps radioButtonsDemoSteps;

    // ========== GIVEN Keywords

    @Given("that the user is on the Radio Buttons page")
    public void thatTheUserIsOnTheRadioButtonsPage() {
        radioButtonsDemoSteps.navigate_to_radio_buttons_page();
    }

    // ========== WHEN Keywords

    @When("the user clicks on {string} radio button")
    public void theUserClicksOnRadioButton(String gender) {
        radioButtonsDemoSteps.user_clicks_on_gender_button(gender);
    }

    @When("the user clicks on {string} radio button and {string} radio button")
    public void theUserClicksOnRadioButtonAndRadioButton(String sex, String ageGroup){
        radioButtonsDemoSteps.user_clicks_the_sex_radio_button(sex, ageGroup);
    }


    // ========== AND Keywords
    @And("the user clicks on Get checked value button")
    public void theUserClicksOnGetCheckedValueButton() {
        radioButtonsDemoSteps.user_clicks_on_get_checked_value_button();
    }

    @And("the user clicks on Get values button")
    public void theUserClicksOnGetValuesButton(){
        radioButtonsDemoSteps.user_clicks_on_get_values_button();
    }

    // ========== THEN Keywords

    @Then("the user gets a message with the selected {string} value")
    public void theUserGetsAMessageWithTheSelectedValue(String gender) {
        radioButtonsDemoSteps.assert_message_is_displayed(gender);
    }

    @Then("the gender {string} and age Group {string} are displayed")
    public void theGenderAndAgeGroupAreDisplayed(String sex, String ageGroup){
        radioButtonsDemoSteps.assert_both_values_are_correctly_shown(sex,ageGroup);
    }

}

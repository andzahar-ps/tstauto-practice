package com.tremend.practice.keywords;

import com.tremend.practice.steps.RadioButtonsDemoSteps;
import com.tremend.practice.steps.SubscribeModalSteps;
import com.tremend.practice.tpages.RadioButtonsDemoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RadioButtonsDemoKeywords {

    @Steps
    private RadioButtonsDemoSteps radioButtonsDemoSteps;



    // ========================= RADIO BUTTON DEMO

    // ================ GIVEN Keywords

    @Given("the user is on the Radio Buttons Demo page")
    public void theUserIsOnTheRadioButtonsDemoPage() {
        radioButtonsDemoSteps.navigate_to_radiobuttons_demo();
    }



    // ================ WHEN Keywords

    @When("the user clicks one of the {string}")
    public void theUserClicksOneOfTheRadiobuttons(String gender) {
        radioButtonsDemoSteps.the_user_clicks_the_gender_button(gender);
    }

    @And("the user clicks the Get Checked value button")
    public void theUserClicksTheGetCheckedValueButton() {
        radioButtonsDemoSteps.the_user_clicks_get_checked_value_button();
    }



    // ================ THEN Keywords

    @Then("the {string} value is shown correctly in the text message")
    public void theValueIsShownCorrectlyInTheTextMessage(String gender) {
        radioButtonsDemoSteps.assert_value_is_shown_correctly(gender);
    }




    // ========================= GROUP RADIO BUTTONS DEMO


    // ================ GIVEN Keywords

    @Given("the user is on the Radio Buttons Demo page at the Group Radio Buttons section")
    public void theUserIsOnTheRadioButtonsDemoPageAtTheGroupRadioButtonsSection() {
        radioButtonsDemoSteps.navigate_to_radiobuttons_demo();
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

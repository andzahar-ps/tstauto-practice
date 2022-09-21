package com.tremend.practice.steps;

import com.tremend.practice.tpages.RadioButtonsDemoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;

public class RadioButtonDemoSteps {

    private RadioButtonsDemoPage  radioButtonsDemoPage;

    @Step
    public void navigate_to_radio_button_demo_page() {
        radioButtonsDemoPage.navigateToRadioButtonDemoPage();
    }

    @Step
    public void user_clicks_on_gender_radio_button(String value) {
        switch(value) {
            case "male":
                radioButtonsDemoPage.clickMaleRadioButton();
                break;
            case "female":
                radioButtonsDemoPage.clickFemaleRadioButton();
                break;
            default:
        }
    }

    @Step
    public void user_clicks_on_checked_value_button() {
        radioButtonsDemoPage.checkedValue();
    }

    @Step
    public void assert_message_is_displayed(String gender) {
        Assertions.assertThat(radioButtonsDemoPage.getSuccessMessage()).as("Display message is:").isEqualTo("Radio button" + gender + "is checked");
    }

}

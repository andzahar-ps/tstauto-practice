package com.tremend.practice.steps;

import com.tremend.practice.tpages.RadioButtonsDemoPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class RadioButtonsDemoSteps {

    private RadioButtonsDemoPage radioButtonsDemoPage;

    @Step
    public void navigate_to_radio_buttons_page() {
        radioButtonsDemoPage.navigateToRadioButtonsPage();
    }

//    @Step
//    public void user_clicks_on_a_radio_button() {
//        radioButtonsDemoPage.clickGenderRadiobutton();
//    }

    @Step
    public void user_clicks_on_get_checked_value_button() {
        radioButtonsDemoPage.clickGetCheckedValue();
    }

    @Step
    public void the_user_clicks_on_gender_button(String value) {
        switch (value) {
            case "male":
                radioButtonsDemoPage.clickMaleRadiobutton();
                break;
            case "female":
                radioButtonsDemoPage.clickFemaleRadiobutton();
                break;
        }
    }

    @Step
    public void assert_message_is_displayed(String gender) {
        assertThat(radioButtonsDemoPage.getTextSuccessMessage()).as("Display message is:").isEqualTo("Radio button" + gender + "is checked");
    }
}

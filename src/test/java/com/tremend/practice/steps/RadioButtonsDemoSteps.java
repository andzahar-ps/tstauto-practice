package com.tremend.practice.steps;

import com.tremend.practice.tpages.RadioButtonsDemoPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class RadioButtonsDemoSteps {

    private RadioButtonsDemoPage radioButtonsDemoPage;

    @Step
    public void navigate_to_radio_buttons_page() {
        radioButtonsDemoPage.navigateToRadioButtonsPage();
    }

    @Step
    public void user_clicks_on_gender_button(String value) {
        switch (value) {
            case "Male":
                radioButtonsDemoPage.clickMaleRadioButton();
                break;
            case "Female":
                radioButtonsDemoPage.clickFemaleRadioButton();
                break;
            default:
                Assert.fail(value + "is not defined in the test framework");
        }
    }

    @Step
    public void user_clicks_on_get_checked_value_button() {
        radioButtonsDemoPage.clickGetCheckedValue();
    }

    @Step
    public void assert_message_is_displayed(String gender) {
        assertThat(radioButtonsDemoPage.getCheckedGender()).as("Display message is:").isEqualTo("Radio button" + gender + "is checked");
    }

    @Step
    public void user_selects_gender_and_age_radio_button(String sex, String age) {
        if (sex.equals("Male") && age.equals("0 - 5")) {
            radioButtonsDemoPage.tapMaleRadioButton();
            radioButtonsDemoPage.tapFirstAgeGroupRadioButton();
        } else if (sex.equals("Male") && age.equals("5 - 15")) {
            radioButtonsDemoPage.tapMaleRadioButton();
            radioButtonsDemoPage.tapSecondAgeGroupRadioButton();
        } else if (sex.equals("Male") && age.equals("15 - 50")) {
            radioButtonsDemoPage.tapMaleRadioButton();
            radioButtonsDemoPage.tapThirdAgeGroupRadioButton();
        } else if (sex.equals("Female") && age.equals("0 - 5")) {
            radioButtonsDemoPage.tapMaleRadioButton();
            radioButtonsDemoPage.tapThirdAgeGroupRadioButton();
        } else if (sex.equals("Female") && age.equals("5 - 15")) {
            radioButtonsDemoPage.tapMaleRadioButton();
            radioButtonsDemoPage.tapThirdAgeGroupRadioButton();
        } else if (sex.equals("Female") && age.equals("15 - 50")) {
            radioButtonsDemoPage.tapMaleRadioButton();
            radioButtonsDemoPage.tapThirdAgeGroupRadioButton();
        }
    }

    @Step
    public void user_clicks_on_get_value_button() {
        radioButtonsDemoPage.tapGetValuesButton();
    }

    @Step
    public void assert_gender_and_age_are_displayed(String sex, String age) {
        assertThat(radioButtonsDemoPage.getGenderAgeValue()).isEqualTo("Sex" + sex + "Age group" + age );
    }
}

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
    public void user_clicks_on_gender_button(String gender) {
        switch (gender) {
            case "Male":
                radioButtonsDemoPage.selectSexRadioButton(0);
                break;
            case "Female":
                radioButtonsDemoPage.selectSexRadioButton(1);
                break;
            default:
                Assert.fail(gender + "is not defined in the test framework");
        }
    }

    @Step
    public void user_clicks_on_get_checked_value_button() {
        radioButtonsDemoPage.clickGetCheckedValue();
    }

    @Step
    public void assert_message_is_displayed(String gender) {
        assertThat(radioButtonsDemoPage.getCheckedGender()).as("Display message is:").isEqualTo("Radio button '" + gender + "' is checked");
    }

    @Step
    public void user_clicks_the_sex_radio_button(String sex, String ageGroup) {
        switch (sex) {
            case "Male":
                radioButtonsDemoPage.selectGenderRadioButtonsValue(0);
                break;
            case "Female":
                radioButtonsDemoPage.selectGenderRadioButtonsValue(1);
                break;
        }

        switch (ageGroup){
            case "0 - 5":
                radioButtonsDemoPage.selectAgeRadioButtonValue(0);
                break;
            case "5 - 15":
                radioButtonsDemoPage.selectAgeRadioButtonValue(1);
                break;
            case "15 - 50":
                radioButtonsDemoPage.selectAgeRadioButtonValue(2);
                break;
        }
    }

    @Step
    public void user_clicks_on_get_values_button() {
        radioButtonsDemoPage.clickGetValuesButton();
    }

    @Step
    public void assert_both_values_are_correctly_shown(String sex, String ageGroup) {
        assertThat(radioButtonsDemoPage.getSexAndAgeGroupText()).isEqualTo("Sex : " + sex + "\nAge group: " + ageGroup);
    }


}

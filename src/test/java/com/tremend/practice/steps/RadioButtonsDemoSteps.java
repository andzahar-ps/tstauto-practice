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
    public void the_user_clicks_on_gender_button(String value) {
        switch (value) {
            case "Male":
                radioButtonsDemoPage.selectAgeRadioButtonValue(0);
                break;
            case "Female":
                radioButtonsDemoPage.selectAgeRadioButtonValue(1);
                break;
            default:
                Assert.fail(value + "is not defined in the test framework");
        }
    }

    @Step
    public void user_clicks_get_checked_values_button() {
        radioButtonsDemoPage.clickGetCheckedValuesButton();
    }

    @Step
    public void assert_message_is_displayed(String gender) {
        assertThat(radioButtonsDemoPage.getDisplayGenderMessage()).as("Display message is : ").isEqualTo("Radio button '" + gender + "' is checked");

    }

    // ===== Group Radio Buttons Demo steps

    @Step
    public void the_user_clicks_the_sex_radio_button(String sex, String ageGroup) {
        if (sex.equals("Male") && ageGroup.equals("0 - 5")) {
            radioButtonsDemoPage.selectMaleRadioButton();
            radioButtonsDemoPage.selectFirstAgeGroupRadioButton();
        }

        else if (sex.equals("Male") && ageGroup.equals("5 - 15")) {
            radioButtonsDemoPage.selectMaleRadioButton();
            radioButtonsDemoPage.selectSecondAgeGroupRadioButton();
        }

        else if (sex.equals("Male") && ageGroup.equals("15 - 50")) {
            radioButtonsDemoPage.selectMaleRadioButton();
            radioButtonsDemoPage.selectThirdAgeGroupRadioButton();
        }

        else if (sex.equals("Female") && ageGroup.equals("0 - 5")) {
            radioButtonsDemoPage.selectFemaleRadioButton();
            radioButtonsDemoPage.selectFirstAgeGroupRadioButton();
        }

        else if (sex.equals("Female") && ageGroup.equals("5 - 15")) {
            radioButtonsDemoPage.selectFemaleRadioButton();
            radioButtonsDemoPage.selectSecondAgeGroupRadioButton();
        }

        else if (sex.equals("Female") && ageGroup.equals("15 - 50")) {
            radioButtonsDemoPage.selectFemaleRadioButton();
            radioButtonsDemoPage.selectThirdAgeGroupRadioButton();
        }

        else {
            Assert.fail(sex + ageGroup + " are not available options");
        }
    }

    @Step
    public void the_user_clicks_get_values_button() {
        radioButtonsDemoPage.clickGetValuesButton();
    }

    @Step
    public void assert_both_values_are_correctly_shown(String sex, String ageGroup) {
        assertThat(radioButtonsDemoPage.getSexAndAgeGroupText()).isEqualTo("Sex : " + sex + "\nAge Group: " + ageGroup);
    }


}
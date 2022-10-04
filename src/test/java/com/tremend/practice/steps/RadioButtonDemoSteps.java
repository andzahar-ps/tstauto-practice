package com.tremend.practice.steps;

import com.tremend.practice.tpages.RadioButtonsDemoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import org.junit.Assert;

public class RadioButtonDemoSteps {

    private RadioButtonsDemoPage  radioButtonsDemoPage;

    @Step
    public void navigate_to_radio_button_demo_page() {
        radioButtonsDemoPage.navigateToRadioButtonDemoPage();
    }

    //Radio Button Demo Steps
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
                Assert.fail(value + "is not an option");
        }
    }

    @Step
    public void user_clicks_on_get_checked_value_button() {
        radioButtonsDemoPage.clickGetCheckedValueButton();
    }

    @Step
    public void assert_message_is_displayed(String gender) {
        Assertions.assertThat(radioButtonsDemoPage.getTextSuccessMessage()).as("Display message is:").isEqualTo("Radio button" + gender + "is checked");
    }


    //Group Radio Buttons Demo Steps

    @Step
    public void the_user_clicks_the_sex_radio_buttons(String sex, String ageGroup) {
        switch (sex) {
            case "Male":
                radioButtonsDemoPage.selectMaleRadioButton();
                break;
            case "Female":
                radioButtonsDemoPage.selectFemaleRadioButton();
                break;
            default:
                Assert.fail(sex + "is not an option");
        }

        switch (ageGroup) {
            case "0-5":
                radioButtonsDemoPage.selectAgeGroupRadioButtonValue(0);
                break;
            case "5-15":
                radioButtonsDemoPage.selectAgeGroupRadioButtonValue(1);
                break;
            case "15-50":
                radioButtonsDemoPage.selectAgeGroupRadioButtonValue(2);
                break;
            default:
                Assert.fail(ageGroup + "is not an option");
        }
    }

    @Step
    public void the_user_clicks_get_values_button() {
        radioButtonsDemoPage.clickGetValuesButton();
    }

    @Step
    public void assert_both_values_are_correctly_shown(String sex, String ageGroup) {
        Assertions.assertThat(radioButtonsDemoPage.getSexAndAgeGroupText()).isEqualTo("Sex: " + sex + "\nAge group: " + ageGroup);
    }

}

package com.tremend.practice.steps;

import com.tremend.practice.tpages.RadioButtonsDemoPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class RadioButtonsDemoSteps {

    private RadioButtonsDemoPage radioButtonsDemoPage;

    @Step
    public void navigate_to_radio_buttons_demo_page(){
        radioButtonsDemoPage.navigateToRadioButtonsDemoPage();
    }

    //Radio Button Demo steps:
    @Step
    public void user_clicks_radio_buttons_list(String value){
        if (value.equals("Male")){
            radioButtonsDemoPage.clickRadioButtonsList(0);
        } else if (value.equals("Female")){
            radioButtonsDemoPage.clickRadioButtonsList(1);
        } else Assert.fail("Argument is not valid");
    }

    @Step
    public void user_clicks_get_checked_value_button(){
        radioButtonsDemoPage.clickGetCheckedValueButton();
    }

    @Step
    public void assert_radio_button_message(String value){
        assertThat(radioButtonsDemoPage.getRadioButtonMessage() ).as("Radio button message is: ").isEqualTo("Radio button '" + value + "' is checked");
    }

    //Group Radio Buttons Demo steps:
    @Step
    public void user_clicks_gender_radio_buttons_list(String value){
       if (value.equals("Male")){
           radioButtonsDemoPage.clickGenderRadioButtonsList(0);
       } else if (value.equals("Female")){
           radioButtonsDemoPage.clickGenderRadioButtonsList(1);
       } else Assert.fail("Argument is not valid");
    }

    @Step
    public void user_clicks_age_group_radio_buttons_list(String value){
        if (value.equals("0 - 5")){
            radioButtonsDemoPage.clickAgeGroupRadioButtonsList(0);
        } else if (value.equals("5 - 15")){
            radioButtonsDemoPage.clickAgeGroupRadioButtonsList(1);
        } else if (value.equals("15 - 50")){
            radioButtonsDemoPage.clickAgeGroupRadioButtonsList(2);
        } else Assert.fail("Argument is not valid");
    }
    @Step
    public void user_clicks_get_values_button(){
        radioButtonsDemoPage.clickGetValuesButton();
    }

    @Step
    public void assert_group_radio_buttons_message(String value1, String value2){
        assertThat(radioButtonsDemoPage.getGroupRadioButtonsMessage() ).as("Group Radio Buttons message is: ").isEqualTo("Sex : " + value1 + "\nAge group: " + value2);
    }

}
package com.tremend.practice.steps;

import com.tremend.practice.tpages.InputFormValidationsPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class InputFormsValidationSteps {

    private InputFormValidationsPage inputFormValidationsPage;

    @Step
    public void user_navigates_to_page(){
        inputFormValidationsPage.navigateToInputValidationsPage();
    }

    @Step
    public void user_submits_form(){
        inputFormValidationsPage.clickSendButton();
    }

    @Step
    public void user_sets_phone_number_field(String phoneNumber){
        inputFormValidationsPage.setPhoneNumberField(phoneNumber);
    }

    @Step
    public void assert_phone_number_error(String message) {
        assertThat(inputFormValidationsPage.getTextErrorMessage()).as("The phone number validation error message is:").isEqualTo(message);
    }

    @Step
    public void assert_invalid_phone_number_error(String errorMessage) {
        assertThat(inputFormValidationsPage.getTextInvalidNumberErrorMessage()).as("The phone number validation error message is:").isEqualTo(errorMessage);
    }

    @Step
    public void assert_phone_number_error_icon_is_displayed(String text){
        assertThat(inputFormValidationsPage.isDisplayedErrorIcon()).contains(text);
    }

    @Step
    public void assert_phone_number_ok_icon_is_displayed(String string){
        assertThat(inputFormValidationsPage.isDisplayedValidationIcon()).contains(string);

    }

    @Step
    public void assert_number_of_error_messages(int total){
        assertThat(inputFormValidationsPage.countAllErrorMessages()).isEqualTo(total);
    }

    @Step
    public void user_clicks_address_field(){
        inputFormValidationsPage.clickAddressField();
    }

}
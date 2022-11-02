package com.tremend.practice.steps;

import com.tremend.practice.tpages.InputFormSubmitPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class InputFormSubmitSteps {

    private InputFormSubmitPage inputFormSubmitPage;



    // ======== General Steps

    @Step
    public void navigate_to_input_form_submit_page() {
        inputFormSubmitPage.navigateToInputFormSubmitPage();
    }

    @Step
    public void the_user_clicks_send_button() {
        inputFormSubmitPage.clickSendButton();
    }

    @Step
    public void assert_error_icon_is_displayed() {
        assertThat(inputFormSubmitPage.isDisplayedErrorIcon()).isTrue();
    }

    @Step
    public void assert_successful_icon_is_displayed() {
        assertThat(inputFormSubmitPage.isDisplayedSuccessfulIcon()).isTrue();
    }

    @Step
    public void assert_displayed_error_message(String message) {
        assertThat(inputFormSubmitPage.getTextErrorMessage()).isEqualTo(message);
    }

    @Step
    public void the_user_clicks_on_last_name_field() {
        inputFormSubmitPage.clickLastNameField();
    }




    // ======== First Scenario Steps -> First Name Field

    @Step
    public void the_user_fills_first_name_field_with_valid_data(String input) {
        inputFormSubmitPage.setFirstNameField(input);
    }

    @Step
    public void assert_first_name_field_border_color(String expectedBorderColor) {
        assertThat(inputFormSubmitPage.getCSSValueFirstNameField()).isEqualTo(expectedBorderColor);
    }
}

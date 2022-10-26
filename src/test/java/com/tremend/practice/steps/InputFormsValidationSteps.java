package com.tremend.practice.steps;

import com.tremend.practice.tpages.InputFormValidationsPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

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
    public void assert_first_name_validation_error(int index, String expectedValue) {
        assertThat(inputFormValidationsPage.getTextValidationErrorMessage(index)).isEqualTo(expectedValue);
    }

    @Step
    public void assert_validation_error_icon_is_displayed(int index){
        assertThat(inputFormValidationsPage.isDisplayedValidationErrorIcon(index)).as("First Name validation error icon").isTrue();
    }

    @Step
    public void assert_validation_ok_icon_is_displayed(int index){
        assertThat(inputFormValidationsPage.isDisplayedValidationOkIcon(index)).isTrue();

    }
}

package com.tremend.practice.steps;

import com.tremend.practice.tpages.InputFormSubmitPage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class InputFormSubmitSteps {

    private InputFormSubmitPage inputFormSubmitPage;

    @Step
    public void navigate_to_input_form_submit_page() {
        inputFormSubmitPage.navigateToInputFormSubmitPage();
    }

    @Step
    public void the_user_select_state_from_dropdown_list(String value) {
        inputFormSubmitPage.selectStateDropdownValue(value);
    }

    @Step
    public void the_user_click_send_button() {
        inputFormSubmitPage.clickSendButton();
    }

    @Step
    public void assert_successful_icon_is_displayed() {
        Assertions.assertThat(inputFormSubmitPage.isDisplayedSuccessfulIcon()).isTrue();
    }
}

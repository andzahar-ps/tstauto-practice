package com.tremend.practice.steps;

import com.tremend.practice.tpages.InputFormSubmitPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class InputFormSubmitSteps {

    private InputFormSubmitPage inputFormSubmitPage;


    @Step
    public void navigate_to_input_form_submit_page() {
        inputFormSubmitPage.navigateToInputFormSubmitPage();
    }
    @Step
    public void user_clicks_on_state(String state) {
        inputFormSubmitPage.clickOnStateDropdown(state);
    }
    @Step
    public void user_clicks_on_please_select_your_state(String please_select_your_state) {
        inputFormSubmitPage.clickOnPleaseSelectYourState();

    }

    @Step
    public void assert_message_is_displayed(String error) {
        assertThat(inputFormSubmitPage.getTextDisplayError()).as("Display message is : ").isEqualTo(error);

    }
}

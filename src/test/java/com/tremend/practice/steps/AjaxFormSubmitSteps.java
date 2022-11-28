package com.tremend.practice.steps;

import com.tremend.practice.tpages.AjaxFormSubmitPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class AjaxFormSubmitSteps {

    AjaxFormSubmitPage ajaxFormSubmitPage;

    @Step
    public void navigate_to_ajax_form_submit_page() {
        ajaxFormSubmitPage.navigateToAjaxFormSubmitPage();
    }

    @Step
    public void the_user_fills_in_the_name_input(String input) {
        ajaxFormSubmitPage.setNameInput(input);
    }

    @Step
    public void the_user_fills_in_the_comment_input(String input) {
        ajaxFormSubmitPage.setCommentInput(input);
    }

    @Step
    public void the_user_clicks_the_submit_button() {
        ajaxFormSubmitPage.clickSubmitButton();
    }

    @Step
    public void wait_for_ajax_message_to_disappear() {
        ajaxFormSubmitPage.waitForAjaxMessageToDisappear();
    }

    @Step
    public void assert_successful_message_is_displayed(String message) {
        assertThat(ajaxFormSubmitPage.getSuccessMessage()).as("The successful message").isEqualTo(message);
    }
}

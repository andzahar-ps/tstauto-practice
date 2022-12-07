package com.tremend.practice.steps;

import com.tremend.practice.tpages.AjaxFormSubmitPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class AjaxFormSubmitSteps {

    private AjaxFormSubmitPage ajaxFormSubmitPage;


    // ========= Ajax Form Submit Steps

    @Step
    public void navigate_to_ajax_form_submit_page() {
        ajaxFormSubmitPage.navigateToAjaxFormSubmitPage();
    }

    @Step
    public void the_user_fills_in_name_field(String input) {
        ajaxFormSubmitPage.setNameField(input);
    }

    @Step
    public void the_user_fills_in_comment_field(String input) {
        ajaxFormSubmitPage.setCommentField(input);
    }

    @Step
    public void the_user_clicks_the_submit_button() {
        ajaxFormSubmitPage.clickSubmitButton();
    }

    @Step
    public void wait_for_ajax_message_to_appear() {
        ajaxFormSubmitPage.waitForAjaxMessageToAppear();
    }

    @Step
    public void assert_successful_message_is_shown(String message) {
        assertThat(ajaxFormSubmitPage.getTextSuccessfulMessage()).as("The successful message").isEqualTo(message);
    }

    @Step
    public void wait_for_ajax_message_to_disappear() {
        ajaxFormSubmitPage.waitForAjaxMessageToDisappear();
    }

}

package com.tremend.practice.steps;

import com.tremend.practice.tpages.AjaxFormSubmitPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class AjaxSteps {

    private AjaxFormSubmitPage ajaxFormSubmitPage;

    @Step
    public void user_navigates_to_ajax_form_page() {
        ajaxFormSubmitPage.navigateToAjaxFormSubmitPage();
    }

    @Step
    public void user_sets_name_field() {
        ajaxFormSubmitPage.setNameField("island");
    }

    @Step
    public void user_sets_comment_field(){
        ajaxFormSubmitPage.setCommentField("boy");
    }

    @Step
    public void user_clicks_submit_button() {
        ajaxFormSubmitPage.clickSubmitButton();
    }

    @Step
    public void wait_for_success_message_to_appear() {
        ajaxFormSubmitPage.waitForAjaxMessageToDisappear();
    }

    @Step
    public void assert_success_message_is_displayed(String message) {
        assertThat(ajaxFormSubmitPage.getSuccessMessage()).as("The success message is:").isEqualTo(message);
    }

}

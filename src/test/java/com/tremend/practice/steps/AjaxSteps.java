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
    public void user_sets_name_field(String name) {
        ajaxFormSubmitPage.setNameField(name);
    }

    @Step
    public void user_sets_comment_field(String comment) {
        ajaxFormSubmitPage.setCommentField(comment);
    }

    @Step
    public void user_clicks_submit_button() {
        ajaxFormSubmitPage.clickSubmitButton();
    }

    @Step
    public void wait_for_ajax_message_to_disappear() {
        ajaxFormSubmitPage.waitForAjaxMessageToDisappear();
    }

    @Step
    public void wait_for_ajax_spinner_to_disappear() {
        ajaxFormSubmitPage.waitForAjaxSpinnerToDisappear();
    }

    @Step
    public void assert_success_message_is_displayed(String message) {
        assertThat(ajaxFormSubmitPage.getSuccessMessage()).as("The success message is:").isEqualTo(message);
    }

}

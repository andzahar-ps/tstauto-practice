package com.tremend.practice.steps;

import com.tremend.practice.tpages.AjaxFormDemoPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class AjaxFormDemoSteps {

    private AjaxFormDemoPage ajaxForm;

    @Step
    public void user_navigates_to_ajax_form_demo_page() {
        ajaxForm.navigateToAjaxFormDemoPage();
    }

    @Step
    public void user_completes_name_and_comment() {
        ajaxForm.enterName("test");
        ajaxForm.enterComment("comment");
        ajaxForm.submitForm();
    }

    @Step
    public void user_should_see_that_the_form_is_being_processed() {
        assertThat(ajaxForm.messageText()).contains("Ajax Request");
    }
}

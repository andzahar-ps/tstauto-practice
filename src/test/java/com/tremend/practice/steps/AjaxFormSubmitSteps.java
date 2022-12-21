package com.tremend.practice.steps;

import com.tremend.practice.tpages.AjaxFormSubmitPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class AjaxFormSubmitSteps {

    private AjaxFormSubmitPage ajaxFormSubmitPage;

    @Step
    public void navigate_to_ajax_form_submit_page() {
        ajaxFormSubmitPage.navigateToAjaxFormSubmitPage();
    }

    @Step
    public void the_user_fills_in_title_field(String x) {
        ajaxFormSubmitPage.setTitleField(x);
    }

    @Step
    public void the_user_fills_in_description_field(String y) {
        ajaxFormSubmitPage.setDescriptionField(y);
    }

    @Step
    public void the_user_clicks_the_submit_button() {
        ajaxFormSubmitPage.clickSubmitButton();
    }

//        ajaxFormSubmitPage.getPageSource();

    @Step
    public void wait_for_the_ajax_message_to_disappear() {
        ajaxFormSubmitPage.waitForTheAjaxMessageToDisappear("Form submited Successfully!");
    }

    @Step
    public void wait_for_the_loading_spinner_to_disappear() {
        ajaxFormSubmitPage.waitForTheLoadingSpinnerToDisappear();
    }

    @Step
    public void assert_message_is_displayed(String message) {
        assertThat(ajaxFormSubmitPage.getTextSuccessfulMessage()).as("Display message is: ").isEqualTo(message);
    }

//    @Step
//    public void assert_loading_spinner_is_present(String spinner) {
//        assertThat(ajaxFormSubmitPage.isDisplayedLoadingSpinner()).isEqualTo(spinner);
//    }
}

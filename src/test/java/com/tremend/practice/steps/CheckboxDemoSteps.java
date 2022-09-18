package com.tremend.practice.steps;

import com.tremend.practice.tpages.CheckboxDemoPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckboxDemoSteps {
    private CheckboxDemoPage checkboxDemoPage;

    @Step
    public void navigate_to_checkbox_demo_page() {
        checkboxDemoPage.navigateToCheckboxDemoPage();
    }

    @Step
    public void user_clicks_single_checkbox() {
        checkboxDemoPage.clickSingleCheckbox();
    }

    @Step
    public void assert_message_is_displayed(String label) {
        assertThat(checkboxDemoPage.getTextSuccessMessage()).as("Display message is:").isEqualTo(label);
    }

    //Multiple checkboxes
    @Step
    public void the_user_clicks_on_all_checkbox_button() {
        checkboxDemoPage.clickAllCheckboxButton();
    }

    @Step
    public void the_user_clicks_on_checkbox_with_order(int value) {
        checkboxDemoPage.clickOnCheckbox(value);
    }

    @Step
    public void assert_checkbox_selection_state_is(boolean value, int order) {
        assertThat(checkboxDemoPage.isSelectedCheckbox(order)).as("Display message is:").isEqualTo(value);
    }
}

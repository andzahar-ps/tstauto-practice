
package com.tremend.practice.steps;

import com.tremend.practice.tpages.CheckboxDemoPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckboxDemoSteps {

    private CheckboxDemoPage checkboxDemoPage;
    private CheckboxDemoPage checkboxList;

    @Step
    public void navigate_to_checkbox_demo_page() {

        checkboxDemoPage.navigateToCheckboxDemoPage();
    }

    @Step
    public void the_user_clicks_on_the_checkbox() {

        checkboxDemoPage.clickOnTheCheckbox();
    }

    @Step
    public void assert_success_message_is_displayed(String value) {
        assertThat(checkboxDemoPage.getTextSuccessMessage()).as("The message is: ").isEqualTo(value);
    }

    // Multiple checkbox

    @Step
    public void the_user_clicks_on_the_checkbox_with_order(int value) {
        checkboxDemoPage.clickOnCheckbox(value);
    }

    @Step
    public void assert_checkbox_selection_state_is(boolean value, int order) {
        assertThat(checkboxDemoPage.isSelectedCheckbox(order)).as("The message is: ").isEqualTo(value);
    }

    @Step
    public void the_user_clicks_on_all_checkboxes_button(){
        checkboxDemoPage.clickAllCheckboxesButton();
    }
}
//
//    @Step
//    public void the_user_clicks_on_the_first_checkbox() {
//
//        checkboxDemoPage.clickOnTheFirstCheckbox();
//    }
//
//    @Step
//    public void the_user_clicks_on_the_second_checkbox() {
//
//        checkboxDemoPage.clickOnTheSecondCheckbox();
//    }
//    @Step
//    public void the_user_clicks_on_the_third_checkbox() {
//
//        checkboxDemoPage.clickOnTheThirdCheckbox();
//    }
//    @Step
//       public void the_user_clicks_on_fourth_the_checkbox() {

//        checkboxDemoPage.clickOnTheFourthCheckbox();
//    }
//    @Step
//    public void the_user_clicks_on_uncheck_all_button() {
//
//        checkboxDemoPage.clickUncheckAllButton();
//    }

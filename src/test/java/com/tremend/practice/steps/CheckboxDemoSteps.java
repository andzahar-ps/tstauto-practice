
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
    public void the_user_clicks_on_the_checkbox() {

        checkboxDemoPage.clickOnTheCheckbox();
    }

    @Step
    public void assert_success_message_is_displayed(String value) {
        assertThat(checkboxDemoPage.getSuccessMessage()).as("The message is: ").isEqualTo(value);
    }

    // Multiple checkbox

    @Step
    public void the_user_clicks_on_the_first_checkbox() {

        checkboxDemoPage.clickOnTheFirstCheckbox();
    }

    @Step
    public void the_user_clicks_on_the_second_checkbox() {

        checkboxDemoPage.clickOnTheSecondCheckbox();
    }
    @Step
    public void the_user_clicks_on_the_third_checkbox() {

        checkboxDemoPage.clickOnTheThirdCheckbox();
    }
    @Step
       public void the_user_clicks_on_fourth_the_checkbox() {

        checkboxDemoPage.clickOnTheFourthCheckbox();
    }
    @Step
    public void the_user_clicks_on_uncheck_all_button() {

        checkboxDemoPage.clickUncheckAllButton();
    }
}
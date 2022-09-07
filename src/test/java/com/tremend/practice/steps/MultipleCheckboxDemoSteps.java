package com.tremend.practice.steps;

import com.tremend.practice.tpages.MultipleCheckboxDemoPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class MultipleCheckboxDemoSteps {

    private MultipleCheckboxDemoPage multipleCheckboxDemoPage;

    @Step
    public void navigate_to_checkbox_demo() {
        multipleCheckboxDemoPage.navigateToCheckboxDemoPage();
    }

    @Step
    public void the_user_clicks_check_all_button() {
        multipleCheckboxDemoPage. clickCheckAllButton();
    }

    @Step
    public void assert_first_checkbox_is_selected(boolean status) {
        assertThat(multipleCheckboxDemoPage.checkFirstCheckbox()).isEqualTo(status);
        assertThat(multipleCheckboxDemoPage.checkSecondCheckbox()).isEqualTo(status);
        assertThat(multipleCheckboxDemoPage.checkThirdCheckbox()).isEqualTo(status);
        assertThat(multipleCheckboxDemoPage.checkFourthCheckbox()).isEqualTo(status);

    }

//    @Step
//    public void assert_second_checkbox_is_selected(boolean status) {
//
//    }
//
//    @Step
//    public void assert_third_checkbox_is_selected() {
//
//    }
//
//    @Step
//    public void assert_fourth_checkbox_is_selected() {
//    }
}

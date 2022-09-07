package com.tremend.practice.steps;

import com.tremend.practice.tpages.SingleCheckboxDemoPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class SingleCheckboxDemoSteps {

    private SingleCheckboxDemoPage singleCheckboxDemoPage;

    @Step
    public void navigate_to_checkbox_demo() {
        singleCheckboxDemoPage.navigateToCheckboxDemoPage();
    }

    @Step
    public void the_user_selects_checkbox() {
        singleCheckboxDemoPage.selectCheckbox();
    }

    @Step
    public void assert_success_message_is_displayed(String label) {
        assertThat(singleCheckboxDemoPage.getSuccessMessage()).as("The message is: ").isEqualTo(label);
    }
}

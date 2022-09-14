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
    public void success_message_is_displayed(String label) {
        assertThat( checkboxDemoPage.getSuccessMessage() ).as("Display message is:").isEqualTo(label);
    }
}

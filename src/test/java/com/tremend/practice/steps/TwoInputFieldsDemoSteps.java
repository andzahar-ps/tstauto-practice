package com.tremend.practice.steps;
import com.tremend.practice.tpages.TwoInputFieldsDemoPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class TwoInputFieldsDemoSteps {
    private TwoInputFieldsDemoPage twoInputFieldDemoPage;

    @Step
    public void navigate_to_simple_demo_page() {
        twoInputFieldDemoPage.navigateToSimpleDemoPage();
    }

    @Step
    public void user_sets_first_numeric_value(String value) {
        twoInputFieldDemoPage.setFirstNumber(value);
    }

    @Step
    public void user_sets_second_numeric_value(String value) {
        twoInputFieldDemoPage.setSecondNumber(value);
    }

    @Step
    public void user_clicks_show_total_button() {
        twoInputFieldDemoPage.clickShowTotalButton();
    }

    @Step
    public void assert_label_is_displayed(String value) {
    assertThat( twoInputFieldDemoPage.getDisplayTotalValue() ).as("Display message is:").isEqualTo(value);
    }
}
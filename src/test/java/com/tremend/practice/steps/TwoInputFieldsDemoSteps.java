package com.tremend.practice.steps;
import com.tremend.practice.tpages.TwoInputFieldsDemoPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class TwoInputFieldsDemoSteps {
    private TwoInputFieldsDemoPage twoInputFieldsDemoPage;

    @Step
    public void navigate_to_simple_demo_page() {
        twoInputFieldsDemoPage.navigateToSimpleDemoPage();
    }

    @Step
    public void user_sets_first_numeric_field(int a) {
        twoInputFieldsDemoPage.setFirstNumericField(a);
    }

    @Step
    public void user_sets_second_numeric_field(int b) {
        twoInputFieldsDemoPage.setSecondNumericField(b);
    }

    @Step
    public void user_clicks_show_total_button() {
        twoInputFieldsDemoPage.clickShowTotalButton();
    }

    @Step
    public void assert_label_is_displayed(String label) {
    assertThat( twoInputFieldsDemoPage.getDisplayTotalValue() ).as("Display message is:").isEqualTo(label);
    }
}
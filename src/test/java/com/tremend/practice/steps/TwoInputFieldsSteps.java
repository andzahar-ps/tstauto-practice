package com.tremend.practice.steps;

import com.tremend.practice.tpages.TwoInputFieldsPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class TwoInputFieldsSteps {

    private TwoInputFieldsPage twoInputFieldsPage;

    @Step
    public void navigate_to_simple_page_demo() {
        twoInputFieldsPage.navigateToSimpleDemoPage();
    }

    @Step
    public void the_user_sets_value_field_a(String firstValue) {
        twoInputFieldsPage.setValueFieldA(firstValue);
    }

    @Step
    public void the_user_sets_value_field_b(String secondValue) {
        twoInputFieldsPage.setValueFieldB(secondValue);
    }

    @Step
    public void the_user_clicks_get_total_button() {
        twoInputFieldsPage.clickGetTotalButton();
    }

    @Step
    public void assert_total_value_is_displayed(String label) {
        assertThat(twoInputFieldsPage.getDisplayTotalValue()).as("The total value is: ").isEqualTo(label);
    }

}

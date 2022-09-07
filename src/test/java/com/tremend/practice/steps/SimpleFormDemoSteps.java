package com.tremend.practice.steps;

import com.tremend.practice.tpages.SimpleFormDemoPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleFormDemoSteps {

    private SimpleFormDemoPage simpleFormDemoPage;

    @Step
    public void navigate_to_simple_form_page(){
        simpleFormDemoPage.navigateToSimpleDemoPage();
    }

    @Step
    public void username_sets_user_message_field(String value){
        simpleFormDemoPage.setUserMessageField(value);
    }

    @Step
    public void username_clicks_show_message_button(){
        simpleFormDemoPage.clickShowMessageButton();
    }


    @Step
    public void assert_message_is_displayed(String value){
        assertThat( simpleFormDemoPage.getTextDisplayLabel() ).as("Display message is : ").isEqualTo( value);
    }


    @Step
    public void navigate_to_simple_demo_page() {
        simpleFormDemoPage.navigateToSimpleDemoPage();
    }

    @Step
    public void user_sets_first_numeric_field(String aValue) {
        simpleFormDemoPage.setFirstNumericField(aValue);
    }

    @Step
    public void user_sets_second_numeric_field(String bValue) {
        simpleFormDemoPage.setSecondNumericField(bValue);
    }

    @Step
    public void user_clicks_show_total_button() {
        simpleFormDemoPage.clickShowTotalButton();
    }

    @Step
    public void assert_label_is_displayed(String label) {
        assertThat( simpleFormDemoPage.getDisplayTotalValue() ).as("Display message is:").isEqualTo(label);
    }
}

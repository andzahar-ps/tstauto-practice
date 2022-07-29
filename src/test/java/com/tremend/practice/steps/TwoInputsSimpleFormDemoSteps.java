package com.tremend.practice.steps;

import com.tremend.practice.tpages.TwoInputsSimpleFormDemoPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

public class TwoInputsSimpleFormDemoSteps {

    TwoInputsSimpleFormDemoPage twoInputsSimpleFormDemoPage;

    @Step
    public void navigate_to_simple_form_page(){
        twoInputsSimpleFormDemoPage.navigateToSimpleDemoPage();
    }

    @Step
    public void set_sum_input_field(String value){
        twoInputsSimpleFormDemoPage.setSumInputField(value);
    }

    @Step
    public void click_get_total_button(){
        twoInputsSimpleFormDemoPage.clickGetTotalButton();
    }

    @Step
    public void assert_message_is_displayed(String value){
        assertThat(twoInputsSimpleFormDemoPage.getTextDisplayValueLabel()).as("Display message is: ").isEqualTo(value);
        twoInputsSimpleFormDemoPage.getTextDisplayValueLabel();
    }
}

package com.tremend.practice.steps;

import com.tremend.practice.tpages.RadioButtonDemoPage;
import com.tremend.practice.tpages.SimpleFormDemoPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class RadioButtonSteps {

    private RadioButtonDemoPage radioButtonDemoPage;

    @Step
    public void navigate_to_radio_button_demo_page(){
        radioButtonDemoPage.navigateToRadioButtonDemoPage();
    }

    @Step
    public void click_on_radio_button(String value){
        radioButtonDemoPage.clickOnRadioButton(value);
        radioButtonDemoPage.clickOnCheckoutButton();
    }

    @Step
    public void assert_correct_message_is_displayed(String label) {
        assertThat(radioButtonDemoPage.checkoutMessageText()).as("Display message is:").isEqualTo(label);
    }

}

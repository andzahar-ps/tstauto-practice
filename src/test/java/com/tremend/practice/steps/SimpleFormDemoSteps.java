package com.tremend.practice.steps;

import com.tremend.practice.tpages.SimpleFormDemoPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleFormDemoSteps {

    SimpleFormDemoPage simpleFormDemoPage;

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
}

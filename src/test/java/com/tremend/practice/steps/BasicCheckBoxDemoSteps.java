package com.tremend.practice.steps;

import com.tremend.practice.tpages.BasicCheckBoxDemoPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BasicCheckBoxDemoSteps {

    private BasicCheckBoxDemoPage basicCheckBoxDemoPage;

    @Step
    public void navigate_to_check_box_demo_page(){
        basicCheckBoxDemoPage.navigateToBasicCheckBoxDemoSteps();
    }

    @Step
    public void user_clicks_on_the_checkbox(){
        basicCheckBoxDemoPage.clickSimpleCheckBox();
    }

    @Step
    public void assert_success_message_is_displayed(String value){
        assertThat(basicCheckBoxDemoPage.getTextMessage()).as("The message is: ").isEqualTo(value);
    }

    @Step
    public void assert_check_box_selected_state(boolean value, int order){
        assertThat(basicCheckBoxDemoPage.isSelectedCheckBox(order)).as("The message is: ").isEqualTo(value);
    }

    @Step
    public void user_clicks_check_all_button(){
        basicCheckBoxDemoPage.clickCheckAllButton();
    }

}

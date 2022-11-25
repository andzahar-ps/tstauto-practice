package com.tremend.practice.steps;

import com.tremend.practice.tpages.CheckBoxDemoPage;
import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Step;

public class CheckBoxDemoSteps {
    private CheckBoxDemoPage checkBoxDemoPage;

    @Step
    public void user_navigates_to_simple_checkbox_demo_page(){
        checkBoxDemoPage.navigateToCheckBoxDemoPage();
    }

    @Step
    public void user_clicks_on_single_checkbox(){
        checkBoxDemoPage.clickOnCheckBox();
    }

    @Step
    public void user_checks_that_the_success_message_is_displayed(String message){
        assertThat(checkBoxDemoPage.successMessageText()).isEqualTo(message);
    }

    @Step
    public void user_clicks_on_all_checkboxes(){
        checkBoxDemoPage.clickOnCheckBoxNo1();
        checkBoxDemoPage.clickOnCheckBoxNo2();
        checkBoxDemoPage.clickOnCheckBoxNo3();
        checkBoxDemoPage.clickOnCheckBoxNo4();
    }

    @Step
    public void check_button_message(String message){
        assertThat(checkBoxDemoPage.buttonMessageText()).isEqualTo(message);
    }
}
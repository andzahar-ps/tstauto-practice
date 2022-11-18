package com.tremend.practice.steps;

import com.tremend.practice.tpages.BasicCheckBoxDemoPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class BasicCheckBoxDemoSteps {

    private BasicCheckBoxDemoPage basicCheckBoxDemoPage;

    @Step
    public void navigate_to_basic_check_box_demo(){
        basicCheckBoxDemoPage.navigateToBasicCheckBoxDemo();
    }

    @Step
    public void click_on_check_box(){
        basicCheckBoxDemoPage.clickOnCheckBox();
    }

    @Step
    public void display_success_message(String text){
        assertThat(basicCheckBoxDemoPage.displaySuccessMessage()).as("You have successfully clicked on the box").isEqualTo(text);
    }






}

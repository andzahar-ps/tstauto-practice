package com.tremend.practice.steps;

import com.tremend.practice.tpages.DropDownDemoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class DropDownDemoSteps {
    DropDownDemoPage dropDownPage;

    @Step
    public void user_navigates_to_dropdown_page(){
        dropDownPage.navigateToDropdownPage();
    }

    @Step
    public void user_selects_value(String value){
        dropDownPage.clickDropDownForm(value);
    }

    @Step
    public void message_is_displayed(String value){
        assertThat(dropDownPage.messageDisplayedText()).as("Display message is").contains(value);
    }

}



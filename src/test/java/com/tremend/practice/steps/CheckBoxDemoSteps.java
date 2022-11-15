package com.tremend.practice.steps;

import com.tremend.practice.tpages.CheckBoxDemoPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckBoxDemoSteps {

    private CheckBoxDemoPage checkBoxDemoPage;

    @Step
    public void navigate_to_checkbox_demo_page(){checkBoxDemoPage.navigateToCheckBoxDemoPage();}

    @Step
    public void user_clicks_age_selection_check_box(){checkBoxDemoPage.clickAgeSelectionCheckBox();}

    @Step
    public boolean is_checkbox_selected(){
        return checkBoxDemoPage.isCheckBoxSelected();
    }

    @Step
    public void assert_message_is_displayed(String value){
        assertThat(checkBoxDemoPage.getTextAgeCheckBox()).as("The age checkbox message is: ").isEqualTo(value);
    }

    @Step
    public void user_clicks_first_check_box(){checkBoxDemoPage.clickFirstCheckBox();}

    @Step
    public boolean is_first_check_box_selected(){
        return checkBoxDemoPage.isFirstCheckBoxSelected();
    }

    @Step
    public void user_clicks_second_check_box(){checkBoxDemoPage.clickSecondCheckBox();}

    @Step
    public boolean is_second_check_box_selected(){
        return checkBoxDemoPage.isSecondCheckBoxSelected();
    }

    @Step
    public void user_clicks_third_check_box(){checkBoxDemoPage.clickThirdCheckbox();}

    @Step
    public boolean is_third_check_box_selected(){
        return checkBoxDemoPage.isThirdCheckBoxSelected();
    }

    @Step
    public void user_clicks_fourth_check_box(){checkBoxDemoPage.clickFourthCheckBox();}

    @Step
    public boolean is_fourth_check_box_selected(){
        return checkBoxDemoPage.isFourthCheckBoxSelected();
    }

    @Step
    public void user_clicks_check_all_button(){checkBoxDemoPage.clickCheckAllButton();}

    @Step
    public void user_clicks_uncheck_all_hidden_button(){checkBoxDemoPage.clickUncheckAllHiddenButton();}

}

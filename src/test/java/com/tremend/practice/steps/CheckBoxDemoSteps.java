package com.tremend.practice.steps;

import com.tremend.practice.tpages.CheckBoxDemoPage;
import static org.junit.Assert.assertThat;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class CheckBoxDemoSteps {

    CheckBoxDemoPage checkBoxDemoPage;

    @Step
    public void navigate_to_checkbox_demo_page() {
        checkBoxDemoPage.navigateToCheckBoxDemoPage();
    }

    @Step
    public void select_check_box(){
        checkBoxDemoPage.selectCheckBox();
    }

    @Step
    public void assert_message_is_displayed( String value){
        Assertions.assertThat(checkBoxDemoPage.getSuccessMessage()).as("Display message is: ").isEqualTo(value);
        checkBoxDemoPage.getSuccessMessage();
    }

    public void assert_checkbox_selection_state_is( boolean value , int order){
        Assertions.assertThat(checkBoxDemoPage.isSelectedCheckbox(order)).as("Display message is: ").isEqualTo(value);

    }

    //Multiple checkbox

    public void the_user_click_on_all_checkboxes_button(){
        checkBoxDemoPage.clickAllCheckboxesButton();
    }
    public void the_user_click_on_checkbox_with_order(int value) {
        checkBoxDemoPage.clickOnCheckbox(value);
    }
}

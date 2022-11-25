package com.tremend.practice.steps;

import com.tremend.practice.tpages.CheckboxDemoPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckboxDemoSteps {

    private CheckboxDemoPage checkboxDemoPage;

    @Step
    public void navigate_to_checkbox_demo_page(){checkboxDemoPage.navigateToCheckboxDemoPage();}

    //First checkbox menu:
    @Step
    public void user_clicks_age_selection_checkbox(){checkboxDemoPage.clickAgeSelectionCheckbox();}

    @Step
    public void is_checkbox_selected(boolean value){
        assertThat(checkboxDemoPage.isCheckboxSelected() ).as("Display checkbox message is: ").isEqualTo(value);
    }

    @Step
    public void assert_message_is_displayed(String value){
        assertThat(checkboxDemoPage.getTextAgeCheckbox()).as("The age checkbox message is: ").isEqualTo(value);
    }

    //Second checkbox menu:
    @Step
    public void user_clicks_checkbox_list(int value){
        checkboxDemoPage.clickCheckboxList(value);
    }

    @Step
    public void assert_checkbox_list_selection (boolean value, int index){
        assertThat(checkboxDemoPage.isCheckboxListSelected(index)).as("Display message for checkbox list is: ").isEqualTo(value);
    }

    @Step
    public void user_clicks_the_check_all_button(){
        checkboxDemoPage.clickCheckAllButton();
    }

}

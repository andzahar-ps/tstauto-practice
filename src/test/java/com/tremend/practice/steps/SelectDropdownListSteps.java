package com.tremend.practice.steps;

import com.tremend.practice.tpages.SelectDropdownListPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import static org.assertj.core.api.Assertions.assertThat;

public class SelectDropdownListSteps {

    private SelectDropdownListPage selectDropdownListPage;

    @Step
    public void navigate_to_select_dropdown_list_page(){
        selectDropdownListPage.navigateToSelectDropdownListPage();
    }

    //Select List Demo steps:
    @Step
    public void user_selects_dropdown_list_value(String value){
        selectDropdownListPage.selectDropdownValue(value);
    }

    @Step
    public void assert_dropdown_list_message(String value){
        assertThat(selectDropdownListPage.getSelectListDemoMessage()).as("Select List Demo message is: ").isEqualTo("Day selected :- " + value);
    }

    //Multi Select List Demo steps:
    @Step
    public void user_selects_multiple_values(){
        selectDropdownListPage.selectMultipleValues();
    }

    @Step
    public void user_clicks_first_selected_button(){
        selectDropdownListPage.clickFirstSelectedButton();
    }

    @Step
    public void assert_multi_select_list_message(String value){
        assertThat(selectDropdownListPage.getMultiSelectListDemoMessage()).as("The Multi Select List message is: ").isEqualTo("First selected option is : " + value);
    }
}

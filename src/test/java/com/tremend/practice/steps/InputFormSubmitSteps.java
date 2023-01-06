package com.tremend.practice.steps;

import com.tremend.practice.tpages.InputFormSubmitPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class InputFormSubmitSteps {

    private InputFormSubmitPage inputFormSubmitPage;

    @Step
    public void navigate_to_input_form_submit_page(){
        inputFormSubmitPage.navigateToInputFormSubmitPage();
    }

    //Input form submit steps:
    @Step
    public void user_enters_first_name(String value){
        inputFormSubmitPage.setFirstNameField(value);
    }

    @Step
    public void user_enters_zip_code(String value){
        inputFormSubmitPage.setZipCodeField(value);
    }

    @Step
    public void user_selects_hosting_choice(String value){
        if (value.equals("Yes")){
            inputFormSubmitPage.selectHostingChoice(0);
        }else if (value.equals("No")){
            inputFormSubmitPage.selectHostingChoice(1);
        }else Assert.fail("Argument is not valid");
    }

    public void user_selects_state_from_dropdown_list(){
        inputFormSubmitPage.setStateDropdownList();
    }

    @Step
    public void user_clicks_send_button(){
        inputFormSubmitPage.clickSendButton();
    }
}

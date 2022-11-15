package com.tremend.practice.steps;

import com.tremend.practice.tpages.BasicFirstFormDemoPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;


public class BasicFirstFormDemoSteps {

    private BasicFirstFormDemoPage basicFirstFormDemoPage;

    @Step
    public void user_navigates_to_form_page() {
        basicFirstFormDemoPage.navigateToBasicFirstFormPage();
    }

    @Step
    public void user_sets_message_to_first_field_with_value(String valuea){
        basicFirstFormDemoPage.setTwoInputField1(valuea);
    }

    @Step
    public void user_sets_message_to_second_field_with_value(String valueb){
        basicFirstFormDemoPage.setTwoInputFields2(valueb);
    }

    @Step
    public void user_clicks_on_get_total_button(){
        basicFirstFormDemoPage.clickGetTotalButton();
    }

    @Step
    public void asssert_message_is_displayed(String value){
        assertThat( basicFirstFormDemoPage.getSumOfTwoValues() ).as("The checkbox validation message is : ").isEqualTo(value);
    }
}


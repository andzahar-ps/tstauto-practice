package com.tremend.practice.steps;

import com.tremend.practice.tpages.BasicFirstFormPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class BasicFirstFormSteps {

    private BasicFirstFormPage basicFirstFormPage;

    @Step
    public void navigate_to_basic_first_form_demo(){
        basicFirstFormPage.navigateToBasicFirstFormDemo();
    }

    @Step
    public void input_message(String message){
        basicFirstFormPage.enterMessageInputField(message);
    }

    @Step
    public void display_your_message(String text){
       assertThat(basicFirstFormPage.displayYourMessage()).as("Your Message: ").isEqualTo(text);
    }

    @Step
    public void click_show_message_button(){
        basicFirstFormPage.clickShowMessageButton();
    }

    @Step
    public void enter_value_a(String number){
        basicFirstFormPage.enterValueA(number);
    }

    @Step
    public void enter_value_b(String number){
        basicFirstFormPage.enterValueB(number);
    }

    @Step
    public void click_get_total(){
        basicFirstFormPage.clickGetTotal();
    }

    @Step
    public void get_total_result(String number){
        assert (basicFirstFormPage.getTotalResult().equals(number));
    }


}

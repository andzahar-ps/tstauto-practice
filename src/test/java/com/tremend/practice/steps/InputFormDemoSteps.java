package com.tremend.practice.steps;

import com.tremend.practice.tpages.InputFormDemoPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class InputFormDemoSteps {

    private InputFormDemoPage inputFormDemoPage;

    @Step
    public void user_navigates_to_input_form_page() {
        inputFormDemoPage.navigate_to_input_form_page();
    }

    @Step
    public void user_enters_a_valid_first_name() {
        inputFormDemoPage.complete_valid_first_name();
    }

    @Step
    public void user_expects_ok_item_to_be_displayed() {
        assertTrue(inputFormDemoPage.icon_is_valid());
    }

    @Step
    public void user_enters_a_valid_last_name() {
        inputFormDemoPage.complete_valid_last_name();
    }


    @Step
    public void user_expects_last_name_ok_item_to_be_displayed() {
        assertTrue(inputFormDemoPage.last_name_icon_is_valid());
    }


}

package com.tremend.practice.steps;

import com.tremend.practice.tpages.TestPage1;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class TestSteps1 {
    private TestPage1 TestPage1;

    @Step
    public void navigate_to_page(){TestPage1.navigateToPage();}

    @Step
    public void set_two_input_field1(String value){TestPage1.setTwoInputField1(value);}

    @Step
    public void set_two_input_field2(String value){TestPage1.setTwoInputField2(value);}

    @Step
    public void click_get_total_button(){TestPage1.clickGetTotalButton();}

    @Step
    public void assert_get_two_input_display_value(String value){
       assertThat(TestPage1.getTwoInputDisplayValue()).as("Display message is: ").isEqualTo(value);
    }


}

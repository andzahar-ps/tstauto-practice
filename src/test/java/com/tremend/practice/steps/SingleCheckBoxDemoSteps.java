package com.tremend.practice.steps;

import com.tremend.practice.tpages.SingleCheckBoxDemoPage;
import static org.junit.Assert.assertThat;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class SingleCheckBoxDemoSteps {

    SingleCheckBoxDemoPage singleCheckBoxDemoPage;

    @Step
    public void navigate_to_simple_checkbox_demo_page() {
        singleCheckBoxDemoPage.navigateToCheckBoxDemoPage();
    }

    @Step
    public void select_check_box(){
        singleCheckBoxDemoPage.selectCheckBox();
    }

    @Step
    public void assert_message_is_displayed( String value){
        Assertions.assertThat(singleCheckBoxDemoPage.getSuccessMessage()).as("Display message is: ").isEqualTo(value);
        singleCheckBoxDemoPage.getSuccessMessage();
    }
}

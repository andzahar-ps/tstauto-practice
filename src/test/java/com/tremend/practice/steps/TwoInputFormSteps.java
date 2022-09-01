package com.tremend.practice.steps;
import com.tremend.practice.tpages.TwoInputFormPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;


public class TwoInputFormSteps {

        private TwoInputFormPage twoInputFormPage;

        @Step
        public void navigate_to_simple_demo_page() {

            twoInputFormPage.navigateToSimpleDemoPage();
        }

       @Step
       public void user_inserts_input_fields(String value1, String value2) {
           twoInputFormPage.setSumInputFields(value1, value2);
       }
        @Step
        public void click_get_total_button() {
            twoInputFormPage.clickGetTotalButton();
        }

        @Step
        public void assert_message_is_displayed(String value) {
            assertThat( twoInputFormPage.getTextDisplayValueLabel()).as("Display message is:").isEqualTo(value);
        }

    }


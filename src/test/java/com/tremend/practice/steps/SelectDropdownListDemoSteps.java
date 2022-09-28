package com.tremend.practice.steps;

import com.tremend.practice.tpages.SelectDropdownListDemoPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectDropdownListDemoSteps {

        private SelectDropdownListDemoPage selectDropdownListDemoPage;

        @Step
        public void navigate_to_dropdown_list_page() {
            selectDropdownListDemoPage.navigateToDropdownListPage();
        }

        @Step
        public void the_user_clicks_on_dropdown_list(String value) {
            switch (value) {
                case "Sunday":
                    selectDropdownListDemoPage.selectDropdownListOption(1);
                    break;
                case "Monday":
                    selectDropdownListDemoPage.selectDropdownListOption(2);
                    break;
                default:
                    Assert.fail(value + "is not defined in the test framework");
            }
        }

//        @Step
//        public void user_clicks_get_checked_values_button() {
//            radioButtonsDemoPage.clickGetCheckedValuesButton();
//        }

        @Step
        public void assert_message_is_displayed(String weekday) {
            assertThat(selectDropdownListDemoPage.getTextDisplayDayMessage()).as("Display message is : ").isEqualTo("Day selected :- " + weekday );

        }
}

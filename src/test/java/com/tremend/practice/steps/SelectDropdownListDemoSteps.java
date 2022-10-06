package com.tremend.practice.steps;

import com.tremend.practice.tpages.SelectDropdownListDemoPage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import org.junit.Assert;

public class SelectDropdownListDemoSteps {

    private SelectDropdownListDemoPage selectDropdownListDemoPage;

    @Step
    public void navigate_to_dropdown_list_demo_page() {
        selectDropdownListDemoPage.navigateToDropdownListDemoPage();
    }

    @Step
    public void the_user_clicks_on_dropdown_list(String day) {
        switch (day) {
            case "Sunday":
                selectDropdownListDemoPage.selectDropdownList(0);
                break;
            case "Monday":
                selectDropdownListDemoPage.selectDropdownList(1);
                break;
            case "Tuesday":
                selectDropdownListDemoPage.selectDropdownList(2);
                break;
            case "Wednesday":
                selectDropdownListDemoPage.selectDropdownList(3);
                break;
            case "Thursday":
                selectDropdownListDemoPage.selectDropdownList(4);
                break;
            case "Friday":
                selectDropdownListDemoPage.selectDropdownList(5);
                break;
            case "Saturday":
                selectDropdownListDemoPage.selectDropdownList(6);
                break;
            default:
                Assert.fail(day + "is not an option");
        }
    }

    @Step
    public void assert_message_is_displayed(String weekday){
        Assertions.assertThat(selectDropdownListDemoPage.getTextSuccessMessage()).isEqualTo("Day selected :-" + weekday);
    }
}

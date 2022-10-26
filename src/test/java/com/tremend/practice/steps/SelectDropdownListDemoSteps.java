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
    public void the_user_selects_option_from_dropdown_list(String value) {
        selectDropdownListDemoPage.selectDayDropdownValue(value);
    }

    @Step
    public void assert_message_is_displayed(String weekday){
        Assertions.assertThat(selectDropdownListDemoPage.getTextSuccessMessage()).isEqualTo("Day selected :-" + weekday);
    }
}

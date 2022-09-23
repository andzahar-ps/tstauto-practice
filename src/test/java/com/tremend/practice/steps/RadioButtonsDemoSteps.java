package com.tremend.practice.steps;
import com.tremend.practice.tpages.RadioButtonsDemoPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class RadioButtonsDemoSteps {

    private RadioButtonsDemoPage radioButtonsDemoPage;

    @Step
    public void navigate_to_radio_buttons_page() {
        radioButtonsDemoPage.navigateToRadioButtonsPage();
    }

    @Step
    public void the_user_clicks_on_gender_button(String value) {
        switch (value) {
            case "Male":
                radioButtonsDemoPage.clickOnMaleRadioButton();
                break;
            case "Female":
                radioButtonsDemoPage.clickOnFemaleRadioButton();
                break;
            default:
                Assert.fail(value + "is not defined in the test framework");
        }
    }

    @Step
    public void user_clicks_get_checked_values_button() {
        radioButtonsDemoPage.clickGetCheckedValuesButton();
    }

    @Step
    public void assert_message_is_displayed(String gender) {
        assertThat(radioButtonsDemoPage.getDisplayGenderMessage()).as("Display message is : ").isEqualTo("Radio button '" + gender + "' is checked");

    }
}
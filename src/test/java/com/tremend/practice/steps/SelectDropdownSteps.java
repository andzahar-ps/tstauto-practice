package com.tremend.practice.steps;

import com.tremend.practice.tpages.SelectDropdownPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectDropdownSteps {

    private SelectDropdownPage selectDropdownPage;

    @Step
    public void navigate_to_dropdown_steps_page() {
        selectDropdownPage.navigateToDropdownPage();
    }

    @Step
    public void user_clicks_on_weekday(String day) {
        switch (day) {
            case "Sunday":
                selectDropdownPage.clickOnSingleSelectDropdown(1);
                break;
            case "Monday":
                selectDropdownPage.clickOnSingleSelectDropdown(2);
                break;
            case "Tuesday":
                selectDropdownPage.clickOnSingleSelectDropdown(3);
                break;
            case "Wednesday":
                selectDropdownPage.clickOnSingleSelectDropdown(4);
                break;
            case "Thursday":
                selectDropdownPage.clickOnSingleSelectDropdown(5);
                break;
            case "Friday":
                selectDropdownPage.clickOnSingleSelectDropdown(6);
                break;
            case "Saturday":
                selectDropdownPage.clickOnSingleSelectDropdown(7);
                break;
            default:
                Assert.fail(day + "is not defined in the test framework");
        }
    }

    @Step
    public void assert_correct_message_is_displayed(String day) {
        assertThat(selectDropdownPage.getMessageSelectedDay()).as("Display message is:").isEqualTo("Day selected :- " + day);
    }

    @Step
    public void user_inspects_dropdown_placeholder() {
        selectDropdownPage.inspectPlaceholder();
    }

    @Step
    public void assert_placeholder_is_displayed() {
        assertThat(selectDropdownPage.getPlaceholder()).isEqualTo("Please select");
    }

/*    @Step
    public static void user_selects_multiple_states(String multipleVals) {
        String multipleSel[] = multipleVals.split(",");
        for (String valueToBeSelected : multipleSel) {
            new Select(driver.findElement(By.id(propId))).selectByVisibleText(valueToBeSelected);
            driver.findElement(By.id(ddObj)).sendKeys(Keys.CONTROL);
        }
    }*/
}

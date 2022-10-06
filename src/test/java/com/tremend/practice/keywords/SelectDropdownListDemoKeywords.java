package com.tremend.practice.keywords;

import com.tremend.practice.steps.SelectDropdownListDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectDropdownListDemoKeywords {

    private SelectDropdownListDemoSteps selectDropdownListDemoSteps;

    @Given("that the user is on Select Dropdown List page")
    public void thatTheUserIsOnSelectDropdownListPage() {
        selectDropdownListDemoSteps.navigate_to_dropdown_list_demo_page();
    }

    @When("the user selects a day of the week from the dropdown")
    public void theUserSelectsADayOfTheWeekFromTheDropdown(String day) {
        selectDropdownListDemoSteps.the_user_clicks_on_dropdown_list(day);
    }

    @Then("a proper message with selected {string} value is displayed")
    public void aProperMessageWithSelectedValueIsDisplayed(String message) {
        selectDropdownListDemoSteps.assert_message_is_displayed(message);
    }
}

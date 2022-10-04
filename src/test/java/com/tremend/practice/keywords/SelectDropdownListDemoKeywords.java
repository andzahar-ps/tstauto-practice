package com.tremend.practice.keywords;
import com.tremend.practice.steps.SelectDropdownListDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class SelectDropdownListDemoKeywords {

    @Steps
    private SelectDropdownListDemoSteps selectDropdownListSteps;


    // ========== GIVEN Keywords

    @Given("that the user is on Select Dropdown List page")
    public void thatTheUserIsOnDropdownListPage() {
        selectDropdownListSteps.navigate_to_dropdown_list_page();
    }


    // ========== WHEN Keywords


    @When("the user opens the dropdown list")
    public void theUserOpensTheDropdownList() {
        selectDropdownListSteps.user_opens_dropdown_list();
    }

    @And("the user clicks on {string}")
    public void theUserClicksOn(String weekday) {
        selectDropdownListSteps.the_user_clicks_on_dropdown_list(weekday);
    }

    // ========== THEN Keywords


    @Then("a proper message with {string} value will be visible")
    public void aProperMessageWithStringValueIsDisplayed(String weekday) {
        selectDropdownListSteps.assert_message_is_displayed(weekday);
    }
}
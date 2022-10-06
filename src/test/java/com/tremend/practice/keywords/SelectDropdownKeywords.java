package com.tremend.practice.keywords;

import com.tremend.practice.steps.SelectDropdownSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SelectDropdownKeywords {

    @Steps
    private SelectDropdownSteps  selectDropdownSteps;

    @Given("that the user is present on Select Dropdown List Page")
    public void thatTheUserIsPresentOnSelectDropdownListPage(){
        selectDropdownSteps.navigate_to_dropdown_steps_page();
    }

    @When("the user selects the week day {string} from the dropdown list")
    public void theUserSelectsTheWeekDayFromTheDropdownList(String day){
        selectDropdownSteps.user_clicks_on_weekday(day);
    }
    @When("the user inspects the single select dropdown menu")
    public void theUserInspectsTheSingleSelectDropdownMenu(){
        selectDropdownSteps.user_inspects_dropdown_placeholder();
    }

    @Then("the user is displayed a message with the selected day {string}")
    public void theUserIsDisplayedAMessageWithTheSelectedDay(String day){
        selectDropdownSteps.assert_correct_message_is_displayed(day);

    }

    @Then("the user sees the dropdown has the placeholder 'Please select'")
    public void theUserSeesTheDropdownHasAPlaceholder(){
        selectDropdownSteps.assert_placeholder_is_displayed();
    }
}

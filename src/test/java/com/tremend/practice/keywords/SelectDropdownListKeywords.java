package com.tremend.practice.keywords;

import com.tremend.practice.steps.SelectDropdownListSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SelectDropdownListKeywords {

    @Steps
    private SelectDropdownListSteps selectDropdownListSteps;


    // ============= SELECT FIELD DEMO Keywords

    // First Scenario Keywords

    @Given("the user is on the Select Dropdown List page")
    public void theUserIsOnTheSelectDropdownListPage() {
        selectDropdownListSteps.navigate_to_select_dropdown_list();
    }

    @When("the user clicks on the select field")
    public void theUserClickOnTheSelectField() {
        selectDropdownListSteps.the_user_clicks_select_field();
    }

    @And("the user selects one from the dropdown list")
    public void theUserSelectsOneFromTheDropdownList() {
        selectDropdownListSteps.the_user_selects_option_from_dropdown_list(7);
    }

    @Then("the selected {string} is shown inside the text message")
    public void theSelectedIsShownInsideTheTextMessage(String option) {
        selectDropdownListSteps.assert_option_selected_is_shown_in_text(option);
    }



    // Second Scenario Keywords

    @Given("the user is on the Select Dropdown List demo page")
    public void theUserIsOnTheSelectDropdownListDemoPage() {
        selectDropdownListSteps.navigate_to_select_dropdown_list();
    }

    @When("the user clicks on the Please select field")
    public void theUserClicksOnThePleaseSelectField() {
        selectDropdownListSteps.the_user_clicks_select_field();
    }

    @Then("the user is not able to click on first option of the dropdown")
    public void theUserIsNotAbleToClickOnFirstOptionOfTheDropdown() {
        selectDropdownListSteps.assert_first_option_is_disabled();
    }




    // Third Scenario Keywords

    @Given("the user is on Select Dropdown List demo")
    public void theUserIsOnSelectDropdownListDemo() {
        selectDropdownListSteps.navigate_to_select_dropdown_list();
    }

    @When("the user clicks on Select Field dropdown")
    public void theUserClicksOnSelectFieldDropdown() {
        selectDropdownListSteps.the_user_clicks_select_field();
    }

    @And("the user selects an option from the dropdown")
    public void theUserSelectsAnOptionFromTheDropdown() {
        selectDropdownListSteps.the_user_selects_option_from_dropdown_list(7);
    }

    @Then("the placeholder of the field shows the previously made {string}")
    public void thePlaceholderOfTheFieldShowsThePreviouslyMade(String selection) {
        selectDropdownListSteps.assert_placeholder_is_same_with_selection(selection);
    }






    // ============= MULTI SELECT LIST DEMO Keywords

    // First Scenario Keywords

    @Given("the user is on the Select Dropdown List page demo")
    public void theUserIsOnTheSelectDropdownListPageDemo() {
        selectDropdownListSteps.navigate_to_select_dropdown_list();
    }

    @When("the user selects multiple options from the list")
    public void theUserSelectsMultipleOptionsFromTheList() {
        selectDropdownListSteps.the_user_selects_multiple_options();
    }

    @And("the user clicks the First Selected button")
    public void theUserClicksTheFirstButton() {
        selectDropdownListSteps.the_user_clicks_first_selected_button();
    }

    @Then("the user is able to see the first option that was selected")
    public void theUserIsAbleToSeeTheFirstOptionThatWasSelected() {
        selectDropdownListSteps.assert_first_option_selected_is_displayed_in_text_message();
    }




    // Second Scenario Keywords

    @Given("the user has navigated to the Select Dropdown List demo page")
    public void theUserHasNavigatedToTheSelectDropdownListDemoPage() {
        selectDropdownListSteps.navigate_to_select_dropdown_list();
    }

    @When("the user is selecting multiple options from the list")
    public void theUserIsSelectingMultipleOptionsFromTheList() {
        selectDropdownListSteps.the_user_selects_multiple_options();
    }

    @And("the user is clicking the Get All Selected button")
    public void theUserIsClickingTheGetAllSelectedButton() {
        selectDropdownListSteps.the_user_clicks_all_selected_button();
    }

    @Then("the user is able to see all the selected options")
    public void theUserIsAbleToSeeAllTheSelectedOptions() {
        selectDropdownListSteps.assert_all_selected_options_are_displayed_in_text_message();
    }
}

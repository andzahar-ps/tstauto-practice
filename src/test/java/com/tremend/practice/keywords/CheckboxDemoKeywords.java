package com.tremend.practice.keywords;

import com.tremend.practice.steps.CheckboxDemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckboxDemoKeywords {

    @Steps
    private CheckboxDemoSteps checkboxDemoSteps;

    // GIVEN keywords:

    @Given("that the user is on the Checkbox Demo page")
    public void theUserIsOnCheckBoxDemoPage(){
        checkboxDemoSteps.navigate_to_checkbox_demo_page();
    }

    // WHEN keywords:

    @When("the user checks the single check mark from the Single Checkbox Demo window")
    public void theUserClicksOnTheCheckBox(){
        checkboxDemoSteps.user_clicks_age_selection_checkbox();
    }

    @When( "the user checks all of the checkboxes from the Multiple Checkbox Demo window")
    public void theUserClicksOnAllTheCheckboxes(){
        checkboxDemoSteps.user_clicks_checkbox_list(0);
        checkboxDemoSteps.user_clicks_checkbox_list(1);
        checkboxDemoSteps.user_clicks_checkbox_list(2);
        checkboxDemoSteps.user_clicks_checkbox_list(3);

    }
    @When("the user clicks on the check all button")
    public void theUserClicksOnTheCheckAllButton(){
        checkboxDemoSteps.user_clicks_the_check_all_button();
    }


    // THEN keywords:

    @Then("the message attesting the checkbox has been checked is displayed")
    public void theCheckBoxMessageIsDisplayed(){
        checkboxDemoSteps.assert_message_is_displayed("Success - Check box is checked");
    }


    @Then("all of the checkboxes have been checked")
    public void areAllCheckboxesSelected(){
        checkboxDemoSteps.assert_checkbox_list_selection(true, 0);
        checkboxDemoSteps.assert_checkbox_list_selection(true, 1);
        checkboxDemoSteps.assert_checkbox_list_selection(true, 2);
        checkboxDemoSteps.assert_checkbox_list_selection(true, 3);
    }

    @Then("all of the checkboxes have been checked automatically")
    public void areAllCheckboxesChecked(){
        checkboxDemoSteps.assert_checkbox_list_selection(true, 0);
        checkboxDemoSteps.assert_checkbox_list_selection(true, 1);
        checkboxDemoSteps.assert_checkbox_list_selection(true, 2);
        checkboxDemoSteps.assert_checkbox_list_selection(true, 3);
    }

    //AND keywords:

    @And("the checkbox selection is validated")
    public void theCheckBoxValidation(){
        checkboxDemoSteps.is_checkbox_selected(true);
    }

    @And("the uncheck all button is clicked")
    public void uncheckAllButton(){
        checkboxDemoSteps.user_clicks_the_check_all_button();
    }

}

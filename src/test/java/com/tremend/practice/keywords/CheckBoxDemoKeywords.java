package com.tremend.practice.keywords;

import com.tremend.practice.steps.CheckBoxDemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CheckBoxDemoKeywords {

    @Steps
    private CheckBoxDemoSteps checkBoxDemoSteps;

    // GIVEN keywords:

    @Given("that the user is on the Checkbox Demo page")
    public void theUserIsOnCheckBoxDemoPage(){
        checkBoxDemoSteps.navigate_to_checkbox_demo_page();
    }

    // WHEN keywords:

    @When("the user checks the single check mark from the Single Checkbox Demo window")
    public void theUserClicksOnTheCheckBox(){
        checkBoxDemoSteps.user_clicks_age_selection_check_box();
    }

    @When( "the user checks all of the checkboxes from the Multiple Checkbox Demo window")
    public void theUserClicksOnAllTheCheckboxes(){
        checkBoxDemoSteps.user_clicks_first_check_box();
        checkBoxDemoSteps.user_clicks_second_check_box();
        checkBoxDemoSteps.user_clicks_third_check_box();
        checkBoxDemoSteps.user_clicks_fourth_check_box();
    }

    // THEN keywords:

    @Then("the message attesting the checkbox has been checked is displayed")
    public void theCheckBoxMessageIsDisplayed(){
        checkBoxDemoSteps.assert_message_is_displayed("Success - Check box is checked");
    }


    @Then("the user is notified that all of the checkboxes have been checked")
    public boolean theFirstCheckBoxIsChecked(){
        return checkBoxDemoSteps.is_first_check_box_selected();
    }
    public boolean theSecondCheckBoxIsChecked(){
        return checkBoxDemoSteps.is_second_check_box_selected();
    }
    public boolean theThirdCheckBoxIsChecked(){
        return checkBoxDemoSteps.is_third_check_box_selected();
    }

    public boolean theFourthCheckBoxIsChecked(){
        return checkBoxDemoSteps.is_fourth_check_box_selected();
    }

    //AND keywords:

    @And("the checkbox selection is validated")
    public boolean theCheckBoxValidation(){
        return checkBoxDemoSteps.is_checkbox_selected();
    }
}

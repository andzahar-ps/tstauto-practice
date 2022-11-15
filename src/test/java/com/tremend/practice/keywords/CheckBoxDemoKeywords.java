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

    // THEN keywords:

    @Then("the message attesting the checkbox has been checked is displayed")
    public void theCheckBoxMessageIsDisplayed(){
        checkBoxDemoSteps.assert_message_is_displayed("Success - Check box is checked");
    }

    @And("the checkbox selection is validated")
    public void theCheckBoxValidation(){
        checkBoxDemoSteps.is_checkbox_selected();
    }
}

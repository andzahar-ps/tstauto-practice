package com.tremend.practice.keywords;

import com.tremend.practice.steps.BasicCheckBoxDemoSteps;
import com.tremend.practice.steps.BasicFirstFormSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class BasicCheckBoxDemoKeywords {

    @Steps
    private BasicCheckBoxDemoSteps basicCheckBoxDemoSteps;

    @Given("that the user is on Basic Checkbox Demo Page")
    public void thatTheUserIsOnBasicCheckboxDemoPage(){
        basicCheckBoxDemoSteps.navigate_to_basic_check_box_demo();
    }

    @When("the user clicks on the check box")
    public void theUserClickOnTheCheckbox(){
        basicCheckBoxDemoSteps.click_on_check_box();
    }

    @Then("the {string} success message will be displayed")
    public void theSuccessMessageWillBeDisplayed(String text){
        basicCheckBoxDemoSteps.display_success_message(text);
    }


}

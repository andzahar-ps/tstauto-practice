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


    //Select List Demo keywords:

    @Given("that the user is on the Select Dropdown List webpage")
    public void theUserIsOnSelectDropdownListPage(){
        selectDropdownListSteps.navigate_to_select_dropdown_list_page();
    }

    @When("the user selects one value {string} from the dropdown list")
    public void theUserSelectValueFromDropdownList(String value){
        selectDropdownListSteps.user_selects_dropdown_list_value(value);
    }

    @Then("the message returned, displays the value {string} selected by the user")
    public void theSelectListDemoMessageIsDisplayed(String value){
        selectDropdownListSteps.assert_dropdown_list_message(value);
    }

    //Multi Select List Demo keywords:
    @When("the user selects multiple values from the Multi Select dropdown list")
    public void theUserSelectsMultipleValues(){
        selectDropdownListSteps.user_selects_multiple_values();
    }

    @And("the user clicks on the First selected button")
    public void theUserClicksTheFirstSelectedButton() {
        selectDropdownListSteps.user_clicks_first_selected_button();
    }

    @Then("the message returned, displays the values selected by the user")
    public void theMultiSelectListMessageIsDisplayed(){
        selectDropdownListSteps.assert_multi_select_list_message();
    }

}

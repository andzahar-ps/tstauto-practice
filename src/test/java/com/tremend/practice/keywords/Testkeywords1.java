package com.tremend.practice.keywords;

import com.tremend.practice.steps.TestSteps1;
import com.tremend.practice.tpages.TestPage1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Testkeywords1 {

    @Steps
    private TestSteps1 TestSteps1;


    //GIVEN
    @Given("That the user is on the Simple Forms page")
    public void userIsOnSimpleFormsPage(){
        TestSteps1.navigate_to_page();
    }

    //WHEN
    @When("the user enters a value in fields {string} and {string}")
    public void userEntersValues(String aValue, String bValue) {
        TestSteps1.set_two_input_field1(aValue);
        TestSteps1.set_two_input_field2(bValue);
        TestSteps1.click_get_total_button();
    }

    @Then("The total sum {string} of the values is displayed")
    public void totalValueIsDisplayed(String valueTotal){
        TestSteps1.assert_get_two_input_display_value(valueTotal);
    }

}

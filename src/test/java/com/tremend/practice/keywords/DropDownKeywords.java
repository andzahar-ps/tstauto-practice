package com.tremend.practice.keywords;

import com.tremend.practice.steps.DropDownDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DropDownKeywords {
    @Steps
    DropDownDemoSteps dropDownDemoSteps;

    @Given("that the user is on Dropdown List page")
    public void thatTheUserIsOnDropdownListPage() {
        dropDownDemoSteps.user_navigates_to_dropdown_page();
    }

    @When("the user select the option {string} from the form")
    public void theUserSelectTheOptionFromTheForm(String value) {
        dropDownDemoSteps.user_selects_value(value);
    }

    @Then("{string} is displayed in Dropdown List Page")
    public void theCorrectMessageIsDisplayedInDropdownListPage(String value) {
        dropDownDemoSteps.message_is_displayed(value);
    }
}

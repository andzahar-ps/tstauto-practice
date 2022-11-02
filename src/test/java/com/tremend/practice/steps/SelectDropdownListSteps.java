package com.tremend.practice.steps;

import com.tremend.practice.tpages.SelectDropdownListPage;
import com.tremend.practice.util.constants.framework.SessionVars;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectDropdownListSteps {

    private SelectDropdownListPage selectDropdownListPage;


    // ====== Navigate to the page
    @Step
    public void navigate_to_select_dropdown_list() {
        selectDropdownListPage.navigateToSelectDropdownListPage();
    }



    // =============== SELECT LIST DEMO Steps

    // First Scenario Steps

    @Step
    public void the_user_clicks_select_field() {
        selectDropdownListPage.clickSelectField();
    }

    @Step
    public void the_user_selects_option_from_dropdown_list(int index) {
        selectDropdownListPage.selectOptionFromDropdownList(index);
    }

    @Step
    public void assert_option_selected_is_shown_in_text(String option) {
        assertThat(selectDropdownListPage.getTextFromTextMessage()).isEqualTo("Day selected :- " + option);
    }



    // Second Scenario Steps

    @Step
    public void assert_first_option_is_disabled() {
        selectDropdownListPage.selectFirstOptionFromDropdown();
    }



    // Third Scenario Steps

    @Step
    public void assert_placeholder_is_same_with_selection(String selection) {
        assertThat(selectDropdownListPage.getPlaceholderFromSelectField()).isEqualTo(selection);
    }





    // =============== MULTI SELECT LIST DEMO Steps

    // First Scenario Steps

    @Step
    public void the_user_selects_multiple_options() {
        selectDropdownListPage.clickMultipleOptions();
    }

    @Step
    public void the_user_clicks_first_selected_button() {
        selectDropdownListPage.clickFirstSelectedButton();
    }

    @Step
    public void assert_first_option_selected_is_displayed_in_text_message() {
        assertThat(selectDropdownListPage.getTextDisplayedCountries()).isEqualTo("First selected option is : " + selectDropdownListPage.getTextCountryOptionByIndex(0));
    }



    // Second Scenario Steps

    @Step
    public void the_user_clicks_all_selected_button() {
        selectDropdownListPage.clickGetAllButton();
    }

    @Step
    public void assert_all_selected_options_are_displayed_in_text_message() {

        assertThat(selectDropdownListPage.getTextDisplayedCountries()).isEqualTo("Options selected are : "
                + selectDropdownListPage.getTextCountryOptionByIndex(Serenity.sessionVariableCalled( SessionVars.DROP_DOWN_FIRST_RANDOM_NUMBER) ) + ","
                + selectDropdownListPage.getTextCountryOptionByIndex(Serenity.sessionVariableCalled( SessionVars.DROP_DOWN_SECOND_RANDOM_NUMBER) ) + ","
                + selectDropdownListPage.getTextCountryOptionByIndex(Serenity.sessionVariableCalled( SessionVars.DROP_DOWN_THIRD_RANDOM_NUMBER) ));
    }
}

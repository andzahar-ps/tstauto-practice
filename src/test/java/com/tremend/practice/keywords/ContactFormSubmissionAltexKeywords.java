package com.tremend.practice.keywords;

import com.tremend.practice.steps.ContactFormSubmissionAltexSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactFormSubmissionAltexKeywords {

    @Steps
    private ContactFormSubmissionAltexSteps contactFormSubmissionAltexSteps;



    @Given("the user has navigated to the Altex homepage")
    public void theUserHasNavigatedToTheAltexHomepage() {
        contactFormSubmissionAltexSteps.navigate_to_altex_homepage();
    }

    @And("the user clicks on the Contact link button")
    public void theUserClicksOnTheContactLinkButton() {
        contactFormSubmissionAltexSteps.the_user_clicks_on_contact_button();
    }

    @When("the user fills in all the required fields")
    public void theUserFillsInAllTheRequiredFields() {
        contactFormSubmissionAltexSteps.the_user_sets_numePrenume_value("Moartea din Carpati");
        contactFormSubmissionAltexSteps.the_user_sets_telefon_value("07222222");
        contactFormSubmissionAltexSteps.the_user_sets_adresa_email_value("moarteadincarpati@gmail.com");
        contactFormSubmissionAltexSteps.the_user_clicks_radiobox_suport();
        contactFormSubmissionAltexSteps.the_user_selects_tip_solicitare_dropdown(2);
        contactFormSubmissionAltexSteps.the_user_selects_detalii_solicitare_dropdown(2);
        contactFormSubmissionAltexSteps.the_user_selects_informatii_aditionale_dropdown(2);
        contactFormSubmissionAltexSteps.the_user_sets_message_value("Test123!");
    }

    @And("the user submits the form")
    public void theUserSubmitsTheForm() {
        contactFormSubmissionAltexSteps.the_user_checks_termeni_conditii_checkbox();
        contactFormSubmissionAltexSteps.the_user_clicks_aplica_button();
    }

    @Then("the user is able to see a successful message being displayed")
    public void theUserIsAbleToSeeASuccessfulMessageBeingDisplayed() {
        contactFormSubmissionAltexSteps.assert_successful_message("Solicitarea ta a fost inregistrata!");
    }
}

package com.tremend.practice.steps;

import com.tremend.practice.tpages.ContactFormSubmissionAltexPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;


public class ContactFormSubmissionAltexSteps {

    private ContactFormSubmissionAltexPage contactFormSubmissionAltexPage;


    // === Navigate to the page

    @Step
    public void navigate_to_altex_homepage() {
        contactFormSubmissionAltexPage.navigateToInputFormSubmitPage();
        contactFormSubmissionAltexPage.clickCookieAcceptButton();
    }



    // == Contact Form Submission Steps

    @Step
    public void the_user_clicks_on_contact_button() {
        contactFormSubmissionAltexPage.clickContactButton();
    }

    @Step
    public void the_user_sets_numePrenume_value(String numePrenume) {
        contactFormSubmissionAltexPage.setNumePrenumeInputValue(numePrenume);
    }

    @Step
    public void the_user_sets_telefon_value(String telefon) {
        contactFormSubmissionAltexPage.setTelefonInputValue(telefon);
    }

    @Step
    public void the_user_sets_adresa_email_value(String adresaEmail) {
        contactFormSubmissionAltexPage.setAdresaEmailInputValue(adresaEmail);
    }

    @Step
    public void the_user_clicks_radiobox_suport() {
        contactFormSubmissionAltexPage.clickRadioBox();
    }

    @Step
    public void the_user_selects_tip_solicitare_dropdown(int indexTipSolicitare) {
        contactFormSubmissionAltexPage.selectOptionTipSolicitareDropdown(indexTipSolicitare);
    }

    @Step
    public void the_user_selects_detalii_solicitare_dropdown(int indexDetaliiSolicitare) {
        contactFormSubmissionAltexPage.selectOptionDetaliiSolicitareDropdown(indexDetaliiSolicitare);
    }

    @Step
    public void the_user_selects_informatii_aditionale_dropdown(int indexInformatiiAditionale) {
        contactFormSubmissionAltexPage.selectOptionInformatiiAditionaleDropdown(indexInformatiiAditionale);
    }

    @Step
    public void the_user_sets_message_value(String mesaj) {
        contactFormSubmissionAltexPage.setMesajInputValue(mesaj);
    }

    @Step
    public void the_user_checks_termeni_conditii_checkbox() {
        contactFormSubmissionAltexPage.clickTermeniSiConditiiCheckbox();
    }

    @Step
    public void the_user_clicks_aplica_button() {
        contactFormSubmissionAltexPage.clickAplicaButton();
    }

    @Step
    public void assert_successful_message(String successMessage) {
        assertThat(contactFormSubmissionAltexPage.getSuccessfulMessage()).as("Successful message is: ").isEqualTo(successMessage);
    }
}

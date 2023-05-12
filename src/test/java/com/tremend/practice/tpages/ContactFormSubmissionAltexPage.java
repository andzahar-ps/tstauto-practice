package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactFormSubmissionAltexPage extends PageObject {


    // === Contact Form Submission Elements

    @FindBy(xpath = "//a[contains(text(), 'Contact')]")
    private WebElementFacade homepageContactButton;

    @FindBy(xpath = "//input[@id='contact_full_name']")
    private WebElementFacade numePrenumeInputField;

    @FindBy(xpath = "//input[@id='contact_phone']")
    private WebElementFacade telefonInputField;

    @FindBy(xpath = "//input[@id='contact_email']")
    private WebElementFacade adresaEmailInputField;

    @FindBy(xpath = "(//span[contains(@class, 'checkbox-control')])[1]")
    private WebElementFacade suportLegatDeRadioButton;

    @FindBy(xpath = "//select[@name='type']/option")
    private List<WebElementFacade> tipSolicitareDropdown;

    @FindBy(xpath = "//select[@name='detail']/option")
    private List<WebElementFacade> detaliiSolicitareDropdown;

    @FindBy(xpath = "//select[@name='additionalDetail']/option")
    private List<WebElementFacade> informatiiAditionaleDropdown;

    @FindBy(xpath = "//textarea[@name='message']")
    private WebElementFacade mesajInputField;

    @FindBy(xpath = "//input[@name='terms_and_conditions']/../span[1]")
    private WebElementFacade termeniSiConditiiCheckbox;

    @FindBy(xpath = "//span[contains(text(), 'Aplica')]/../..")
    private WebElementFacade aplicaButton;

    @FindBy(xpath = "//p[contains(text(), 'Pentru mai multe detalii')]/../h3")
    private WebElementFacade successfulMessage;


    @FindBy(xpath = "//span[contains(text(), 'Accepta')]/ancestor::button")
    private WebElementFacade cookieAccept;





    // === Navigate to the page

    public void navigateToInputFormSubmitPage() {
        getDriver().navigate().to("https://altex.ro/");
    }



    // === Contact Form Submission Methods

    public void clickCookieAcceptButton() {
        cookieAccept.click();
    }

    public void clickContactButton() {
        homepageContactButton.click();
    }

    public void setNumePrenumeInputValue(String numePrenume) {
        numePrenumeInputField.sendKeys(numePrenume);
    }

    public void setTelefonInputValue(String telefon) {
        telefonInputField.sendKeys(telefon);
    }

    public void setAdresaEmailInputValue(String adresaEmail) {
        adresaEmailInputField.sendKeys(adresaEmail);
    }

    public void clickRadioBox() {
        suportLegatDeRadioButton.click();
    }

    public void selectOptionTipSolicitareDropdown(int indexTipSolicitare) {
        tipSolicitareDropdown.get(indexTipSolicitare).click();
    }

    public void selectOptionDetaliiSolicitareDropdown(int indexDetaliiSolicitare) {
        detaliiSolicitareDropdown.get(indexDetaliiSolicitare).click();
    }

    public void selectOptionInformatiiAditionaleDropdown(int indexInformatiiAditionale) {
        informatiiAditionaleDropdown.get(indexInformatiiAditionale).click();
    }

    public void setMesajInputValue(String mesaj) {
        mesajInputField.sendKeys(mesaj);
    }

    public void clickTermeniSiConditiiCheckbox() {
        termeniSiConditiiCheckbox.click();
    }

    public void clickAplicaButton() {
        aplicaButton.click();
    }

    public String getSuccessfulMessage() {
        return successfulMessage.getText();
    }
}

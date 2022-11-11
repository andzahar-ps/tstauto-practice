package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class InputFormValidationsPage extends PageObject {

    @FindBy(css = ".btn.btn-default")
    private WebElementFacade sendButton;

    @FindBy(name = "phone")
    private WebElementFacade phoneNumberField;

    @FindBy(css = "#contact_form > fieldset > div:nth-child(5) > div > small:nth-child(3)")
    private WebElementFacade validationMessage;

    @FindBy(css = ".help-block[data-bv-validator='phone']")
    private WebElementFacade invalidNumberMessage;

    @FindBy(css = "#contact_form > fieldset > div:nth-child(5) > div > i")
    private WebElementFacade validationErrorIcon;

    @FindBy(css = "#contact_form > fieldset > div.form-group.has-feedback.has-success > div > i")
    private WebElementFacade validationInputIcon;

    @FindBy(css = "small[data-bv-result='INVALID']")
    private List<WebElementFacade> listErrorMessages;

    @FindBy(name = "address")
    private WebElementFacade addressInputField;

    public void navigateToInputValidationsPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/input-form-demo.html");
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void setPhoneNumberField(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);
    }

    public String getTextErrorMessage() {
        return validationMessage.getText();
    }

    public String getTextInvalidNumberErrorMessage() {
        return invalidNumberMessage.getText();
    }

    public String isDisplayedErrorIcon() {
        return validationErrorIcon.getAttribute("class");
    }

    public String isDisplayedValidationIcon(){
        return validationInputIcon.getAttribute("class");
    }

    public int countAllErrorMessages() {
        return listErrorMessages.size();
    }

    public void clickAddressField() {
        addressInputField.click();
    }

}
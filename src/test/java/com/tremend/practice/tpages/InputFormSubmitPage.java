package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class InputFormSubmitPage extends PageObject {


    // ====== Input Form Submit Elements

    @FindBy(name = "first_name")
    private WebElementFacade firstNameField;

    @FindBy(name = "last_name")
    private WebElementFacade lastNameField;

    @FindBy(name = "email")
    private WebElementFacade emailField;

    @FindBy(name = "phone")
    private WebElementFacade phoneField;

    @FindBy(name = "address")
    private WebElementFacade addressField;

    @FindBy(name = "city")
    private WebElementFacade cityField;

    @FindBy(name = "state")
    private WebElementFacade stateDropdown;

    @FindBy(name = "zip")
    private WebElementFacade zipCodeField;

    @FindBy(name = "website")
    private WebElementFacade websiteField;

    @FindBy(name = "hosting")
    private List<WebElementFacade> hostingRadioButtonList;

    @FindBy(name = "comment")
    private WebElementFacade projectDescriptionField;

    @FindBy(css = ".btn.btn-default")
    private WebElementFacade sendButton;

    @FindBy(css ="#contact_form > fieldset > div.form-group.has-feedback.has-success > div > i")
    private WebElementFacade firstNameFieldSuccessfulIcon;

    @FindBy(css = "#contact_form > fieldset > div.form-group.has-feedback.has-error > div > i")
    private WebElementFacade firstNameFieldErrorIcon;

    @FindBy(css = "#contact_form > fieldset > div.form-group.has-feedback.has-error > div > small:nth-child(4)")
    private WebElementFacade firstNameFieldErrorMessage;

    @FindBy(css = "#contact_form > fieldset > div:nth-child(2) > div > div > span")
    private WebElementFacade firstNameFieldFrontalSpanIcon;




    // ======== Navigate to the page

    public void navigateToInputFormSubmitPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/input-form-demo.html");
    }



    // ======== General Methods

    public void clickSendButton() {
        sendButton.click();
    }

    public String getTextErrorMessage() {
        return firstNameFieldErrorMessage.getText();
    }

    public boolean isDisplayedSuccessfulIcon() {
        return firstNameFieldSuccessfulIcon.isDisplayed();
    }

    public boolean isDisplayedErrorIcon() {
        return firstNameFieldErrorIcon.isDisplayed();
    }

    public void clickLastNameField() {
        lastNameField.click();
    }




    // ======== First Scenario Methods -> First Name Field

    public String getCSSValueFirstNameField() {
        return firstNameFieldFrontalSpanIcon.getCssValue("border-color");
    }

    public void setFirstNameField(String input){
        firstNameField.sendKeys(input);
    }






































}

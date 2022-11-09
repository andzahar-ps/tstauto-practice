package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InputFormSubmitPage extends PageObject {

    @FindBy( name = "state")
    private WebElementFacade stateDropdown;

    @FindBy(css ="#contact_form > fieldset > div.form-group.has-feedback.has-success > div > i")
    private WebElementFacade successfulIcon;

    @FindBy(css = ".btn.btn-default")
    private WebElementFacade sendButton;

    public void navigateToInputFormSubmitPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/input-form-demo.html");
    }

    public void selectStateDropdownValue(String value) {

        stateDropdown.selectByValue(value);
    }

    public boolean isDisplayedSuccessfulIcon() {
        return successfulIcon.isDisplayed();
    }

    public void clickSendButton() {
        sendButton.click();
    }
}

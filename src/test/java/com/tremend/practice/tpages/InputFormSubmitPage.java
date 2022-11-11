package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class InputFormSubmitPage extends PageObject {


    @FindBy(name = "state")
    private WebElementFacade stateDropdown;

    @FindBy(css = "#contact_form > fieldset > div:nth-child(8) > div > small")
    private WebElementFacade stateFieldErrorMessage;

    public void navigateToInputFormSubmitPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/input-form-demo.html");
    }

    public void clickOnStateDropdown(String state) {
        stateDropdown.selectByValue(state);
    }

    public void clickOnPleaseSelectYourState () {
        stateDropdown.selectByVisibleText("Please select your state");
    }
    public String getTextDisplayError() {
        return stateFieldErrorMessage.getText();
    }
}
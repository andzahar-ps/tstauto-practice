package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RadioButtonsDemoPage extends PageObject {

    @FindBy(className = "radio-inline[1]")
    private WebElementFacade maleRadioButton;

    @FindBy(className = "radio-inline[2]")
    private WebElementFacade femaleRadioButton;

    @FindBy(id = "buttoncheck")
    private WebElementFacade getCheckedValueButton;

    @FindBy(className = "radiobutton")
    private WebElementFacade getGenderMessage;

    public void navigateToRadioButtonsPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void clickOnMaleRadioButton() {
        maleRadioButton.click();
    }

    public void clickOnFemaleRadioButton() {
        femaleRadioButton.click();
    }

    public void clickGetCheckedValuesButton() {
        getCheckedValueButton.click();
    }

    public String getDisplayGenderMessage() {
        return getGenderMessage.getText();
    }
}


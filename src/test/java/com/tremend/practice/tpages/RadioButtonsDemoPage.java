package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RadioButtonsDemoPage extends PageObject {
    //Radio Button Demo

    @FindBy(css = "input[value='Male'][name='optradio']")
    private WebElementFacade maleRadioButton;

    @FindBy(css = "input[value='Male'][name='optradio']")
    private WebElementFacade femaleRadioButton;

    @FindBy(id = "buttoncheck")
    private WebElementFacade checkedButton;

    @FindBy(className = "radiobutton")
    private WebElementFacade successMessage;

    public void navigateToRadioButtonDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    public void clickMaleRadioButton() {
        maleRadioButton.click();
    }

    public void clickFemaleRadioButton() {
        femaleRadioButton.click();
    }

    public void checkedValue() {
        checkedButton.click();
    }

    public String getSuccessMessage(){
        return successMessage.getText();
    }

}

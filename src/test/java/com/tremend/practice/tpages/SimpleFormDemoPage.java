package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SimpleFormDemoPage extends PageObject {

    @FindBy(id = "user-message")
    private WebElementFacade userMessageField;

    @FindBy(css = "#get-input > button")
    private WebElementFacade showMessageButton;

    @FindBy(id = "display")
    private WebElementFacade displayLabel;


    public void navigateToSimpleDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }


    public void setUserMessageField(String value){
        userMessageField.sendKeys(value);
    }

    public void clickShowMessageButton(){
        showMessageButton.click();
    }

    public String getTextDisplayLabel(){
        return displayLabel.getText();
    }











}

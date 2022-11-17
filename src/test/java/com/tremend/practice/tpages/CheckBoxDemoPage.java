package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckBoxDemoPage extends PageObject {

    @FindBy(id = "isAgeSelected")
    private WebElementFacade checkBoxInput;

    @FindBy(id = "txtAge")
    private WebElementFacade successMessage;

    public void navigateToCheckBoxDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void clickOnCheckBox(){
        checkBoxInput.click();
    }

    public String successMessageText(){
        return successMessage.getText();
    }

}

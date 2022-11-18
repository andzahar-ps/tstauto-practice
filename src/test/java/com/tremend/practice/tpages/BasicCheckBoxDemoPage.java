package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasicCheckBoxDemoPage extends PageObject{

    public void navigateToBasicCheckBoxDemo(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    @FindBy(id = "isAgeSelected")
    private WebElementFacade checkBox;

    @FindBy(id = "txtAge")
    private WebElementFacade successMessage;

    public void clickOnCheckBox(){
        checkBox.click();
    }

    public String displaySuccessMessage(){
        return successMessage.getText();
    }


}

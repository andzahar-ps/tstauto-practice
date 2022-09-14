package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SingleCheckBoxDemoPage extends PageObject {

    @FindBy( id = "isAgeSelected")
    private WebElementFacade isAgeSelectedCheckBox;

    @FindBy( id = "txtAge")
    private WebElementFacade txtAgeMessage;

    public void navigateToCheckBoxDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void selectCheckBox(){
        isAgeSelectedCheckBox.click();
    }

    public String getSuccessMessage() {
        return txtAgeMessage.getText();
    }

}

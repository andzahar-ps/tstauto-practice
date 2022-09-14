package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class CheckboxDemoPage extends PageObject {
    @FindBy(id = "isAgeSelected")
    private WebElementFacade singleCheckbox;

    @FindBy(id = "txtAge")
    private WebElementFacade successMessage;

    public void navigateToCheckboxDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void clickSingleCheckbox(){
        singleCheckbox.click();
    }

    public String getSuccessMessage(){
        return successMessage.getText();
    }
}

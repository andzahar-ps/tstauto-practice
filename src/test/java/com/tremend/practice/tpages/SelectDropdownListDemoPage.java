package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SelectDropdownListDemoPage extends PageObject {

    @FindBy(id = "select-demo")
    private WebElementFacade selectField;

    @FindBy(className = "selected-value")
    private WebElementFacade daySelectedMessage;

    public void navigateToDropdownListDemoPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    public void selectDayDropdownValue( String value ) {
        selectField.selectByValue(value);
    }

    public String getTextSuccessMessage() {
        return daySelectedMessage.getText();
    }
}

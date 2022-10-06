package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SelectDropdownListDemoPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"select-demo\"]/option")
    private List<WebElementFacade> dropDownList;

    @FindBy(className = "selected-value")
    private WebElementFacade daySelectedMessage;

    public void navigateToDropdownListDemoPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    public void selectDropdownList( int index ) {
        dropDownList.get(index).click();
    }

    public String getTextSuccessMessage() {
        return daySelectedMessage.getText();
    }
}

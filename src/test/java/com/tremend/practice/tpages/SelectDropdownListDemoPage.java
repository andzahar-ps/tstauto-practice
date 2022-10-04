package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SelectDropdownListDemoPage extends PageObject {

    @FindBy(id = "select-demo")
    private WebElementFacade openDropdownList;
    @FindBy(xpath = "//*[@id='select-demo']/option")
    private List<WebElementFacade> dropDownList;

    @FindBy(className = "selected-value")
    private WebElementFacade daySelectedMessage;

    public void navigateToDropdownListPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    public void openDropdownList() {
        openDropdownList.click();
    }

    public void selectDropdownListOption(int index) {
        dropDownList.get(index).click();
    }

    public String getTextDisplayDayMessage() {
        return daySelectedMessage.getText();
    }
}

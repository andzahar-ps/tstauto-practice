package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TwoInputFieldsPage extends PageObject {

    @FindBy(id = "sum1")
    private WebElementFacade valueFieldA;

    @FindBy(id = "sum2")
    private WebElementFacade valueFieldB;

    @FindBy(css = "#gettotal > button")
    private WebElementFacade getTotalButton;

    @FindBy(id = "displayvalue")
    private WebElementFacade displayTotalValue;


    public void navigateToSimpleDemoPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }


    public void setValueFieldA(String firstValue) {
        valueFieldA.sendKeys(firstValue);
    }

    public void setValueFieldB(String secondValue) {
        valueFieldB.sendKeys(secondValue);
    }

    public void clickGetTotalButton() {
        getTotalButton.click();
    }

    public String getDisplayTotalValue() {
        return displayTotalValue.getText();
    }
}

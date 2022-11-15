package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class BasicFirstFormDemoPage extends PageObject {

    @FindBy (id = "sum1")
        private WebElementFacade TwoInputField1;

    @FindBy (id = "sum2")
        private WebElementFacade TwoInputFields2;

    @FindBy (css = "#gettotal > button")
        private WebElementFacade GetTotalButton;

    @FindBy (id = "displayvalue")
        private WebElementFacade SumOfTwoValues;

    public void navigateToBasicFirstFormPage(){
        getDriver().navigate().to("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public void setTwoInputField1(String value) {
        TwoInputField1.sendKeys(value);
    }

    public void setTwoInputFields2(String value) {
        TwoInputFields2.sendKeys(value);
    }

    public void clickGetTotalButton() {
        GetTotalButton.click();
    }

    public String getSumOfTwoValues() {
        return SumOfTwoValues.getText();
    }

}

package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TwoInputsSimpleFormDemoPage extends PageObject {

    @FindBy(id = "sum1")
    private WebElementFacade  sum1InputField;

    @FindBy(id = "sum2")
    private WebElementFacade sum2InputField;

    @FindBy(css = "#gettotal > button")
    private WebElementFacade getTotalButton;

    @FindBy(id = "displayvalue")
    private WebElementFacade displayValueLabel;


    public void navigateToSimpleDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }


    public void setSumInputField(String value1, String value2){
        sum1InputField.sendKeys( value1);
        sum2InputField.sendKeys( value2);
    }


    public void clickGetTotalButton(){
        getTotalButton.click();
    }

    public String getTextDisplayValueLabel(){
        return displayValueLabel.getText();
    }

}

package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SimpleFormDemoPage extends PageObject {

    @FindBy(id = "user-message")
    private WebElementFacade userMessageField;

    @FindBy(css = "#get-input > button")
    private WebElementFacade showMessageButton;

    @FindBy(id = "display")
    private WebElementFacade displayLabel;

    ///Two Input

    @FindBy(id = "sum1")
    private WebElementFacade firstNumericField;

    @FindBy(id = "sum2")
    private WebElementFacade secondNumericField;

    @FindBy(css = "#gettotal > button")
    private WebElementFacade showTotalButton;

    @FindBy(id = "displayvalue")
    private WebElementFacade displayTotalValue;


    @FindBy(ngModel = "sda")
    private WebElementFacade cevaCeva;

    public void cevaRapid(){
        cevaCeva.isSelected();

    }


    public void navigateToSimpleDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }


    public void setUserMessageField(String value){
        userMessageField.sendKeys(value);
    }

    public void clickShowMessageButton(){
        showMessageButton.click();
    }

    public String getTextDisplayLabel(){
        return displayLabel.getText();
    }


    public void setFirstNumericField(String aValue){
        firstNumericField.sendKeys(aValue);
    }

    public void setSecondNumericField(String bValue){
        secondNumericField.sendKeys(bValue);
    }

    public void clickShowTotalButton(){
        showTotalButton.click();
    }

    public String getDisplayTotalValue(){
        return displayTotalValue.getText();
    }










}

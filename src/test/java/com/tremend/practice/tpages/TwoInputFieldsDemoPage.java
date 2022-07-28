package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class TwoInputFieldsDemoPage extends PageObject {
    @FindBy(id = "sum1")
    private WebElementFacade firstNumber;

    @FindBy(id = "sum2")
    private WebElementFacade secondNumber;

    @FindBy(css = "#gettotal > button")
    private WebElementFacade showTotalButton;

    @FindBy (id = "displayvalue")
    private WebElementFacade displayTotalValue;

    public void navigateToSimpleDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public void setFirstNumber(String value) {firstNumber.sendKeys(value);}

    public void setSecondNumber(String value) {secondNumber.sendKeys(value);}

    public void clickShowTotalButton(){
        showTotalButton.click();
    }

    public String getDisplayTotalValue(){return displayTotalValue.getText();}

    }


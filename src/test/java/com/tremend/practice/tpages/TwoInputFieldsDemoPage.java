package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class TwoInputFieldsDemoPage extends PageObject {
    @FindBy(id = "sum1")
    private WebElementFacade firstNumericField;

    @FindBy(id = "sum2")
    private WebElementFacade secondNumericField;

    @FindBy(css = "#gettotal > button")
    private WebElementFacade showTotalButton;

    @FindBy (id = "displayvalue")
    private WebElementFacade displayTotalValue;

    public void navigateToSimpleDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public void setFirstNumericField(int a){
        firstNumericField.sendKeys(String.valueOf(a));
    }

    public void setSecondNumericField(int b){
        secondNumericField.sendKeys(String.valueOf(b));
    }

    public void clickShowTotalButton(){
        showTotalButton.click();
    }

    public String getDisplayTotalValue(){
        return displayTotalValue.getText();
    }
}


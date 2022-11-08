package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TestPage1 extends PageObject {

    //Define the webpage elements from The "Two Input Fields"

    @FindBy (id = "sum1")
        private WebElementFacade TwoInputField1;

    @FindBy (id = "sum2")
        private WebElementFacade TwoInputField2;

    @FindBy (css = "#gettotal > button")
        private WebElementFacade GetTotalButton;

    @FindBy (id = "displayvalue")
        private WebElementFacade TwoInputDisplayValue;

    //Open the webpage
    public void navigateToPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    //Create public methods for each webpage element
    public void setTwoInputField1(String value){
        TwoInputField1.sendKeys(value);
    }

    public void setTwoInputField2(String value){
        TwoInputField2.sendKeys(value);
    }

    public void clickGetTotalButton(){GetTotalButton.click();}

    public String getTwoInputDisplayValue(){return TwoInputDisplayValue.getText();}


}

package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckBoxDemoPage extends PageObject {

    @FindBy(id = "isAgeSelected")
    private WebElementFacade checkBoxInput;

    @FindBy(id = "txtAge")
    private WebElementFacade successMessage;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElementFacade checkBoxNo1;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    private WebElementFacade checkBoxNo2;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    private WebElementFacade checkBoxNo3;

    @FindBy(xpath = "(//input[@type='checkbox'])[5]")
    private WebElementFacade checkBoxNo4;

    @FindBy(id = "check1")
    private WebElementFacade checkAllButton;


    public void navigateToCheckBoxDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void clickOnCheckBox(){
        checkBoxInput.click();
    }

    public String successMessageText(){
        return successMessage.getText();
    }

    public void clickOnCheckBoxNo1(){
        checkBoxNo1.click();
    }

    public void clickOnCheckBoxNo2(){
        checkBoxNo2.click();
    }

    public void clickOnCheckBoxNo3(){
        checkBoxNo3.click();
    }

    public void clickOnCheckBoxNo4(){
        checkBoxNo4.click();
    }

    public String buttonMessageText(){
        return checkAllButton.getAttribute("value");
    }

}

package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class BasicRadioButtonDemoPage extends PageObject {

    @FindBy(className = "radio-inline")
    private List<WebElementFacade> radioButtonList;

    @FindBy(id = "buttoncheck")
    private WebElementFacade getCheckedValue;

    @FindBy(className = "radiobutton")
    private WebElementFacade getGenderMessage;

    @FindBy(name = "gender")
    private List<WebElementFacade> genderRadioButtons;

    @FindBy(name = "ageGroup")
    private List<WebElementFacade> ageGroupRadioButtons;

    @FindBy(className = "btn btn-default")
    private WebElementFacade getValuesButton;

    public void navigateToBasicRadioButtonPage(){
        getDriver().navigate().to("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    public void clickMaleButton(){
        radioButtonList.
    }

}

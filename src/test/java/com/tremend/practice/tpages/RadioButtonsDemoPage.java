package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class RadioButtonsDemoPage extends PageObject {
    //Radio Button Demo

    @FindBy(name = "optradio")
    private List<WebElementFacade> radioButton;

    @FindBy(css = "div.panel-body > button")
    private WebElementFacade getCheckedValueButton;

    @FindBy(className = "radiobutton")
    private WebElementFacade getSuccessMessage;

    //Group Radio Buttons Demo elements

    @FindBy(name = "gender")
    private List<WebElementFacade> genderRadioButtons;

    @FindBy(name = "ageGroup")
    private List<WebElementFacade> ageGroupRadioButtons;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")
    private WebElementFacade getValuesButton;

    @FindBy(className = "groupradiobutton")
    private WebElementFacade groupRadioButtonText;

    public void navigateToRadioButtonDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    //Radio Buttons Demo methods
    public void clickMaleRadioButton() {
        radioButton.get(0).click();
    }

    public void clickFemaleRadioButton() {
        radioButton.get(1).click();
    }

    public void clickGetCheckedValueButton() {
        getCheckedValueButton.click();
    }

    public String getTextSuccessMessage(){
        return getSuccessMessage.getText();
    }


    //Group Radio Buttons Demo methods

    public void selectMaleRadioButton(){
        genderRadioButtons.get(0).click();
    }

    public void selectFemaleRadioButton(){
        genderRadioButtons.get(1).click();
    }

    public void selectAgeGroupRadioButtonValue(int index) {
        ageGroupRadioButtons.get(index).click();

    }

    public void clickGetValuesButton() {
        getValuesButton.click();
    }

    public String getSexAndAgeGroupText() {
        return groupRadioButtonText.getText();
    }

}

package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class RadioButtonsDemoPage extends PageObject {

    @FindBy(name = "optradio")
    private List<WebElementFacade> radioButton;

    @FindBy(id = "buttoncheck")
    private WebElementFacade getCheckedValueButton;

    @FindBy(className = "radiobutton")
    private WebElementFacade getGenderMessage;

    @FindBy(name = "gender")
    private List<WebElementFacade> genderRadioButtons;

    @FindBy(name = "ageGroup")
    private List<WebElementFacade> ageGroupRadioButtons;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")
    private WebElementFacade getValuesButton;

    @FindBy(className = "groupradiobutton")
    private WebElementFacade groupRadioButtonText;


    public void navigateToRadioButtonsPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    public void selectAgeRadioButtonValue(int index) {

        radioButton.get(index).click();
    }

//    public void clickOnFemaleRadioButton() {
//
//        radioButton.get(1).click();
//    }

    public void clickGetCheckedValuesButton() {

        getCheckedValueButton.click();
    }

    public String getDisplayGenderMessage() {

        return getGenderMessage.getText();
    }

    // ===== Group Radio Buttons Demo methods

    public void selectMaleRadioButton() {
        genderRadioButtons.get(0).click();
    }

    public void selectFemaleRadioButton() {
        genderRadioButtons.get(1).click();
    }

    public void selectFirstAgeGroupRadioButton() {
        ageGroupRadioButtons.get(0).click();
    }

    public void selectSecondAgeGroupRadioButton() {
        ageGroupRadioButtons.get(1).click();
    }

    public void selectThirdAgeGroupRadioButton() {
        ageGroupRadioButtons.get(2).click();
    }

    public void clickGetValuesButton() {
        getCheckedValueButton.click();
    }

    public String getSexAndAgeGroupText() {
        return groupRadioButtonText.getText();
    }
}




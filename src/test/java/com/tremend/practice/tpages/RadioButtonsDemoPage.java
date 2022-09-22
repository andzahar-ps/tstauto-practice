package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;

import java.util.List;

public class RadioButtonsDemoPage extends PageObject {


    // ====== Radio Button Demo elements

    @FindBy(name = "optradio")
    private List<WebElementFacade> radioButtons;

    @FindBy(id = "buttoncheck")
    private WebElementFacade getCheckedValueButton;

    @FindBy(className = "radiobutton")
    private WebElementFacade valueText;



    // ====== Group Radio Buttons Demo elements

    @FindBy(name = "gender")
    private List<WebElementFacade> genderRadioButtons;

    @FindBy(name = "ageGroup")
    private List<WebElementFacade> ageGroupRadioButtons;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")
    private WebElementFacade getValuesButton;

    @FindBy(className = "groupradiobutton")
    private WebElementFacade groupRadioButtonText;



    // ===== Navigate to the page

    public void navigateToRadioButtonsDemoPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }


    // ===== Radio Button Demo methods

    public void clickMaleRadioButton() {
        radioButtons.get(0).click();
    }

    public void clickFemaleRadioButton() {
        radioButtons.get(1).click();
    }

    public void clickGetCheckedValueButton() {
        getCheckedValueButton.click();
    }

    public String getCheckedValueText() {
        return valueText.getText();
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

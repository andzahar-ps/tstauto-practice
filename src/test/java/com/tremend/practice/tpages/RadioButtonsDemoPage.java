package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RadioButtonsDemoPage extends PageObject {

    //Single Radio Button Demo
    @FindBy(name = "optradio")
    private List<WebElementFacade> radioButtons;

    @FindBy(id = "buttoncheck")
    private WebElementFacade getCheckedValueButton;

    @FindBy(className = "radiobutton")
    private WebElementFacade genderMessage;

    //Group Radio Buttons Demo

    @FindBy(name = "gender")
    private List<WebElementFacade> genderRadioButtons;

    @FindBy(name = "ageGroup")
    private List<WebElementFacade> ageRadioButtons;

    @FindBy(css = "button[onclick='getValues();']")
    private WebElementFacade getValuesButton;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]")
    private WebElementFacade valueRadioButtonsMessage;


    public void navigateToRadioButtonsPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    public void selectSexRadioButton(int index) {
        radioButtons.get(index).click();
    }

    public void clickGetCheckedValue() {
        getCheckedValueButton.click();
    }

    public String getCheckedGender() {
        return genderMessage.getText();

    }

    public void selectGenderRadioButtonsValue(int index) {
        genderRadioButtons.get(index).click();
    }

    public void selectAgeRadioButtonValue(int index) {
        ageRadioButtons.get(index).click();
    }

    public void clickGetValuesButton() {
        getValuesButton.click();
    }

    public String getSexAndAgeGroupText() {
        return valueRadioButtonsMessage.getText();
    }

}

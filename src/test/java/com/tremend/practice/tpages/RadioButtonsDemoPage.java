package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class RadioButtonsDemoPage extends PageObject {

//    @FindBy(className = "radio-inline[1]")
//    private WebElementFacade maleRadioButton;
//
//    @FindBy(className = "radio-inline[2]")
//    private WebElementFacade femaleRadioButton;

    @FindBy(name = "optradio")
    private List<WebElementFacade> radioButton;

    @FindBy(id = "buttoncheck")
    private WebElementFacade getCheckedValueButton;

    @FindBy(className = "radiobutton")
    private WebElementFacade getGenderMessage;

    @FindBy(name = "gender")
    private List<WebElementFacade> genderRadioButtons;

    @FindBy(name = "ageGroup")
    private List<WebElementFacade> ageRadioButtons;

    @FindBy(css = "button[onclick='getValues();']")
    private WebElementFacade getValuesButton;

    @FindBy(css = ".groupradiobutton")
    private WebElementFacade valueRadioButtonsMessage;


    public void navigateToRadioButtonsPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void clickOnMaleRadioButton() {

        radioButton.get(0).click();
    }

    public void clickOnFemaleRadioButton() {

        radioButton.get(1).click();
    }

    public void clickGetCheckedValuesButton() {

        getCheckedValueButton.click();
    }

    public String getDisplayGenderMessage() {

        return getGenderMessage.getText();
    }
}




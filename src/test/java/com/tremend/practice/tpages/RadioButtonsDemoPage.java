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

    @FindBy(css = ".groupradiobutton")
    private WebElementFacade valueRadioButtonsMessage;

    public void navigateToRadioButtonsPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    public void clickMaleRadioButton() {
        radioButtons.get(0).click();
    }

    public void clickFemaleRadioButton() {
        radioButtons.get(1).click();
    }

    public void clickGetCheckedValue() {
        getCheckedValueButton.click();
    }

    public String getCheckedGender() {
        return genderMessage.getText();

    }
}

package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class RadioButtonsDemoPage extends PageObject {
    //Radio Button Demo
    @FindBy(css = "input[value='Male'][name='optradio']")
    private WebElementFacade maleGenderRadiobutton;

    @FindBy(css = "input[value='Female'][name='optradio']")
    private WebElementFacade femaleGenderRadiobutton;

    @FindBy(id = "buttoncheck")
    private WebElementFacade getValueButton;

    @FindBy(className = "radiobutton")
    private WebElementFacade genderMessage;

    public void navigateToRadioButtonsPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    public void clickMaleRadiobutton() {
        maleGenderRadiobutton.click();
    }

    public void clickFemaleRadiobutton() {
        femaleGenderRadiobutton.click();
    }

    public void clickGetCheckedValue(){ getValueButton.click();}

    public String getTextSuccessMessage() {
        return genderMessage.getText();
    }

//    public boolean isSelectedRadioButton(){
//        return genderRadiobutton.isSelected();
//    }

}

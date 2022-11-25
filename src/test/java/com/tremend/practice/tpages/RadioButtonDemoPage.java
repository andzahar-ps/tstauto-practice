package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RadioButtonDemoPage extends PageObject {


    @FindBy(xpath = "(//input[@name='optradio'])[1]")
    private WebElementFacade maleButton;

    @FindBy(xpath = "(//input[@name='optradio'])[2]")
    private WebElementFacade femaleButton;

    @FindBy(xpath = "//button[@id='buttoncheck']")
    private WebElementFacade checkoutButton;

    @FindBy(xpath = "(//p[@class='radiobutton'])[1]")
    private WebElementFacade messageDisplayed;


    public void navigateToRadioButtonDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    public void clickOnRadioButton(String value){
        if ("Male".equals(value)) {
            maleButton.click();
        } else {
            femaleButton.click();
        }
    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }

    public String checkoutMessageText(){
        return messageDisplayed.getTextContent();
    }


}

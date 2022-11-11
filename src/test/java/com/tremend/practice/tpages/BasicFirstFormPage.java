package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasicFirstFormPage extends PageObject {

    @FindBy(xpath = "//*[@id='sum1']")
    private WebElementFacade enterValueFieldA;

    @FindBy(xpath = "//*[@id='sum2']")
    private WebElementFacade enterValueFieldB;

    @FindBy(xpath = "//*[@id='gettotal']/button")
    private WebElementFacade getTotalBtn;

    @FindBy(xpath = "//*[@id='displayvalue']")
    private WebElementFacade totalValueResult;

    @FindBy(xpath = "//*[@id='get-input']/button")
    private WebElementFacade showMessageBtn;

    @FindBy(id = "user-message")
    private WebElementFacade inputField;

    @FindBy(id = "display")
    private WebElementFacade yourMessage;

    public void navigateToBasicFirstFormDemo(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public void enterMessageInputField(String message){
        inputField.sendKeys(message);
    }

    public void clickShowMessageButton(){
        showMessageBtn.click();
    }

    public String displayYourMessage(){
        return yourMessage.getText();
    }

    public void enterValueA(String number){
        enterValueFieldA.sendKeys(number);
    }
    public void enterValueB(String number){
        enterValueFieldB.sendKeys(number);
    }
    public void clickGetTotal(){
        getTotalBtn.click();
    }

    public String getTotalResult(){
       return totalValueResult.getText();
    }

}


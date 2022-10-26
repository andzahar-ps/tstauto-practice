package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class InputFormValidationsPage extends PageObject {

    @FindBy(css = ".btn.btn-default")
    private WebElementFacade sendButton;

    @FindBy(name = "first_name")
    private WebElementFacade firstNameField;

    @FindBy(className = "help-block")
    private List<WebElementFacade> validationMessageList;

    @FindBy(css = ".form-control-feedback.bv-icon-input-group.glyphicon.glyphicon-remove")
    private List<WebElementFacade> validationErrorIconList;

    @FindBy(css = ".form-control-feedback.bv-icon-input-group.glyphicon.glyphicon-ok")
    private List<WebElementFacade> validationOkIconList;



    public void navigateToInputValidationsPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/input-form-demo.html");
    }


    public void clickSendButton(){
        sendButton.click();
    }

    public void setFirstNameField(String value){
        firstNameField.sendKeys(value);
    }

    public String getTextValidationErrorMessage(int index){
        return validationMessageList.get(index).getText();
    }

    public boolean isDisplayedValidationErrorIcon(int index){
        return validationErrorIconList.get(index).isDisplayed();
    }

    public boolean isDisplayedValidationOkIcon(int index){
        return validationOkIconList.get(index).isDisplayed();
    }






}

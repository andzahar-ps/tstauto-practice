package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AjaxFormDemoPage extends PageObject {


    @FindBy(xpath = "//input[@id='title']")
    private WebElementFacade nameField;

    @FindBy(xpath = "//textarea[@id='description']")
    private WebElementFacade comField;

    @FindBy(xpath = "//input[@id='btn-submit']")
    private WebElementFacade submitButton;

    @FindBy(css = "#submit-control")
    private WebElementFacade message;


    public void navigateToAjaxFormDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");
    }


    public void enterName(String name){
        nameField.sendKeys(name);
    }

    public void enterComment(String comment) {
        comField.sendKeys(comment);
    }

    public void submitForm() {
        submitButton.click();
    }

    public String messageText(){
        return message.getTextContent();
    }


}

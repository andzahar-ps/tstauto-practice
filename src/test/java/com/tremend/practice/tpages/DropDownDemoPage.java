package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.support.ui.Select;

public class DropDownDemoPage extends PageObject {

    @FindBy(css = "#select-demo")
    private WebElementFacade dropDownForm;

    @FindBy(xpath = "(//p[@class='selected-value'])[1]")
    private WebElementFacade messageDisplayed;

    public void clickDropDownForm() {
        //cum selectez exact un element din lista ?
        dropDownForm.click();
    }

    public String messageDisplayedText() {
        return messageDisplayed.getTextContent();
    }



}
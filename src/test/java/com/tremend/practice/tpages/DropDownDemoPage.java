package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemoPage extends PageObject {

//    @FindBy(css = "#select-demo")
//    private Select dropDownForm;

    @FindBy(css = ".selected-value")
    private WebElementFacade message;

    public void navigateToDropdownPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    public void clickDropDownForm(String value) {
        Select dropDownForm = new Select(getDriver().findElement(By.id("select-demo")));
        dropDownForm.selectByVisibleText(value);
    }

    public String messageDisplayedText() {
        return message.getTextContent();
    }



}
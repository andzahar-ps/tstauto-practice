package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.mockito.internal.matchers.Find;

public class BasicCheckBoxDemoPage extends PageObject {

    @FindBy(id = "isAgeSelected")
        private WebElementFacade simpleCheckBox;

    @FindBy(id ="txtAge")
        private WebElementFacade successfulMessageIsDisplayed;

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(3) > label > input")
        private WebElementFacade checkBoxOption1;

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(4) > label > input")
        private WebElementFacade checkBoxOption2;

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(5) > label > input")
        private WebElementFacade checkBoxOption3;

    @FindBy(css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(6) > label > input")
        private WebElementFacade checkBoxOption4;

    @FindBy(id = "check1")
        private WebElementFacade checkAllButton;

    @FindBy(id = "isChkd")
        private WebElementFacade uncheckAllButton;

    public void navigateToBasicCheckBoxDemoSteps(){
        getDriver().navigate().to("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void clickSimpleCheckBox(){simpleCheckBox.click();}

    public void getSuccessfulMessageIsDisplayed(){successfulMessageIsDisplayed.getText();}

    public void clickCheckBoxOption1(){checkBoxOption1.click();}

    public void clickCheckBoxOption2(){checkBoxOption2.click();}

    public void clickCheckBoxOption3(){checkBoxOption3.click();}

    public void clickCheckBoxOption4(){checkBoxOption3.click();}

    public void clickCheckAllButton(){checkAllButton.click();}

    public void clickuncheckAllButton(){uncheckAllButton.click();}
}

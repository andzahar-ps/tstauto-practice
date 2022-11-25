package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class BasicCheckBoxDemoPage extends PageObject {

    @FindBy(id = "isAgeSelected")
        private WebElementFacade simpleCheckBox;

    @FindBy(id ="txtAge")
        private WebElementFacade successfulMessageIsDisplayed;

    @FindBy(id = "check1")
        private WebElementFacade checkAllButton;

    @FindBy(className = "cb1-element")
    private List<WebElementFacade> checkboxList;

    public BasicCheckBoxDemoPage(List<WebElementFacade> checkboxList){
        this.checkboxList = checkboxList;  //what is this??
    }

    public boolean isCheckboxSelected(int index){
       return checkboxList.get(index).isSelected();
    }

    public void clickCheckbox(int index){
        checkboxList.get(index).click();
    }

    public void navigateToBasicCheckBoxDemoSteps(){
        getDriver().navigate().to("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void clickSimpleCheckBox(){
        simpleCheckBox.click();
    }

    public String getTextMessage(){
        return successfulMessageIsDisplayed.getText();
    }

    public void clickOnCheckBox(int order){
        checkboxList.get(order).click();
    }

    public boolean isSelectedCheckBox(int order){
        return checkboxList.get(order).isSelected();
    }

    public void clickCheckAllButton(){
        checkAllButton.click();
    }

}

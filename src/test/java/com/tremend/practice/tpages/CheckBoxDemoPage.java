package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CheckBoxDemoPage extends PageObject {

    @FindBy( id = "isAgeSelected")
    private WebElementFacade isAgeSelectedCheckBox;

    @FindBy( id = "txtAge")
    private WebElementFacade txtAgeMessage;

    // Multiple checkbox

    @FindBy(className = "cb1-element[1]")
    private WebElementFacade firstCheckbox;

    @FindBy(className = "cb1-element[2]")
    private WebElementFacade secondCheckbox;

    @FindBy(className = "cb1-element[3]")
    private WebElementFacade thirdCheckbox;

    @FindBy(className = "cb1-element[4]")
    private WebElementFacade forthCheckbox;

    @FindBy(className = "cb1-element")
    private List<WebElementFacade> checkBoxList;

    @FindBy(id = "check1")
    private WebElementFacade allButton;

    public void navigateToCheckBoxDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void selectCheckBox(){
        isAgeSelectedCheckBox.click();
    }

    public String getSuccessMessage() {
        return txtAgeMessage.getText();
    }

    public void clickOnCheckbox(int order) {
        checkBoxList.get(order).click();
    }

    public boolean isSelectedCheckbox(int order){
        return checkBoxList.get(order).isSelected();
    }

    public void clickAllCheckboxesButton() {
        allButton.click();
    }

}

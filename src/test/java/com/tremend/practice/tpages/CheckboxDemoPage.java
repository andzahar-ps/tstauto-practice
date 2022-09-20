package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckboxDemoPage extends PageObject {

    @FindBy(id = "isAgeSelected")
    private WebElementFacade checkbox;

    @FindBy(id = "txtAge")
    private WebElementFacade successMessage;

         // Multiple checkbox

    @FindBy(className= "cb1-element[1]")
    private WebElementFacade firstCheckbox;

    @FindBy(className= "cb1-element[2]")
    private WebElementFacade secondCheckbox;

    @FindBy(className= "cb1-element[2]")
    private WebElementFacade thirdCheckbox;

    @FindBy(className= "cb1-element[4]")
    private WebElementFacade forthCheckbox;

    @FindBy(className = "cb1-element")
    private List<WebElementFacade> checkBoxList;

    @FindBy(id = "check1")
    private WebElementFacade allButton;

    public void navigateToCheckboxDemoPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void clickOnTheCheckbox() {
        checkbox.click();
    }

    public String getTextSuccessMessage() {
        return successMessage.getText();
    }

    public void clickOnCheckbox(int order){
        checkBoxList.get(order).click();
    }

    public boolean isSelectedCheckbox(int order){
        return checkBoxList.get(order).isSelected();
    }

//    public void clickOnTheFirstCheckbox() {
//        checkbox.click();
//    }
//    public void clickOnTheSecondCheckbox() {
//        checkbox.click();
//    }
//    public void clickOnTheThirdCheckbox() {
//        checkbox.click();
//    }
//    public void clickOnTheFourthCheckbox() {
//        checkbox.click();
//    }
    public void clickAllCheckboxesButton() {
    allButton.click();
     }
}
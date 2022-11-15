package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckBoxDemoPage extends PageObject {
    @FindBy (id = "isAgeSelected")
    private WebElementFacade ageSelectionCheckBox;

    @FindBy (id = "txtAge")
    private WebElementFacade ageCheckBox;

    @FindBy (css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(3) > label > input")
    private WebElementFacade firstCheckBox;

    @FindBy (css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(4) > label > input")
    private WebElementFacade secondCheckBox;

    @FindBy (css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(5) > label > input")
    private WebElementFacade thirdCheckBox;

    @FindBy (css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(6) > label > input")
    private WebElementFacade fourthCheckBox;

    @FindBy (id = "check1")
    private WebElementFacade checkAllButton;

    @FindBy (id = "isChkd")
    private WebElementFacade uncheckAllHiddenButton;


    public void navigateToCheckBoxDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void clickAgeSelectionCheckBox(){ageSelectionCheckBox.click();}

    public boolean isCheckBoxSelected(){
        return ageSelectionCheckBox.isSelected();
    }

    public String getTextAgeCheckBox(){return ageCheckBox.getText();}

    public void clickFirstCheckBox(){firstCheckBox.click();}

    public void clickSecondCheckBox(){secondCheckBox.click();}

    public void clickThirdCheckbox(){thirdCheckBox.click();}

    public void clickFourthCheckBox(){fourthCheckBox.click();}

    public void clickCheckAllButton(){checkAllButton.click();}

    public void clickUncheckAllHiddenButton(){uncheckAllHiddenButton.click();}

}

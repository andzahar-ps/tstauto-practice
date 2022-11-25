package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CheckboxDemoPage extends PageObject {

    //Adding the webpage elements that will be used in the following tests:
    @FindBy (id = "isAgeSelected")
    private WebElementFacade ageSelectionCheckbox;

    @FindBy (id = "txtAge")
    private WebElementFacade ageCheckbox;

    @FindBy (className = "cb1-element")
    private List<WebElementFacade> checkboxList;

    @FindBy (id = "check1")
    private WebElementFacade checkAllButton;



    // Creating methods for each webpage element:

    public void navigateToCheckboxDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    //First checkbox menu
    public void clickAgeSelectionCheckbox(){ageSelectionCheckbox.click();}

    public boolean isCheckboxSelected(){
        return ageSelectionCheckbox.isSelected();
    }

    public String getTextAgeCheckbox(){return ageCheckbox.getText();}


    //Second checkbox menu
    public void clickCheckboxList(int index){
        checkboxList.get(index).click();
    }

    public boolean isCheckboxListSelected(int index){
        return checkboxList.get(index).isSelected();
    }

    public void clickCheckAllButton(){
        checkAllButton.click();
    }

}

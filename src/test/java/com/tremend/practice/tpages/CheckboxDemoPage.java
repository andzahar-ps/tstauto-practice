package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CheckboxDemoPage extends PageObject {

    //Single checkbox

    @FindBy(id = "isAgeSelected")
    private WebElementFacade singleCheckbox;

    @FindBy(id = "txtAge")
    private WebElementFacade successMessage;

    //Multiple checkboxes

    @FindBy(className = "cb1-element")
    private List<WebElementFacade> checkboxList;

    @FindBy(id = "check1")
    private WebElementFacade allButton;

    public void navigateToCheckboxDemoPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void clickSingleCheckbox() {
        singleCheckbox.click();
    }

    public String getTextSuccessMessage() {
        return successMessage.getText();
    }

    public void clickOnCheckbox(int order){
        checkboxList.get(order).click();
    }

    public boolean isSelectedCheckbox(int order){
        return checkboxList.get(order).isSelected();
    }

    public void clickAllCheckboxButton(){
        allButton.click();
    }
}

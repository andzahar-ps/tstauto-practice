package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MultipleCheckboxDemoPage extends PageObject {

    @FindBy(id = "check1")
    private WebElementFacade checkAllButton;



    public void main(String args[]) {
        List<WebElementFacade> myList = getDriver().findElements(By.className("cb1-element"));
        String[] myArray = new String[myList.size()];
        myList.toArray(myArray);
    }





    @FindBy(className = "'cb1-element'[1]")
    private WebElementFacade firstCheckbox;

    @FindBy(className = "'cb1-element'[2]")
    private WebElementFacade secondCheckbox;

    @FindBy(className = "'cb1-element'[3]")
    private WebElementFacade thirdCheckbox;

    @FindBy(className = "'cb1-element'[4]")
    private WebElementFacade fourthCheckbox;


    public void navigateToCheckboxDemoPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }


    public void clickCheckAllButton() {
        checkAllButton.click();
    }

    public boolean checkFirstCheckbox() {
        return firstCheckbox.isSelected();
    }

    public boolean checkSecondCheckbox() {
        return secondCheckbox.isSelected();
    }

    public boolean checkThirdCheckbox() {
        return thirdCheckbox.isSelected();
    }

    public boolean checkFourthCheckbox() {
        return fourthCheckbox.isSelected();
    }
}

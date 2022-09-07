package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SingleCheckboxDemoPage extends PageObject {

    @FindBy(id = "isAgeSelected")
    private WebElementFacade ageCheckbox;

    @FindBy(id = "txtAge")
    private WebElementFacade successMessage;



    public void navigateToCheckboxDemoPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }



    public void selectCheckbox() {
        ageCheckbox.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }

}

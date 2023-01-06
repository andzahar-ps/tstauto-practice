package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InputFormDemoPage extends PageObject {
    private static final String VALID_FIRST_NAME = "Sorina";
    private static final String VALID_LAST_NAME = "Oancea";

    @FindBy(css = "[name=first_name]")
    WebElementFacade firstNameInput;

    @FindBy(css = "[name=last_name]")
    WebElementFacade lastNameInput;

    @FindBy(css = "[data-bv-icon-for=\"first_name\"]")
    WebElementFacade firstNameIcon;

    @FindBy(css = "[data-bv-icon-for=\"last_name\"]")
    WebElementFacade lastNameIcon;

    public void navigate_to_input_form_page() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/input-form-demo.html");
    }

    public void complete_valid_first_name() {
        firstNameInput.sendKeys(VALID_FIRST_NAME);
        lastNameInput.click();
    }

    public boolean icon_is_valid() {
        return firstNameIcon.getAttribute("class").contains("icon-ok");
    }

    public void complete_valid_last_name() {
        lastNameInput.sendKeys(VALID_LAST_NAME);
        firstNameInput.click();
    }

    public boolean last_name_icon_is_valid() {
        return lastNameIcon.getAttribute("class").contains("icon-ok");
    }
}

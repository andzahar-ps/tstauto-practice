package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SubscribeModalPage extends PageObject {

    @FindBy(id = "at-cv-lightbox-close")
    private WebElementFacade closeButton;

    public void clickCloseButton() {
        closeButton.click();
    }
}


package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SubscribeModalPage extends PageObject {

    @FindBy(id = "at-cv-lightbox-close")
    private WebElementFacade closeButton;

    public void clickCloseButton(){
        closeButton.click();
    }
}

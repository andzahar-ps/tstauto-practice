package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MultipleCheckBoxDemoPage extends PageObject {

    @FindBy(className = "cb1-element")
    private WebElementFacade cb1Checkbox;


}

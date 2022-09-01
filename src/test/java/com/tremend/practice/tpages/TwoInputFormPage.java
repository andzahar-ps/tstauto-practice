package com.tremend.practice.tpages;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TwoInputFormPage extends PageObject {

    @FindBy(id = "sum1")
    private WebElementFacade FirstNumericField;

    @FindBy(id = "sum2")
    private WebElementFacade SecondNumericField;

    @FindBy(css = "#gettotal > button")
    private WebElementFacade GetTotalButton;

    @FindBy (id = "displayvalue")
    private WebElementFacade displaySum;

    public void navigateToSimpleDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public void setSumInputFields(String value1, String value2){
        FirstNumericField.sendKeys( value1);
        SecondNumericField.sendKeys( value2);
    }


    public void clickGetTotalButton(){
        GetTotalButton.click();
    }

    public String getTextDisplayValueLabel(){
        return displaySum.getText();
    }
}


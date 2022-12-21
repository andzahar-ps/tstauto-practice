package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AjaxFormSubmitPage extends PageObject {

    @FindBy(id = "title")
    private WebElementFacade titleField;

    @FindBy(id = "description")
    private WebElementFacade descriptionField;

    @FindBy(id = "btn-submit")
    private WebElementFacade submitButton;

//    @FindBy(xpath = "//*[contains(text(),'Ajax Request is Processing')]")
//    private WebElementFacade ajaxLoadingMessage;

    @FindBy(xpath = "//div[@id='submit-control']")
    private WebElementFacade successMessage;

    @FindBy(css = "img[src*='LoaderIcon']")
    private WebElementFacade loadingSpinner;

    //*[contains(text(),'LoaderIcon')]

    //div[@id='submit-control' and text()='Ajax Request is Processing!']
    public void navigateToAjaxFormSubmitPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");
    }

    public void setTitleField(String value) {
        titleField.sendKeys(value);
    }

    public void setDescriptionField(String value) {
        descriptionField.sendKeys(value);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    //    public void getPageSource(){
//        System.out.println(getDriver().getPageSource());
//    }

    public void waitForTheAjaxMessageToDisappear(String text) {
        waitForCondition().until(
                ExpectedConditions.invisibilityOf(getWebElementFromText(text)));
//                ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(text(),'Ajax Request is Processing')]")));
    }

    public void waitForTheLoadingSpinnerToDisappear() {
        waitForCondition().until(
                ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("img[src*='LoaderIcon']")));
    }

    public String getTextSuccessfulMessage() {
        return successMessage.getText();
    }

    public WebElement getWebElementFromText (String text){
        WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'"+ text + "')]"));
        return element;
    }


//    public String isDisplayedLoadingSpinner() {
//        return loadingSpinner.getAttribute("src");
//    }
}

//waitFor(ExpectedConditions.visibilityOfElementLocated(
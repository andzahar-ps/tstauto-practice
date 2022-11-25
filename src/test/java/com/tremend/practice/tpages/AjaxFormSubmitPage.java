package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AjaxFormSubmitPage extends PageObject {

    @FindBy(id = "title")
    private WebElementFacade nameField;

    @FindBy(id = "description")
    private WebElementFacade commentField;

    @FindBy(id = "btn-submit")
    private WebElementFacade submitButton;

    @FindBy(id = "submit-control")
    private WebElementFacade loadingSpinner;

    @FindBy(xpath = "//div[@id='submit-control' and text()='Ajax Request is Processing!']")
    private WebElementFacade loadingAjaxMessage;

    @FindBy(xpath = "//div[@id='submit-control']")
    private WebElementFacade successMessage;

    public void navigateToAjaxFormSubmitPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");
    }

    public void setNameField(String value) {
        nameField.sendKeys(value);
    }

    public void setCommentField(String value) {
        commentField.sendKeys(value);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void waitForAjaxMessageToDisappear() {
        waitForCondition().until(
                ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='submit-control' and text()='Ajax Request is Processing!']")));
                //ExpectedConditions.invisibilityOf(loadingAjaxMessage));

    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }

}


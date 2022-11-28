package com.tremend.practice.tpages;

import io.appium.java_client.functions.ExpectedCondition;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


public class AjaxFormSubmitPage extends PageObject {

    @FindBy(id = "title")
    private WebElementFacade nameInput;

    @FindBy(id = "description")
    private WebElementFacade commentInput;

    @FindBy(id = "btn-submit")
    private WebElementFacade submitButton;

    @FindBy(xpath = "//div[@id='submit-control' and text()='Ajax Request is Processing!']")
    private WebElementFacade ajaxMessage;

    @FindBy(xpath = "//div[@id='submit-control']")
    private WebElementFacade successMessage;



    public void navigateToAjaxFormSubmitPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");
    }

    public void setNameInput(String value) {
        nameInput.sendKeys(value);
    }

    public void setCommentInput(String value) {
        commentInput.sendKeys(value);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void waitForAjaxMessageToDisappear() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='submit-control' and text()='Ajax Request is Processing!']")));

    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}

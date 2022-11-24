package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AjaxFormSubmitPage extends PageObject {

    // ========= Ajax Form Submit elements

    @FindBy(id = "title")
    private WebElementFacade nameFieldInput;

    @FindBy(id = "description")
    private WebElementFacade commentFieldInput;

    @FindBy(id = "btn-submit")
    private WebElementFacade submitButton;

    @FindBy(xpath = "//*[@id='frm']//div[@id='submit-control' and contains(text(), ' Ajax Request is Processing!')]")
    private WebElementFacade ajaxMessage;

    @FindBy(xpath = "//div[@id='submit-control']")
    private WebElementFacade successfulMessage;

    @FindBy(xpath = "//*[text()='Form submited Successfully!']")
    private WebElementFacade haiInRasaMatii;




    // ========= Navigate to the page

    public void navigateToAjaxFormSubmitPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");
    }




    // ========= Ajax Form Submit methods

    public void setNameField(String input) {
        nameFieldInput.sendKeys(input);
    }

    public void setCommentField(String input) {
        commentFieldInput.sendKeys(input);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void waitForAjaxMessageToDisappear() {
        waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Form submited Successfully!']")));
    }

    public String getTextSuccessfulMessage() {
        return successfulMessage.getText();
    }




}

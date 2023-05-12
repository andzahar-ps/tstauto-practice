package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class UserLoginSportVisionPage extends PageObject {

    // === SportVision Login elements

    @FindBy(xpath = "//a[@title='Intră în cont']")
    private WebElementFacade loginButtonHomepage;

    @FindBy(id = "login_email")
    private WebElementFacade userNameField;

    @FindBy(id = "login_password")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//button[@type='submit']/span[contains(text(), 'Log in')]")
    private WebElementFacade loginButtonLoginModal;

    @FindBy(xpath = "//li[@class='item item-username']//span")
    private WebElementFacade nameOfLoggedUser;


    // === Navigate to the page

    public void navigateToSportVisionHomepage() {
        getDriver().navigate().to("https://www.sportvision.ro/");
    }


    // SportVision Login methods

    public void clickOnLoginButton() {
        loginButtonHomepage.waitUntilEnabled();
        loginButtonHomepage.click();
    }

    public void setValueUserNameField(String username) {
        userNameField.sendKeys(username);
    }

    public void setValuePasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButtonLoginPage() {
        loginButtonLoginModal.click();
    }

    public String getLoggedUserName() {
        return nameOfLoggedUser.getText();
    }
}

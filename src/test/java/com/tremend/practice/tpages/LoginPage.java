package com.tremend.practice.tpages;

import com.tremend.practice.util.Wrapper;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("page:login.url")
public class LoginPage extends PageObject {
    public LoginPage(WebDriver driver) { super(driver); }

    @FindBy(css = "#iframe > iframe")
    private WebElementFacade iFrame;
    @FindBy(id = "sign-in")
    private WebElementFacade signInButton;
    @FindBy(name = "_58_login")
    private WebElementFacade usernameField;
    @FindBy(name = "_58_password")
    private WebElementFacade passwordField;
    @FindBy(css = "input[type='Submit']")
    private WebElementFacade loginButton;
    @FindBy(css = "[class='portlet-msg-error']")
    private WebElementFacade errorMessage;
    @FindBy(css = "[class='user-fullname']")
    private WebElementFacade loginPageElement;
    @FindBy(css = "[class='sm-icon-tasks']")
    private WebElementFacade changePasswordTab;
    @FindBy(css = "[class='alert alert-info margin-0']")
    private WebElementFacade changePasswordPageElement;

    public void clickOnSignIn() { Wrapper.click(signInButton); }

    private void switchToIFrame() {
        getDriver().switchTo().frame(iFrame);
    }

    private void setUsername(String username){
        Wrapper.setInputField(usernameField, username);
    }
    private void setPassword(String password){
        Wrapper.setInputField(passwordField, password);
    }
    private void clickLoginButton(){
        Wrapper.click(loginButton);
    }

    public String getTextLoginErrorMessage(){
        return errorMessage.getText();
    }

    public String getSuccessLoginMessage(){
        waitFor(loginPageElement);
        return loginPageElement.getText();
    }


    public void loginWithUsernameAndPassword(String username, String password){
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }






}

package com.tremend.practice.steps;

import com.tremend.practice.tpages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {

    private LoginPage loginPage;

    @Step
    public void navigate_to_login_page(){
        loginPage.open();
    }

    @Step
    public void login_with_username_and_password(String username, String password){
        loginPage.loginWithUsernameAndPassword(username, password);
    }

    @Step
    public void assert_login_error_message(String errorMessage){
        assertThat( loginPage.getTextLoginErrorMessage() ).as("Failed login error message is different : ").contains(errorMessage);
    }

    @Step
    public void assert_login_message(String errorMessage){
        assertThat( loginPage.getSuccessLoginMessage() ).as("Login success message is different : ").contains(errorMessage);
    }



}

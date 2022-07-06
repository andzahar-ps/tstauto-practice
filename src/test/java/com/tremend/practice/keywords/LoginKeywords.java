package com.tremend.practice.keywords;

import com.tremend.practice.steps.LoginSteps;
import com.tremend.practice.util.constants.framework.TestConstant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginKeywords {

    @Steps
    private LoginSteps loginSteps;


    // ========== GIVEN Keywords

    @Given("that the user's browser is opened on the login page")
    public void open_browser_at_login_page() {
        loginSteps.navigate_to_login_page();
    }

    // ========== WHEN Keywords



    @When("the user logs in with invalid credentials")
    public void log_in_user_with_invalid_credentials() {
        loginSteps.login_with_username_and_password("invalid-username", "invalid-password");
    }


    // ========== THEN Keywords


}



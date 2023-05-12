package com.tremend.practice.steps;

import com.tremend.practice.tpages.UserLoginSportVisionPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;


public class UserLoginSportVisionSteps {

    private UserLoginSportVisionPage userLoginSportVisionPage;


    // === Navigate to the page

    @Step
    public void navigate_to_sportvision_homepage() {
        userLoginSportVisionPage.navigateToSportVisionHomepage();
    }


    // === Scenarios Steps

    @Step
    public void the_user_clicks_on_login_button() {
        userLoginSportVisionPage.clickOnLoginButton();
    }

    @Step
    public void the_user_sets_value_username_field(String username) {
        userLoginSportVisionPage.setValueUserNameField(username);
    }

    @Step
    public void the_user_sets_value_password_field(String password) {
        userLoginSportVisionPage.setValuePasswordField(password);
    }

    @Step
    public void the_user_clicks_on_login_button_login_page() {
        userLoginSportVisionPage.clickOnLoginButtonLoginPage();
    }

    @Step
    public void assert_logged_user_name_is_displayed(String loggedInName) {
        assertThat(userLoginSportVisionPage.getLoggedUserName()).as("The name of the logged in user is: ").isEqualTo(loggedInName);
    }
}

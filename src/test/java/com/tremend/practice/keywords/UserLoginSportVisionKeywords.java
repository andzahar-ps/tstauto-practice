package com.tremend.practice.keywords;

import com.tremend.practice.steps.UserLoginSportVisionSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserLoginSportVisionKeywords {

    @Steps
    private UserLoginSportVisionSteps userLoginSportVisionSteps;



    @Given("the user is on the SportVision Homepage")
    public void theUserIsOnTheSportVisionHomepage() {
        userLoginSportVisionSteps.navigate_to_sportvision_homepage();
    }

    @And("the user clicks on the Login button from the Homepage")
    public void theUserClicksOnTheLoginButtonFromTheHomepage() {
        userLoginSportVisionSteps.the_user_clicks_on_login_button();
    }

    @When("the user fills in both of the credentials fields")
    public void theUserFillsInBothOfTheCredentialsFields() {
        userLoginSportVisionSteps.the_user_sets_value_username_field("ibogdan.poenar@gmail.com");
        userLoginSportVisionSteps.the_user_sets_value_password_field("Parola123");
    }

    @And("the user clicks on the Login button from the Login Page")
    public void theUserClicksOnTheLoginButtonFromTheLoginPage() {
        userLoginSportVisionSteps.the_user_clicks_on_login_button_login_page();
    }

    @Then("the user is able to see the name of my account")
    public void theUserIsAbleToSeeTheGreetingMessage() {
        userLoginSportVisionSteps.assert_logged_user_name_is_displayed("Poenar Ionut-Bogdan");
    }
}

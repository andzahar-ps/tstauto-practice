package com.tremend.practice.keywords;

import com.tremend.practice.steps.SearchAndAddToCartSportVisionSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchAndAddToCartSportVisionKeywords {

    @Steps
    private SearchAndAddToCartSportVisionSteps searchAndAddToCartSportVisionSteps;


//    @Given("the user is on the SportVision Homepage test")
//    public void theUserIsOnTheSportVisionHomepage() {
//        searchAndAddToCartSportVisionSteps.navigate_to_sportvision_homepage();
//    }
//
//    @And("the user clicks on the Login button from the Homepage test")
//    public void theUserClicksOnTheLoginButtonFromTheHomepage() {
//        searchAndAddToCartSportVisionSteps.the_user_clicks_on_login_button();
//    }
//
//    @And("the user fills in both of the credentials fields test")
//    public void theUserFillsInBothOfTheCredentialsFields() {
//        searchAndAddToCartSportVisionSteps.the_user_sets_value_username_field("ibogdan.poenar@gmail.com");
//        searchAndAddToCartSportVisionSteps.the_user_sets_value_password_field("Parola123");
//    }
//
//    @And("the user clicks on the Login button from the Login Page test")
//    public void theUserClicksOnTheLoginButtonFromTheLoginPage() {
//        searchAndAddToCartSportVisionSteps.the_user_clicks_on_login_button_login_page();
//    }


    @When("the user goes to the search results page of the desired brand")
    public void theUserGoesToTheSearchResultsPageOfTheDesiredBrand() {
        searchAndAddToCartSportVisionSteps.the_user_fills_in_search_field_keyword("Jordan");
        searchAndAddToCartSportVisionSteps.the_user_clicks_on_show_all_results_button();
        searchAndAddToCartSportVisionSteps.assert_searched_keyword_is_displayed("cuvant sau fraza: Jordan");
    }

    @And("the user adds the desired product to the cart")
    public void theUserAddsTheDesiredProductToTheCart() {
        searchAndAddToCartSportVisionSteps.the_user_clicks_on_desired_product();
//        searchAndAddToCartSportVisionSteps.assert_the_cart_icon_displays_correct_value("0");
        searchAndAddToCartSportVisionSteps.the_user_clicks_on_add_to_cart_button();
    }

    @Then("the user is able to see the cart icon value being changed")
    public void theUserIsAbleToSeeTheCartIconValueBeingChanged() {
        searchAndAddToCartSportVisionSteps.assert_the_cart_icon_displays_correct_value("1");
    }
}

package com.tremend.practice.steps;

import com.tremend.practice.tpages.SearchAndAddToCartSportVisionPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchAndAddToCartSportVisionSteps {

    private SearchAndAddToCartSportVisionPage searchAndAddToCartSportVisionPage;


    // Navigate to the page

    @Step
    public void navigate_to_sportvision_homepage() {
        searchAndAddToCartSportVisionPage.navigateToSportVisionHomepage();
    }



    // === Search and Add to Cart steps

    @Step
    public void the_user_fills_in_search_field_keyword(String keyword) {
        searchAndAddToCartSportVisionPage.setSearchInput(keyword);
    }

    @Step
    public void the_user_clicks_on_show_all_results_button() {
        searchAndAddToCartSportVisionPage.clickOnShowAllResultsButton();
    }

    @Step
    public void assert_searched_keyword_is_displayed(String searchedKeyword) {
        assertThat(searchAndAddToCartSportVisionPage.getSearchedKeyword()).as("The searched keyword is: ").isEqualTo(searchedKeyword);
    }

    @Step
    public void the_user_clicks_on_desired_product() {
        searchAndAddToCartSportVisionPage.clickOnDesiredProduct();
    }

    @Step
    public void the_user_clicks_on_add_to_cart_button() {
        searchAndAddToCartSportVisionPage.clickOnAddToCartButton();
    }

    @Step
    public void assert_the_cart_icon_displays_correct_value(String addedProductsNumber) {
        assertThat(searchAndAddToCartSportVisionPage.getValueOfAddedProducts()).as("The number of added products is: ").isEqualTo(addedProductsNumber);
    }
}

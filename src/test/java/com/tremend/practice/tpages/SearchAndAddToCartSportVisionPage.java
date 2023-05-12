package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchAndAddToCartSportVisionPage extends PageObject {


    // === SportVision Login elements

//    @FindBy(xpath = "//a[@title='Intră în cont']")
//    private WebElementFacade loginButtonHomepage;
//
//    @FindBy(id = "login_email")
//    private WebElementFacade userNameField;
//
//    @FindBy(id = "login_password")
//    private WebElementFacade passwordField;
//
//    @FindBy(xpath = "//button[@type='submit']/span[contains(text(), 'Log in')]")
//    private WebElementFacade loginButtonLoginModal;




    // === SportVision Search and Add to cart elements


    @FindBy(id = "search-text")
    private WebElementFacade searchFieldHomepage;

    @FindBy(xpath = "//span[@class='title']")
    private WebElementFacade labelSearchField;

    @FindBy(xpath = "//a[contains(text(), 'Arata toate rezultatele')]")
    private WebElementFacade showAllResultsButton;

    @FindBy(xpath = "//div[@class='text']")
    private WebElementFacade searchedKeyword;

    @FindBy(xpath = "//div[@data-productname='JR NIKE Minge Jordan Essentials ']//div[@class='img-wrapper']/a")
    private WebElementFacade productToAddToCart;

    @FindBy(id = "nb_addToCartButton")
    private WebElementFacade addToCartButton;

    @FindBy(xpath = "//div[@id='miniCartContent']//div[contains(@class, 'total')]")
    private WebElementFacade cartIconValue;



    // === Navigate to the page

    public void navigateToSportVisionHomepage() {
        getDriver().navigate().to("https://www.sportvision.ro/");
    }



    // SportVision Login methods

//    public void clickOnLoginButton() {
//        loginButtonHomepage.waitUntilEnabled();
//        loginButtonHomepage.click();
//    }
//
//    public void setValueUserNameField(String username) {
//        userNameField.sendKeys(username);
//    }
//
//    public void setValuePasswordField(String password) {
//        passwordField.sendKeys(password);
//    }
//
//    public void clickOnLoginButtonLoginPage() {
//        loginButtonLoginModal.click();
//    }



    // SportVision Search and Add to cart methods

    public void setSearchInput(String keyword) {
        labelSearchField.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(searchFieldHomepage));
        searchFieldHomepage.sendKeys(keyword);
    }

    public void clickOnShowAllResultsButton() {
        showAllResultsButton.click();
    }

    public String getSearchedKeyword() {
        return searchedKeyword.getText();
    }

    public void clickOnDesiredProduct() {
        productToAddToCart.click();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
        waitForCondition().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='title' and contains(text(), 'Ai')]")));
        waitForCondition().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='title' and contains(text(), 'Ai')]")));
    }

    public String getValueOfAddedProducts() {
//        waitForCondition().until(ExpectedConditions.stalenessOf(cartIconValue));
//        waitForCondition().until(ExpectedConditions.visibilityOf(By.xpath(cartIconValue))
//        cartIconValue = getDriver().findElement(By.xpath("//div[@id='miniCartContent']//div[@class='header-carthor-total']"))
        return cartIconValue.getText();
    }




}

package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class InputFormSubmitPage extends PageObject {

    //Adding the webpage elements:

    @FindBy (name = "first_name")
    private WebElementFacade firstNameField;

    @FindBy (css = "#contact_form > fieldset > div:nth-child(2) > div > small:nth-child(3)")
    private WebElementFacade firstNameErrorMessage;

    @FindBy (name ="last_name")
    private WebElementFacade lastNameField;

    @FindBy (name = "email")
    private WebElementFacade emailField;

    @FindBy (name = "phone")
    private WebElementFacade phoneField;

    @FindBy (name = "address")
    private WebElementFacade addressField;

    @FindBy (name = "city")
    private WebElementFacade cityField;

    @FindBy (name = "state")
    private List<WebElementFacade> stateDropdownList;

    @FindBy (name = "zip")
    private WebElementFacade zipCodeField;

    @FindBy (css = "#contact_form > fieldset > div:nth-child(9) > div > small:nth-child(3)")
    private WebElementFacade zipCodeErrorMessage;

    @FindBy (name = "website")
    private WebElementFacade websiteField;

    @FindBy (name = "hosting")
    private List<WebElementFacade> hostingRadioButtons;

    @FindBy (name = "comment")
    private WebElementFacade projectDescriptionField;

    @FindBy (css = "#contact_form > fieldset > div:nth-child(14) > div > button")
    private WebElementFacade sendButton;


    //Creating the methods for each webpage element:

    //Navigate to the webpage:
    public void navigateToInputFormSubmitPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/input-form-demo.html");
    }

    //Input Form fields:

    public void setFirstNameField(String value){
        firstNameField.sendKeys(value);
    }

    public void setLastNameField(String value){ lastNameField.sendKeys(value);}

    public void setEmailField(String value){ emailField.sendKeys(value);}

    public void setPhoneField(String value){ phoneField.sendKeys(value);}

    public void setAddressField(String value){ addressField.sendKeys(value);}

    public void setCityField(String value){ cityField.sendKeys(value);}

    public int getStateDropdownListSize(){
        return stateDropdownList.size();
    }

    int intRandom;

    public void setStateDropdownList(){

        Random randomIndex = new Random();

        int randomListIndex = getStateDropdownListSize();
        //generate random values from 0 to the amount of elements that we have in our list
        int intRandom = randomIndex.nextInt(randomListIndex);


        Actions actions = new Actions(getDriver());
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(stateDropdownList.get(intRandom))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
    }

    /*public void setZipCodeField(int zipCode){
        zipCodeField.sendKeys(String.valueOf(zipCode));
    }
    */
    public void setZipCodeField(String value){
        zipCodeField.sendKeys(value);
    }

    public void selectHostingChoice(int index){
        hostingRadioButtons.get(index).click();
    }

    public void clickSendButton(){
        sendButton.click();
    }



}

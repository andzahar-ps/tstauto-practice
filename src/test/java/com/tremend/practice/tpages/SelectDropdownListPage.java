package com.tremend.practice.tpages;

import com.tremend.practice.util.constants.framework.SessionVars;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SelectDropdownListPage extends PageObject {


    // ======== Select List Demo Elements

    @FindBy(id = "select-demo")
    private WebElementFacade selectField;

    @FindBy(xpath = "//*[@id='select-demo']/option")
    private List<WebElementFacade> dropdownList;

    @FindBy(className = "selected-value")
    private WebElementFacade textMessage;



    // ======== Multi Select List Demo Elements

    @FindBy(id = "multi-select")
    private WebElementFacade multiSelectField;

    @FindBy(xpath = "//*[@id='multi-select']/option")
    private List<WebElementFacade> multiSelectOptions;

    @FindBy(id = "printMe")
    private WebElementFacade firstSelectedButton;

    @FindBy(id = "printAll")
    private WebElementFacade getAllSelectedButton;

    @FindBy(className = "getall-selected")
    private WebElementFacade countriesDisplayMessage;







    // ======== Navigate to the page

    public void navigateToSelectDropdownListPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }





    // ================ SELECT LIST DEMO SCENARIOS


    // First Scenario Methods

    public void clickSelectField() {
        selectField.click();
    }

    public void selectOptionFromDropdownList(int index) {
        dropdownList.get(index).click();
    }

    public String getTextFromTextMessage() {
        return textMessage.getText();
    }



    // Second Scenario Methods

    public void selectFirstOptionFromDropdown() {
        dropdownList.get(0).isDisabled();
    }



    // Third Scenario Methods

    public String getPlaceholderFromSelectField() {
        return selectField.getValue();
    }








    // ================ MULTI SELECT LIST DEMO SCENARIOS


    public int getCountryListSize(){
        return multiSelectOptions.size();
    }

    public void clickMultipleOptions() {

        List<Integer> randIntegers = new Random().ints(0, getCountryListSize() ).distinct().limit(getCountryListSize() -1).boxed().collect(Collectors.toList());

        int firstRandomNumber = randIntegers.get(0);
        int secondRandomNumber = randIntegers.get(1);
        int thirdRandomNumber = randIntegers.get(2);


        Serenity.setSessionVariable(SessionVars.DROP_DOWN_FIRST_RANDOM_NUMBER).to(firstRandomNumber);
        Serenity.setSessionVariable(SessionVars.DROP_DOWN_SECOND_RANDOM_NUMBER).to(secondRandomNumber);
        Serenity.setSessionVariable(SessionVars.DROP_DOWN_THIRD_RANDOM_NUMBER).to(thirdRandomNumber);


        Actions actions = new Actions(getDriver());
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(multiSelectOptions.get(firstRandomNumber))
                .click(multiSelectOptions.get(secondRandomNumber))
                .click(multiSelectOptions.get(thirdRandomNumber))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
        System.out.println(3);
    }

    public String getTextCountryOptionByIndex(int index) {
        return multiSelectOptions.get(index).getValue();
    }

    public void clickFirstSelectedButton() {
        firstSelectedButton.click();
    }

    public String getTextDisplayedCountries() {
        return countriesDisplayMessage.getText();
    }



    // Second Scenario Methods

    public void clickGetAllButton() {
        getAllSelectedButton.click();
    }

//    public String[] theStringValuesOfTheRandomNumbers() {
//        String[] theString = new String[3];
//
//        theString[0] = multiSelectOptions.get(firstRandomNumber).getValue();
//        theString[1] = multiSelectOptions.get(secondRandomNumber).getValue();
//        theString[2] = multiSelectOptions.get(thirdRandomNumber).getValue();
//
//        return theString;
//
//    }



    //////






















































}

package com.tremend.practice.tpages;

import io.cucumber.java.an.E;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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
    private WebElementFacade assertMessage;







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


    // First Scenario Methods

    int firstRandomNumber;
    int secondRandomNumber;
    int thirdRandomNumber;


    public void clickMultipleOptions() {

        List<Integer> indexesList = new ArrayList<Integer>();
        indexesList.add(0);
        indexesList.add(1);
        indexesList.add(2);
        indexesList.add(3);
        indexesList.add(4);
        indexesList.add(5);
        indexesList.add(6);
        indexesList.add(7);

        Random random = new Random();

        firstRandomNumber = random.nextInt(indexesList.size());
        indexesList.remove(firstRandomNumber);

        secondRandomNumber = random.nextInt(indexesList.size());
        indexesList.remove(secondRandomNumber);

        thirdRandomNumber = random.nextInt(indexesList.size());

        Actions actions = new Actions(getDriver());
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(multiSelectOptions.get(firstRandomNumber))
                .click(multiSelectOptions.get(secondRandomNumber))
                .click(multiSelectOptions.get(thirdRandomNumber))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
    }

    public String theStringValueOfTheFirstRandomNumber() {
        return multiSelectOptions.get(firstRandomNumber).getValue();
    }

    public void clickFirstSelectedButton() {
        firstSelectedButton.click();
    }

    public String getAssertMessage() {
        return assertMessage.getText();
    }



    // Second Scenario Methods

    public void clickGetAllButton() {
        getAllSelectedButton.click();
    }

    public String[] theStringValuesOfTheRandomNumbers() {
        String[] theString = new String[3];

        theString[0] = multiSelectOptions.get(firstRandomNumber).getValue();
        theString[1] = multiSelectOptions.get(secondRandomNumber).getValue();
        theString[2] = multiSelectOptions.get(thirdRandomNumber).getValue();

        return theString;

    }




















































}

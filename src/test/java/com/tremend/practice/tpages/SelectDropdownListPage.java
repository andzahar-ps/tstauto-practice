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

    int indexOfFirstRandomNumber;
    int indexOfSecondRandomNumber;
    int indexOfThirdRandomNumber;

    int valueOfFirstRandomIndexNumber;
    int valueOfSecondRandomIndexNumber;
    int valueOfThirdRandomIndexNumber;


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

        indexOfFirstRandomNumber = indexesList.get(random.nextInt(indexesList.size() - 1));
        valueOfFirstRandomIndexNumber = indexesList.get(indexOfFirstRandomNumber);
        System.out.println(indexOfFirstRandomNumber);
        System.out.println(valueOfFirstRandomIndexNumber);
        indexesList.remove(indexOfFirstRandomNumber);

        indexOfSecondRandomNumber = indexesList.get(random.nextInt(indexesList.size() - 1));
        valueOfSecondRandomIndexNumber = indexesList.get(indexOfSecondRandomNumber);
        System.out.println(indexOfSecondRandomNumber);
        System.out.println(valueOfSecondRandomIndexNumber);
        indexesList.remove(indexOfSecondRandomNumber);

        indexOfThirdRandomNumber = indexesList.get(random.nextInt(indexesList.size() - 1));
        valueOfThirdRandomIndexNumber = indexesList.get(indexOfThirdRandomNumber);
        System.out.println(indexOfThirdRandomNumber);
        System.out.println(valueOfThirdRandomIndexNumber);
        indexesList.remove(indexOfThirdRandomNumber);

        System.out.println(indexesList);

        Actions actions = new Actions(getDriver());
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(multiSelectOptions.get(indexOfFirstRandomNumber))
                .click(multiSelectOptions.get(indexOfSecondRandomNumber))
                .click(multiSelectOptions.get(indexOfThirdRandomNumber))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
    }

    public String theStringValueOfTheFirstRandomNumber() {
        return multiSelectOptions.get(indexOfFirstRandomNumber).getValue();
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

        theString[0] = multiSelectOptions.get(indexOfFirstRandomNumber).getValue();
        theString[1] = multiSelectOptions.get(indexOfSecondRandomNumber).getValue();
        theString[2] = multiSelectOptions.get(indexOfThirdRandomNumber).getValue();


        return theString;

    }




















































}

package com.tremend.practice.util;


import com.tremend.practice.util.constants.framework.Attribute;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class Wrapper extends PageObject {
    public Wrapper(WebDriver driver){
        super(driver);
    }

    public static void moveToElement(WebDriver driver, WebElementFacade element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public static String getAttribute(WebElementFacade element, Attribute attribute ){
        return element.getAttribute(attribute.getValue());
    }

    public static void setInputField(WebElementFacade element, String text){
        element.waitUntilVisible();
        element.sendKeys(text);
    }

    public static String getText(WebElementFacade element){
        return element.getText();
    }

    public static void setDropDownFieldByVisibleText(WebElementFacade element, String visibleText){
        element.selectByVisibleText(visibleText);
    }

    public static void setDropDownFieldByIndex(WebElementFacade element, int index){
        element.selectByIndex(index);
    }

    public static void setDropDownFieldByValue(WebElementFacade element, String value){
        element.selectByValue(value);
    }

    public static String setDropDownFieldByRandomValue(WebElementFacade element) {
        Random rand = new Random();

        List<String> values = element.getSelectOptions();
        values.remove(0);
        int random = rand.nextInt(values.size());
        String optionValue = values.get(random);
        element.selectByVisibleText(optionValue);
        return optionValue;
    }

    public static String setSearchFieldByRandomValue(WebElementFacade element, List<WebElementFacade> options){
        element.click();
        Random rand = new Random();
        int random = rand.nextInt(options.size());
        String optionValue =options.get(random).getText();
        element.sendKeys( optionValue);
        element.sendKeys(Keys.ENTER);
        return optionValue;

    }

//    public static void setCheckboxState(WebElementFacade element, CheckboxState checkboxState){
//        //ToDo when checkbox logic will be fixed in frontend decomment method
//        element.click();
//    }

    public static void click(WebElementFacade element){
        element.waitUntilClickable();
        element.click();
    }

    public static String getSelectedValueFromDropDownField(WebElementFacade element){
        return element.getSelectedVisibleTextValue();
    }



}

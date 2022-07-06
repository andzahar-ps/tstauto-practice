package com.tremend.practice.util;

import com.tremend.practice.util.constants.framework.TestConstant;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait extends PageObject {
    public Wait(WebDriver driver){
        super(driver);
    }

    public static WebElement visible(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, TestConstant.SHORT_WAIT).until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement visible(WebDriver driver, WebElement element, int time) {
        return new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(element));
    }
}

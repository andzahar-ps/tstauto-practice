package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.awt.event.KeyEvent;


public class SelectDropdownPage extends PageObject {
    @FindBy(id = "select-demo")
    private WebElementFacade dropdownElements;

    @FindBy(className = "selected-value")
    private WebElementFacade daySelectedMessage;

    @FindBy(className = "panel-heading")
    private WebElementFacade someRandomAction;

    @FindBy(css = "select[id='select-demo'] option:nth-child(1)")
    private WebElementFacade dropdownPlaceholder;

    @FindBy(xpath = "//*[@id='multi-select']/option")
    private WebElementFacade multiselectDropdown;

    public void navigateToDropdownPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    public void clickOnSingleSelectDropdown(int index) {
        dropdownElements.selectByIndex(index);
    }

    public String getMessageSelectedDay() {
        return daySelectedMessage.getText();
    }

    public void inspectPlaceholder() {
        someRandomAction.click();
    }

    public String getPlaceholder() {
        return dropdownPlaceholder.getText();
    }

    public void selectMultipleValuesDropdown() {
        Actions action= new Actions(getDriver());
        action.keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
    }

    //    public void selectMultipleValuesDropdown(int value) {
//        multiselectDropdown.selectByIndex(value);
//    }

    /*   public void selectAllMultipleValuesDropdown() {
        multiselectDropdown.get(index).sendKeys(Keys.CONTROL,clickOnSingleSelectDropdown(index).perform();
        //      multiselectDropdown.send(Keys.chord(Keys.CONTROL,"a"));*/
/*        Robot robot = new Robot();
        robot.keyPress(KeyEvent.CONTROL);
        elements.get(0).click();
        elements.get(1).click();
        robot.keyRelease(KeyEvent.CONTROL);

        Actions action= new Actions(driver);
        action.contextClick(productLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();*/
}


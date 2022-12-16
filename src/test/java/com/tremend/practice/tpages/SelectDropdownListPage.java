package com.tremend.practice.tpages;

import com.ibm.icu.impl.UResource;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SelectDropdownListPage extends PageObject {

    //Adding the webpage elements that will be used in the following tests:
    //Select List Demo:

    @FindBy (id = "select-demo")
    private WebElementFacade selectListDemo;

    @FindBy (css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > p.selected-value")
    private WebElementFacade selectListDemoMessage;


    //Multi Select List Demo:

    @FindBy (id = "multi-select")
    private List<WebElementFacade> multiSelectListDemo;

    @FindBy (id = "printMe")
    private WebElementFacade firstSelectedButton;

    @FindBy (id = "printAll")
    private WebElementFacade getAllSelectedButton;

    @FindBy (css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > p.getall-selected")
    private WebElementFacade multiSelectListDemoMessage;



    //Creating methods for each webpage element:
    //Navigate to webpage:

    public void navigateToSelectDropdownListPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    //Select List Demo:
    public void selectDropdownValue(String value){
        selectListDemo.selectByValue(value);
    }

    public String getSelectListDemoMessage(){
        return selectListDemoMessage.getText();
    }



    //Multi Select List Demo:

    public int getMultiSelectListSize(){
        return multiSelectListDemo.size();
    }

    public void selectMultipleValues(){
        int listIndex = multiSelectListDemo.size();

        Actions actions = new Actions(getDriver());
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(multiSelectListDemo.get(0))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
    }

    public void clickFirstSelectedButton(){
        firstSelectedButton.click();
    }

    public void clickGetAllSelectedButton(){
        getAllSelectedButton.click();
    }

    public String getMultiSelectListDemoMessage(){
        return multiSelectListDemoMessage.getText();
    }

}

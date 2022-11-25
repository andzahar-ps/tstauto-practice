package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class RadioButtonsDemoPage extends PageObject {

    //Adding the webpage elements that will be used in the following tests:

    //Radio Button Demo:

    @FindBy (name = "optradio")
    private List<WebElementFacade> radioButtonsList;

    @FindBy (id = "buttoncheck")
    private WebElementFacade getCheckedValueButton;

    @FindBy (css = "#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > p.radiobutton")
    private WebElementFacade radioButtonMessage;

    //Group Radio Buttons Demo:

    @FindBy (name = "gender")
    private List<WebElementFacade> genderRadioButtonsList;

    @FindBy (name = "ageGroup")
    private List<WebElementFacade> ageGroupRadioButtonsList;

    @FindBy (css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > button")
    private WebElementFacade getValuesButton;

    @FindBy (css = "#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > p.groupradiobutton")
    private WebElementFacade groupRadioButtonsMessage;


    //Creating methods for each webpage element:
      //Navigate to webpage
    public void navigateToRadioButtonsDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    //Radio Button Demo:

    public void clickRadioButtonsList(int index){
        radioButtonsList.get(index).click();
    }

    public void clickGetCheckedValueButton(){
        getCheckedValueButton.click();
    }

    public String getRadioButtonMessage(){
        return radioButtonMessage.getText();
    }

    //Group Radio Buttons Demo:

    public void clickGenderRadioButtonsList(int index){
        genderRadioButtonsList.get(index).click();
    }

    public void clickAgeGroupRadioButtonsList(int index){
        ageGroupRadioButtonsList.get(index).click();
    }

    public void clickGetValuesButton(){
        getValuesButton.click();
    }

    public String getGroupRadioButtonsMessage(){
        return groupRadioButtonsMessage.getText();
    }

}

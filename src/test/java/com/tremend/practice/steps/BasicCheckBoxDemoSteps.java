package com.tremend.practice.steps;

import com.tremend.practice.tpages.BasicFirstFormDemoPage;
import net.thucydides.core.annotations.Step;

public class BasicCheckBoxDemoSteps {

    private BasicFirstFormDemoPage basicFirstFormDemoPage;

    @Step
    public void user_navigates_to_form_page(){ basicFirstFormDemoPage.navigateToBasicFirstFormPage();}

    @Step
    public void user_clicks_single_checkbox(){ basicFirstFormDemoPage.;}

}

package com.tremend.practice.steps;

import com.tremend.practice.tpages.SubscribeModalPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class SubscribeModalSteps {


    SubscribeModalPage subscribeModalPage;

    @Step
    public void user_closes_the_subscribe_modal(){
        subscribeModalPage.clickCloseButton();
    }


}

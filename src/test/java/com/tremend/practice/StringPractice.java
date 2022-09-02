package com.tremend.practice;

import org.testng.annotations.Test;

public class StringPractice {
    @Test
    public void string01() {
        String myFirstString = "This is my first string";
        String mySecondString = "This is my second string";
        String spaceString = " ";
        String stringConcat = myFirstString + " " + mySecondString;
        System.out.println(stringConcat);
    }
}

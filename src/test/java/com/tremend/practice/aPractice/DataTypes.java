package com.tremend.practice.aPractice;

import org.junit.Test;

public class DataTypes {


    @Test
    public void playBoolean(){
        boolean value = true;

        System.out.println("Our value for var is : " + value);

        value = false;

        System.out.println("Our value for var is : " + value);
    }


    @Test
    public void playInt(){
        int myVarInt;

        myVarInt = 5;

        System.out.println("My value for myVarInt is : " + myVarInt);

        myVarInt = myVarInt + 5;

        System.out.println("My value for myVarInt is : " + myVarInt);
    }


    @Test
    public void playDouble(){
        double pi = 3.14;

        System.out.println("My value for myVarInt is : " + pi);
    }

    @Test
    public void playLong(){
        long myLong = 2;

        System.out.println("My value for myVarInt is : " + myLong);
    }

    @Test
    public void playChar(){
        char myChar = '4';
    }

    @Test
    public void playFloat(){
        float myFloat = 3.14F;

        System.out.println("My value for myVarInt is : " + myFloat);
    }








}

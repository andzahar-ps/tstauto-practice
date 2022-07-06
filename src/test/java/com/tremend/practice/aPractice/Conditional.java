package com.tremend.practice.aPractice;

import org.junit.Test;

public class Conditional {


    @Test
    public void conditional01(){

        boolean valTrue = true;
        boolean valFalse = false;

        if ( valTrue != valFalse){
            System.out.println("My value is true");
        }

        if ( valTrue == valFalse){
            System.out.println("This text will not be printed");
        }
    }


    public void conditional02(String town){

        if (town.equals("Galati")){
            System.out.println("Trecem Dunare cu Bacul");

        } else if (town.equals("Brasov")){
            System.out.println("Azi urcam la munte");
        }
    }


    @Test
    public void conditional03(){
        conditional02("Galati");
        conditional02("Brasov");
    }


}

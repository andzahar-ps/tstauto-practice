package com.tremend.practice.ivancescuSorinTema.Tema1;

import org.junit.Test;

public class Exercise5 {
    @Test
    public void theGreatestNumber(){
        int a = 25;
        int b = 78;
        int c = 87;
        if ( a > b && a > c){
            System.out.println("The greatest number is " + a);
        } else if ( b > a && b > c){
            System.out.println("The greatest number is " + b);
        } else {
            System.out.println("The greatest number is " + c);
        }

    }
}

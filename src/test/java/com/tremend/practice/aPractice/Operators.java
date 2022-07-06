package com.tremend.practice.aPractice;

import org.junit.Test;

public class Operators {


    @Test
    public void op1(){
        int a = 4, b = 2;

        System.out.println("Our sum is : " + ( a + b ));
        System.out.println("Our dif is " + (a - b));
        System.out.println("Our multiplication is : " + ( a * b));
        System.out.println("Our division is : " + (a/b));

        System.out.println("Our rest is :" + (a%b));
    }

    @Test
    public void op2() {

        boolean varTrue = true;
        boolean varFalse = false;

        System.out.println(varTrue && varTrue); // true

        System.out.println(varFalse && varTrue); // false
        System.out.println(varTrue && varFalse); // false

        System.out.println(varFalse && varFalse); // false



        System.out.println(varTrue || varTrue); // true

        System.out.println(varFalse || varTrue); // true
        System.out.println(varTrue || varFalse); // true

        System.out.println(varFalse || varFalse); // false




        System.out.println(varTrue == varFalse); // false
        System.out.println(varTrue == varTrue);  // true
        System.out.println(varFalse == varFalse); // true


        System.out.println(varTrue != varFalse); // true
        System.out.println(varTrue != varTrue);  // false
        System.out.println(varFalse != varFalse); // false

    }


    @Test
    public void op3(){

        int a = 2,  b = 3;

        System.out.println( a < b); //true
        System.out.println( b < a); //false
        System.out.println( a <= b); //true
        System.out.println( b <= a); //false
        System.out.println( a >= b); //false
        System.out.println( b >= a); //true
        System.out.println( a == b); // true

    }
}

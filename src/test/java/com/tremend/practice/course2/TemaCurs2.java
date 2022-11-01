package com.tremend.practice.course2;
import java.util.Scanner;    // Needed for Scanner class -> http://www.beginwithjava.com/java/inputoutput/reading-keyboard-input.html


public class TemaCurs2 {

    public static void main(String args[]){

        // 1) Write a Java program to print "Hello World" on the screen.
        System.out.println("Hello World");

        /* 2) Write a Java program to print the following output:
++++++
@@@@@@
******
###### */

        System.out.println("++++++"+"\n"+"@@@@@@"+"\n"+"******"+"\n"+"######");

        // 3) Write a Java program to print the result of the following operations.

        // a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6);

        // b. (55+9) % 9
        System.out.println((55+9) % 9);

        // c. 20 + -3*5 / 8
        System.out.println(20 + ((-3*5) / 8));

        // d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println(5 + ((15 / 3) * 2) - (8 % 3));

        /* Write a Java program to convert minutes into a number of years and days.
Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days */

        System.out.println("Input the number of minutes:");

        int minutesKey;

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        minutesKey = console.nextInt(); // read from keyboard
        //System.out.println(minutes);

        /* 1h - 60 min
           1z - 24h - 1440m
           1y - 365z - 8760h - 525600m
        * */

        long years, days, hours, minutes;
        years = minutesKey / 525600;
        days = (minutesKey - (years * 525600)) / 1440; //scad anii daca exista
        hours = (minutesKey - ((minutesKey - (years * 525600)) / 1440)) / 60; //scad numarul de ani si zile
        minutes = ((minutesKey - ((minutesKey - (years * 525600)) / 1440)) / 60) / 60;// scad numarul de ani, zile, ore

        System.out.println(minutesKey+" minutes is approximately "+years+" years and "+days+" days"+hours+" hours"+minutes+" minutes left");

    }

}

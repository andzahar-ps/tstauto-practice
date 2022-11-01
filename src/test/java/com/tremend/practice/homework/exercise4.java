package com.tremend.practice.homework;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args){
        //using the Scanner class to be able to get user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");

        int minutes = userInput.nextInt();
        int yearsFormula = 365 * 24 * 60;
        int years =   minutes / yearsFormula;
        int daysFormula = 60 * 24;
        int days = minutes % yearsFormula / daysFormula;

        System.out.println( minutes + " " + " minutes is approximately: "+ years + " " +"year/s"+ " and " + days + " day/s" );

    }
}
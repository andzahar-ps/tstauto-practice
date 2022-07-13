package Homework1;

import java.util.Scanner;

public class Excercise4 {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Number of minutes: ");
        int min = input.nextInt();
        System.out.println("Number of minutes" + min);
        int days = min/1440;
        int years = days/365;
        int leftdays = days % 365;
        System.out.println(years + " years and " + leftdays + " days");
    }
    }

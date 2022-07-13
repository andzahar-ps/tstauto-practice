package Homework1;

import java.util.Scanner;

public class Excercise5 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input the 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Input the 2nd number: ");
        int num2 = input.nextInt();
        System.out.println("Input the 3rd number: ");
        int num3 = input.nextInt();

        if (num1 > num2)
            if (num1 >num3)
                System.out.println ("The greatest number is: " + num1);
        if (num2 > num1)
            if(num2 > num3)
                System.out.println ("The greatest number is: " + num2);
        if (num3 > num1)
            if(num3 > num2)
                System.out.println ("The greatest number is: " + num3);

    }
}

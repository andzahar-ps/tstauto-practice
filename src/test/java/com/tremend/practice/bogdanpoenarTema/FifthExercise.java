package com.tremend.practice.bogdanpoenarTema;

import org.junit.Test;

public class FifthExercise {

    @Test

    public void main() {
        theGreatestNumber(95, 100, 95);
    }

    public static void theGreatestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("The greatest number is " + a);
        }

        else if (b > a && b > c) {
            System.out.println("The greatest number is " + b);
        }

        else {
            System.out.println("The greatest number is " + c);
        }
    }
}

package com.tremend.practice.bogdanpoenarTema.bogdanpoenarTemaWeek2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstExercise {

    @Test

    public void main() {
        arrayIteration(126);
    }

    public static void arrayIteration(int theNeededNumber) {
        int[] numbers = {18, 12, 88, 45, 17, 90, 126};

        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == theNeededNumber) {
                System.out.println("Success!");
            }
            else {
                System.out.println("Number NOT found!");
            }
        }
    }

    @Test

    public void secondMain() {

        secondArrayIterationTry(14);
    }

    public static void secondArrayIterationTry(int anotherNeededNumber) {
        int[] theOtherNumber = {14, 8, 71, 56, 32, 76};

        List<Integer> theList =  new ArrayList<>();

        for (int i = 0; i < theOtherNumber.length; i++) {
            theList.add(theOtherNumber[i]);
        }

        if (theList.contains(anotherNeededNumber)) {
            System.out.println("Success!");
        }
        else {
            System.out.println("Number NOT found!");
        }
    }
}

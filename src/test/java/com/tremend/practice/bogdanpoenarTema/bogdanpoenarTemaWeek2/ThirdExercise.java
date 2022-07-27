package com.tremend.practice.bogdanpoenarTema.bogdanpoenarTemaWeek2;

import org.junit.Test;

public class ThirdExercise {

    @Test

    public void main() {
       String originalString = "The quick brown fox jumps over the lazy dog.";
       String newString = originalString.replaceAll("fox", "cat");

        System.out.println("Original string: " + originalString);
        System.out.println("New string " + newString);

    }
}

package com.tremend.practice.course2;

public class Exercise3 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String replacefox =sentence.replace("fox","cat");
        System.out.println("Original string:" + sentence);
        System.out.println("New string: " + replacefox);
    }
}

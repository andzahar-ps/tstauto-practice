package com.tremend.practice.course2;

public class Exercise1 {
    public static void main(String[] args) {
        String[] boschetei = {"Spanac", "Urzici", "Leurda", "Varza"};
        for (int i = 0; i < boschetei.length; i++) {
            if (boschetei[i] == "Urzici") {
                System.out.println("This array contains " + boschetei[i]);
                break;
            }
        }
    }
}

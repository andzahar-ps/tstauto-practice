package com.tremend.practice.course2;

public class Math {
    public static void main(String[] args) {
        float a=-5 + 8 * 6;
        float b= (55+9) % 9;
        float c=20 + -3*5 / 8;
        float d=5 + 15 / 3 * 2 - 8 % 3;
        float[] matematica = {a, b, c, d};

        for (int i = 0; i < matematica.length; i++) {

            System.out.println(" Raspunsul la prima ecuatie este "+ matematica[i]);
        }
    }
}

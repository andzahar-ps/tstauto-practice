package com.tremend.practice.course2;

import org.testng.annotations.Test;

    public class Tema3 {

        @Test
        public void calc1() {
            int a = -5;
            int b = 8;
            int c = 6;
            System.out.println("The result is " + (a + (b * c)));
        }

        @Test
        public void calc2() {
            int a = 55;
            int b = 9;
            int c = 9;
            System.out.println("The result is " + ((a + b) % c));
        }

        @Test
        public void calc3(){
            int a = 20;
            int b = -3;
            int c = 5;
            int d = 8;
            System.out.println("The result is " + (a + ((b * c) / d)));
        }

        @Test
        public void calc4(){
            int a = 5;
            int b = 15;
            int c = 3;
            int d = 2;
            int e = 8;
            int f = 3;
            System.out.println((a + (b / c * d) - (e % f)));
        }
    }


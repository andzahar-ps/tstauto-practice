package com.tremend.practice.course2;

public class Tema4 {
    public static void main(String[] args){
        // 1h = 60m
        // 1d = 24h * 60m = 1440m
        // 1mo = 30d * 1440m = 43200m
        // 12mo = 12mo * 43200m = 518400m
        // 3456789 / 518400 = 6y, 240d (8mo = 346389d)
        int h = 60;
        int d = 1440;
        int mo = 43200;
        int ye = 518400;
        System.out.println("3456789 minutes is approximately " + 3456789 / ye + " years and " + 346389 / d + " days");
    }
    }


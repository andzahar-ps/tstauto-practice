package com.tremend.practice.bogdanpoenarTema;

import org.junit.Test;

public class FourthExercise {

    @Test

    public void main() {
        minuteInAniSiZile(3456789);
    }

    public static void minuteInAniSiZile(int inputNumarMinute) {
        int numarMinutePerAn = 60 * 24 * 365;
        int numarAni = inputNumarMinute / numarMinutePerAn;
        int numarZileRamase = (inputNumarMinute % numarMinutePerAn) / 1440;

        System.out.println(inputNumarMinute + " minutes is approximately " + numarAni + " years and " + numarZileRamase + " days." );
    }
}

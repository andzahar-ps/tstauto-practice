package com.tremend.practice.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class DateUtil {
    private DateUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static long getNowTimeInEpochSecondFormat(){
        Instant instant = Instant.now();
        return instant.getEpochSecond();
    }

    public static long getNowTimeInEpochMilliSecondFormat(){
        Instant instant = Instant.now();
        return  instant.toEpochMilli();
    }

    public static String getCurrentTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now); //2016/11/16 12:08:43
    }

    public static String getCurrentTimeInFormat(String format){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String getNowTimeInEpochMiliSecondString(){
        Instant instant = Instant.now();
        return  String.valueOf(instant.toEpochMilli());
    }

    public static int totalDaysBetween2DaysIgnoreWeekend(LocalDate start, LocalDate end) {
        int count = 0;
        List<DayOfWeek> ignore = Arrays.asList(DayOfWeek.SATURDAY,DayOfWeek.SUNDAY);
        LocalDate curr = start.plusDays(0);

        while (curr.isBefore(end)) {
            if (!ignore.contains(curr.getDayOfWeek())) {
                count++;
            }
            curr = curr.plusDays(1);
        }

        return count + 1;
    }

    /**
     * This function is used for generate the available vacation day.
     * The parameter will be the latest vacation date.
     * First, if the latest date is null mean user has no request vacation yet, then it will get the current otherwise it will get the latest vacation date.
     * It will plus 1 more day.
     * Second, it will check the date on the First step is Saturday or Sunday.
     * if SATURDAY, then it will plus 2 days to next MONDAY.
     * if SUNDAY, then it will plus 2 day to next MONDAY.
     * The purpose of this function is we will get the available date which is not SUNDAY or SATURDAY.
     * @return available date user can submit, it is used for START-DATE and END-DATE
     */
    public static LocalDate generateAvailableRequestDate(LocalDate date){
        if(date == null){
            date = LocalDate.now();
        }
        //use the next day.
        date = date.plus(Period.ofDays(1));

        if(date.getDayOfWeek().getValue() == 6){
            date = date.plus(Period.ofDays(2));
        }
        else if(date.getDayOfWeek().getValue() == 7){
            date = date.plus(Period.ofDays(1));
        }

        return date;
    }


}


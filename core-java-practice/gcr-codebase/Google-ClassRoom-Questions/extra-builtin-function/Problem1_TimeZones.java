package com.bridgelabz.extra.builtin;

//Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
//time in different time zones:
//➢ GMT (Greenwich Mean Time)
//➢ IST (Indian Standard Time)
//➢ PST (Pacific Standard Time)
//Hint: Use ZonedDateTime and ZoneId to work with different time zones.

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Problem1_TimeZones {
    public static void main(String[] args) {

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time:");
        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
    }
}


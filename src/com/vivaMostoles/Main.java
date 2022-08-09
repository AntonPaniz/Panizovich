package com.vivaMostoles;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("England"));
        System.out.println("enter your time>>>  ");
        Scanner insertTime = new Scanner(System.in);
        int currentTimeFromConsole = insertTime.nextInt();
        int valueToConvertFromSecToMiliSec = 1000;
        Date date = new Date(currentTimeFromConsole*valueToConvertFromSecToMiliSec);
        SimpleDateFormat formater = new SimpleDateFormat("HH:mm:ss");
        System.out.println(formater.format(date));
       /* int timeSize = 60;
        int hour = 0;
        int min = 0;
        int sec = 0;
        System.out.println(Math.floorDiv(currentTime, timeSize));
        sec = Math.floorDiv(currentTime, timeSize);
        System.out.println(sec);
        Date date2 = new Date();
        int hour2 = date.getHours();
        System.out.println(hour);*/

            }}

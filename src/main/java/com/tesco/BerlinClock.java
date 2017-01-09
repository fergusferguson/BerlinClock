package com.tesco;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by FA78 on 12/12/2016.
 */
public class BerlinClock {

    private int hours;
    private int minutes;
    private int seconds;
    private int blahhhh;


    private static final int FIVE_HOUR_LAMP_COUNT = 4;
    private static final int ONE_HOUR_LAMP_COUNT = 4;
    private static final int FIVE_MINUTE_LAMP_COUNT = 11;
    private static final int ONE_MINUTE_LAMP_COUNT = 4;

    private SecondLamp secondLamp;
    private ArrayList<FiveHourLamp> fiveHourLamps;
    private ArrayList<OneHourLamp> oneHourLamps;
    private ArrayList<FiveMinuteLamp> fiveMinuteLamps;
    private ArrayList<OneMinuteLamp> oneMinuteLamps;

    public BerlinClock(String clockTime){

        hours = Integer.parseInt(clockTime.substring(0,2));
        minutes = Integer.parseInt(clockTime.substring(3,5));
        seconds = Integer.parseInt(clockTime.substring(6,8));

//        System.out.println(hours);
//        System.out.println(minutes);
//        System.out.println(seconds);

        // Create the 5 minute lamps
        fiveMinuteLamps = new ArrayList<FiveMinuteLamp>(FIVE_MINUTE_LAMP_COUNT);
        for(int i = 0; i < FIVE_MINUTE_LAMP_COUNT; i++){
            FiveMinuteLamp newFiveMinuteLamp = new FiveMinuteLamp(i+1);
            fiveMinuteLamps.add(i, newFiveMinuteLamp);
        }

        // Create the 1 minute lamps
        oneMinuteLamps = new ArrayList<OneMinuteLamp>(ONE_MINUTE_LAMP_COUNT);
        for(int i = 0; i < ONE_MINUTE_LAMP_COUNT; i++){
            OneMinuteLamp newOneMinuteLamp = new OneMinuteLamp();
            oneMinuteLamps.add(i, newOneMinuteLamp);
        }


        // Create the 5 hour lamps
        fiveHourLamps = new ArrayList<FiveHourLamp>(FIVE_HOUR_LAMP_COUNT);
        for(int i = 0; i < FIVE_HOUR_LAMP_COUNT; i++){
            FiveHourLamp newFiveHourLamp = new FiveHourLamp();
            fiveHourLamps.add(i, newFiveHourLamp);
        }

        // Create the 1 hour lamps
        oneHourLamps = new ArrayList<OneHourLamp>(ONE_HOUR_LAMP_COUNT);
        for(int i = 0; i < ONE_HOUR_LAMP_COUNT; i++){
            OneHourLamp newOneHourLamp = new OneHourLamp();
            oneHourLamps.add(i, newOneHourLamp);
        }


        //hourLampController = new HourLampController(hours);
        //minuteLampController = new MinuteLampController();
    }

    public void turnOnClock(){

        // Second Lamps
        secondLamp = new SecondLamp(seconds);
        secondLamp.renderLamp();

        // setup and display the hour lamps
        HourLampController hourLampController = new HourLampController();
        hourLampController.setHourLamps(hours, fiveHourLamps, oneHourLamps);
        hourLampController.renderHourLamps(fiveHourLamps, oneHourLamps);
        System.out.println(" ");

        // setup and display the minute lamps
        MinuteLampController minuteLampController = new MinuteLampController();
        minuteLampController.setMinuteLamps(minutes, fiveMinuteLamps, oneMinuteLamps);
        minuteLampController.renderMinuteLamps(fiveMinuteLamps, oneMinuteLamps);
    }
}

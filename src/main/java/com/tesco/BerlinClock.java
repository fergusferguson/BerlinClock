package com.tesco;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by FA78 on 12/12/2016.
 */
public class BerlinClock {
    private SecondLamp secondLamp;
    private ArrayList<FiveHourLamp> fiveHourLamps;
    private ArrayList<OneHourLamp> oneHourLamps;
    private ArrayList<FiveMinuteLamp> fiveMinuteLamps;
    private ArrayList<OneMinuteLamp> oneMinuteLamps;

    public BerlinClock(Date clockTime){

        SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");
        System.out.println(fmt.format(clockTime));
    }

}

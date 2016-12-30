package com.tesco;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by FA78 on 12/12/2016.
 */
public class BerlinClockApplication {
    public static void main(String[] args) {
        char boxTopLeft = '\u2554';
        char boxTopRight = '\u2557';
        char boxBottomLeft = '\u255A';
        char boxBottomRight = '\u255D';
        char boxHorizontal = '\u2550';
        char boxVertical = '\u2551';


        /*System.out.println(boxTopLeft);
        System.out.println(boxHorizontal);
        System.out.println(boxTopRight);
        System.out.println(boxBottomLeft);
        System.out.println(boxBottomRight);
        System.out.println(boxHorizontal);
        System.out.println(boxVertical);*/

        Date dNow = new Date();
        BerlinClock berlinClock = new BerlinClock(dNow);
        berlinClock.turnOnClock();


    }
}

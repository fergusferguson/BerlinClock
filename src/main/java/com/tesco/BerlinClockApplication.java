package com.tesco;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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

        //System.out.println(input);
        String input = "null";
        Time24HoursValidator timeValidator = new Time24HoursValidator();
        boolean validDate = false;
        while(validDate==false){
            System.out.println("Enter clock time in the format hh:mm:ss > ");
            Scanner scanIn = new Scanner(System.in);
            input = scanIn.nextLine();
            validDate = timeValidator.validate(input);
            if(!validDate){
                System.out.println("Invalid time entry!");
            }
            else{
                scanIn.close();
            }

        }

        BerlinClock berlinClock = new BerlinClock(input);
        berlinClock.turnOnClock();

    }
}

package com.tesco;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by FA78 on 01/01/2017.
 */
public class Time24HoursValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String TIME24HOURS_PATTERN =
            "(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";

    public Time24HoursValidator(){
        pattern = Pattern.compile(TIME24HOURS_PATTERN);
    }

    /**
     * Validate time in 24 hours format with regular expression
     * @param time time address for validation
     * @return true valid time fromat, false invalid time format
     */
    public boolean validate(final String time){

        matcher = pattern.matcher(time);
        return matcher.matches();

    }
}

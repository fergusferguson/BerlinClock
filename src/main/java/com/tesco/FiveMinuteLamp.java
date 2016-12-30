package com.tesco;

/**
 * Created by FA78 on 12/12/2016.
 */
public class FiveMinuteLamp extends Lamp {

    public FiveMinuteLamp(int lampNumber){
        if (lampNumber == 3 || lampNumber == 6 || lampNumber == 9) {
            super.setLampColour("R");
        }
        else{
            super.setLampColour("Y");
        }

        this.turnOffLamp();
    }
}

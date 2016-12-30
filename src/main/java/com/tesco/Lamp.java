package com.tesco;

/**
 * Created by FA78 on 21/12/2016.
 */
public class Lamp {
    private String lampState;
    private String lampColour;

    public void turnOnLamp(){
        lampState = lampColour;
    }

    public void turnOffLamp(){
        this.lampState = "O";
    }

    public String getLampState() {
        return this.lampState;
    }

    public String getLampColour() {
        return lampColour;
    }

    public void setLampColour(String lampColour) {
        this.lampColour = lampColour;
    }
}

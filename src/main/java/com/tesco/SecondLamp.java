package com.tesco;

/**
 * Created by FA78 on 12/12/2016.
 */
public class SecondLamp extends Lamp{

    public SecondLamp(int seconds){

        super.setLampColour("Y");

        if (seconds % 2 == 0){
            this.turnOnLamp();
        }
        else {
            this.turnOffLamp();
        }
    }

    public void renderLamp(){

        System.out.println("                * *                ");
        System.out.println("               *   *               ");
        System.out.println("              *  " + this.getLampState() + "  *              ");
        System.out.println("               *   *               ");
        System.out.println("                * *                ");
    }
}

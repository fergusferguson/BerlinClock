package com.tesco;

import java.util.ArrayList;

/**
 * Created by FA78 on 21/12/2016.
 */
public class HourLampController {

    String boxTopLeft = Character.toString('\u2554');
    String boxTopRight = Character.toString('\u2557');
    String boxBottomLeft = Character.toString('\u255A');
    String boxBottomRight = Character.toString('\u255D');
    String boxHorizontal = Character.toString('\u2550');
    String boxVertical = Character.toString('\u2551');
    String space = Character.toString('\u00A0');
    String threeSpace = space+space+space;
    String lampTop = boxTopLeft+boxHorizontal+boxHorizontal+boxHorizontal+boxHorizontal+boxHorizontal+boxHorizontal+boxHorizontal+boxTopRight;
    String lampBottom = boxBottomLeft+boxHorizontal+boxHorizontal+boxHorizontal+boxHorizontal+boxHorizontal+boxHorizontal+boxHorizontal+boxBottomRight;
    String lampCentreLeft = boxVertical+threeSpace;
    String lampCentreRight = threeSpace+boxVertical;

    public HourLampController(){

    }

    // Set hour lamps
    public void setHourLamps(int hours, ArrayList<FiveHourLamp> fiveHourLampSet,
                             ArrayList<OneHourLamp> oneHourLampSet) {

        // Set 5 hour lamps
        int numberOfFiveHourLampsToSet = hours / 5;
        //System.out.println(numberOfFiveHourLampsToSet);
        for (int i = 0; i < numberOfFiveHourLampsToSet; i++) {
            fiveHourLampSet.get(i).turnOnLamp();
            //System.out.print(fiveHourLampSet.get(i).getLampState());
        }

        System.out.println();

        // Set 1 hour lamps
        int numberOfOneHourLampsToSet = hours % 5;
        // System.out.println(numberOfOneHourLampsToSet);
        for (int i = 0; i < numberOfOneHourLampsToSet; i++) {
            oneHourLampSet.get(i).turnOnLamp();
            //System.out.print(oneHourLampSet.get(i).getLampState());
        }
    }

    public void renderHourLamps(ArrayList<FiveHourLamp> fiveHourLampSet,
                                ArrayList<OneHourLamp> oneHourLampSet){

        for(int i = 0; i<fiveHourLampSet.size();i++){
            System.out.print(fiveHourLampSet.get(i).getLampState()+" ");

        }

        System.out.println();

        for(int i = 0; i<oneHourLampSet.size();i++){
            System.out.print(oneHourLampSet.get(i).getLampState()+" ");
        }
    }

}

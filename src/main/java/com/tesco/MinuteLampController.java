package com.tesco;

import java.util.ArrayList;

/**
 * Created by FA78 on 22/12/2016.
 */
public class MinuteLampController {


    public MinuteLampController(){

    }

    public void setMinuteLamps(int minutes,
                               ArrayList<FiveMinuteLamp> fiveMinuteLampSet,
                               ArrayList<OneMinuteLamp> oneMinuteLampSet){

        //set the 5 minute lamps
        int numberOfFiveMinuteLampsToLight = minutes/5;
        for (int i=0;i< numberOfFiveMinuteLampsToLight;i++){
            fiveMinuteLampSet.get(i).turnOnLamp();
            //System.out.println(fiveMinuteLampSet.get(i).getLampState());
        }

        // set the 1 minute lamps
        int numberOfOneMinuteLampsToLight = minutes%5;
        for(int i=0;i<numberOfOneMinuteLampsToLight;i++) {
            oneMinuteLampSet.get(i).turnOnLamp();
            //System.out.println(oneMinuteLampSet.get(i).getLampState());
        }
    }

    public void renderMinuteLamps(ArrayList<FiveMinuteLamp> fiveMinuteLampSet,
                                  ArrayList<OneMinuteLamp> oneMinuteLampSet){



        for(int i = 0; i<fiveMinuteLampSet.size();i++){
            System.out.print(fiveMinuteLampSet.get(i).getLampState()+" ");

        }

        System.out.println();

        for(int i = 0; i<oneMinuteLampSet.size();i++){
            System.out.print(oneMinuteLampSet.get(i).getLampState()+" ");
        }

    }


}

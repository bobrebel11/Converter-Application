package com.example.rebelbob11.juneassignment.converters;

import android.util.Log;

public class convertToInt {

    private String rawVal="";
    private String intVal="";


    public convertToInt(String rawVal) {
        this.rawVal = rawVal;

    }

    public String ifInt(){

        Integer indexOfDot=0;
        String polishedVal="";
        indexOfDot = rawVal.indexOf(".");

        polishedVal = rawVal.substring(indexOfDot);


        if(polishedVal.matches(".0000")){
            intVal = rawVal.substring(0,indexOfDot);
            Log.v("Intified","intified"+intVal);

        }
        else{

            intVal=rawVal;
        }
        return intVal;

    }

}

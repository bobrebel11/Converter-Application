package com.example.rebelbob11.juneassignment.converters;

public class converterVolume {

    private String from_arg,to_arg;
    private  Double first_arg;

    private Integer first_arg_int;

    public converterVolume(String from_arg, String to_arg, Double first_arg) {
        this.from_arg = from_arg;
        this.to_arg = to_arg;
        this.first_arg = first_arg;
    }

    public converterVolume(String from_arg, String to_arg, Integer first_arg_int) {
        this.from_arg = from_arg;
        this.to_arg = to_arg;
        this.first_arg_int = first_arg_int;
    }


    public Double convert(){

        //Declaring variables
        Double result=0.0;
        Double first_arg_ml = 0.0;

        //switch statement to convert first argument to millimeters
        switch (from_arg){
            case "Milliliter":
                first_arg_ml = first_arg*1;
                break;
            case "Liter":
                first_arg_ml = first_arg*1000;
                break;
            case "US Fluid ounce":
                first_arg_ml = first_arg*29.574;
                break;
            case "US Quart":
                first_arg_ml = first_arg*946.353;
                break;
            case "US Gallon":
                first_arg_ml = first_arg*3785.412;
                break;

        }


        switch (to_arg){

            case "Milliliter":
                result = first_arg_ml;
                break;
            case "Liter":
                result = first_arg_ml/1000;
                break;
            case "US Fluid ounce":
                result = first_arg_ml/29.574;
                break;
            case "US Quart":
                result = first_arg_ml/946.353;
                break;
            case "US Gallon":
                result = first_arg_ml/3785.412;
                break;

        }

        return result;
    }
}

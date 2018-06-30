package com.example.rebelbob11.juneassignment.converters;

public class converterArea {
    private String from_arg,to_arg;
    private  Double first_arg;

    private Integer first_arg_int;

    public converterArea(String from_arg, String to_arg, Double first_arg) {
        this.from_arg = from_arg;
        this.to_arg = to_arg;
        this.first_arg = first_arg;
    }

    public converterArea(String from_arg, String to_arg, Integer first_arg_int) {
        this.from_arg = from_arg;
        this.to_arg = to_arg;
        this.first_arg_int = first_arg_int;
    }


    public Double convert(){

        //Declaring variables
        Double result=0.0;
        Double first_arg_m = 0.0;

        //switch statement to convert first argument to millimeters
        switch (from_arg){
            case "Sq. Millimeter":
                first_arg_m = first_arg*0.000001;
                break;
            case "Sq. Centimeter":
                first_arg_m = first_arg*0.0001;
                break;
            case "Sq. Meter":
                first_arg_m = first_arg*1;
                break;
            case "Sq. Kilometer":
                first_arg_m = first_arg*1000000;
                break;
            case "Sq. Mile":
                first_arg_m = first_arg*2589988.11;
                break;

        }


        switch (to_arg){

            case "Sq. Millimeter":
                result = first_arg_m*1000000;
                break;
            case "Sq. Centimeter":
                result = first_arg_m*10000;
                break;
            case "Sq. Meter":
                result = first_arg_m/1;
                break;
            case "Sq. Kilometer":
                result = first_arg_m/1000000;
                break;
            case "Sq. Mile":
                result = first_arg_m/2589988.11;
                break;

        }

        return result;
    }
}

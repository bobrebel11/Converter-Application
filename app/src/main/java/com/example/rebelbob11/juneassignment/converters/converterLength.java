package com.example.rebelbob11.juneassignment.converters;

public class converterLength {

    private String from_arg,to_arg;
    private  Double first_arg;

    private Integer first_arg_int;

    public converterLength(String from_arg, String to_arg, Double first_arg) {
        this.from_arg = from_arg;
        this.to_arg = to_arg;
        this.first_arg = first_arg;
    }

    public converterLength(String from_arg, String to_arg, Integer first_arg_int) {
        this.from_arg = from_arg;
        this.to_arg = to_arg;
        this.first_arg_int = first_arg_int;
    }


    public Double convert(){

        //Declaring variables
        Double result=0.0;
        Double first_arg_mm =0.0;

        //switch statement to convert first argument to millimeters
        switch (from_arg){
            case "Millimeter":
                first_arg_mm = first_arg*1;
                break;
            case "Centimeter":
                first_arg_mm = first_arg*10;
                break;
            case "Meter":
                first_arg_mm = first_arg*1000;
                break;
            case "Kilometer":
                first_arg_mm = first_arg*1000000;
                break;
            case "Mile":
                first_arg_mm = first_arg*1609340;
                break;

        }


        switch (to_arg){

            case "Millimeter":
                result = first_arg_mm;
                break;
            case "Centimeter":
                result = first_arg_mm/10;
                break;
            case "Meter":
                result = first_arg_mm/1000;
                break;
            case "Kilometer":
                result = first_arg_mm/1000000;
                break;
            case "Mile":
                result = first_arg_mm/1609340;
                break;

        }

        return result;
    }
}

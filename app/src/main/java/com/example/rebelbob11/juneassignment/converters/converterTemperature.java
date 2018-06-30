package com.example.rebelbob11.juneassignment.converters;

public class converterTemperature {

    private String from_arg,to_arg;
    private  Double first_arg;

    private Integer first_arg_int;

    public converterTemperature(String from_arg, String to_arg, Double first_arg) {
        this.from_arg = from_arg;
        this.to_arg = to_arg;
        this.first_arg = first_arg;
    }

    public converterTemperature(String from_arg, String to_arg, Integer first_arg_int) {
        this.from_arg = from_arg;
        this.to_arg = to_arg;
        this.first_arg_int = first_arg_int;
    }


    public Double convert(){

        //Declaring variables
        Double result=0.0;
        Double first_arg_celcius = 0.0;

        //switch statement to convert first argument to millimeters
        switch (from_arg){
            case "Celcius":
                first_arg_celcius = first_arg*1;
                break;
            case "Kelvin":
                first_arg_celcius = first_arg-273.15;
                break;
            case "Fahrenheit":
                first_arg_celcius = (first_arg-32)*0.5556;
                break;

        }


        switch (to_arg){

            case "Celcius":
                result = first_arg_celcius;
                break;
            case "Kelvin":
                result = first_arg_celcius+273.15;
                break;
            case "Fahrenheit":
                result = (first_arg_celcius/0.556)+32;
                break;

        }

        return result;
    }
}

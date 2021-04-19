package com.example.quantitymeasurement;

public class TemperatureType {
    public String result = "";
    public String calculate(int inputValue, String fromUnit, String toUnit) {
        double a = 0.55;
        double b = 1.8;

        if(fromUnit.equals(toUnit)) {
            result = String.format("%f",inputValue);
        } else if(fromUnit.equals("Celsius") && toUnit.equals("Fahrenheit")) {
            double calculation = (inputValue*b) + 32;
            result = String.format("%f",calculation);
        } else if(fromUnit.equals("Fahrenheit") && toUnit.equals("Celsius")) {
            double calculation = (inputValue-32) * a;
            result = String.format("%f",calculation);
        } else{
        }
        return result;
    }
}
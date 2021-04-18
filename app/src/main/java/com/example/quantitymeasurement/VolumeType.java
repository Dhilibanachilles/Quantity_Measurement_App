package com.example.quantitymeasurement;

public class VolumeType {
    public String result = "";
    public String calculate(int inputValue, String fromUnit, String toUnit) {
        double a = 0.001;
        double b = 1000;

        if(fromUnit.equals(toUnit)){
            result = String.format("%f",inputValue);
        }
        else if(fromUnit.equals("Milliliter") && toUnit.equals("Liter")){
            double calculation = inputValue * a;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Liter") && toUnit.equals("Milliliter")){
            double calculation = inputValue * b;
            result = String.format("%f",calculation);
        }
        else{
        }
        return result;
    }
}
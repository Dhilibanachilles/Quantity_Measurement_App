package com.example.quantitymeasurement;

public class WeightType {
    public String result = "";
    public String calculate(double inputValue, String fromUnit, String toUnit) {
        double a = 0.001;
        double b = 1000;
        double c = 100000;
        double d = 0.000001;

        if(fromUnit.equals(toUnit)){
            result = String.format("%f",inputValue);
        }
        else if(fromUnit.equals("Ton") && toUnit.equals("Kilogram")){
            double calculation = inputValue * b;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Ton") && toUnit.equals("Gram")){
            double calculation = inputValue * c;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Kilogram") && toUnit.equals("Ton")){
            double calculation = inputValue * a;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Kilogram") && toUnit.equals("Gram")){
            double calculation = inputValue * b;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Gram") && toUnit.equals("Ton")){
            double calculation = inputValue * d;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Gram") && toUnit.equals("Kilogram")){
            double calculation = inputValue * a;
            result = String.format("%f",calculation);
        }
        else{
        }
        return result;
    }
}
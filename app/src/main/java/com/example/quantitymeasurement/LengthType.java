package com.example.quantitymeasurement;

public class LengthType {
    public String result = "";
    public String calculate(double inputValue, String fromUnit, String toUnit) {
        double a = 0.001;
        double b = 1000;

        if(fromUnit.equals(toUnit)){
            result = String.format("%f",inputValue);
        }
        else if(fromUnit.equals("Kilometer") && toUnit.equals("Meter")){
            double calculation = inputValue * b;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Kilometer") && toUnit.equals("Feet")){
            double calculation = inputValue * 3280.84;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Kilometer") && toUnit.equals("Inch")){
            double calculation = inputValue * 39370.1;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Meter") && toUnit.equals("Kilometer")){
            double calculation = inputValue * a;
            result = String.format("%f",calculation);
        } else if(fromUnit.equals("Meter") && toUnit.equals("Feet")){
            double calculation = inputValue * 3.28084;
            result = String.format("%f",calculation);
        }
        else if( fromUnit.equals("Meter") && toUnit.equals("Inch")) {
            double calculation = inputValue * 39.3701;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Feet") && toUnit.equals("Kilometer")){
            double calculation = inputValue * 0.0003048;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Feet") && toUnit.equals("Meter")){
            double calculation = inputValue * 0.3048;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Feet") && toUnit.equals("Inch")) {
            double calculation = inputValue * 12;
            result = String.format("%f", calculation);
        }
        else if(fromUnit.equals("Inch") && toUnit.equals("Kilometer")){
            double calculation = inputValue * 0.0000254;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Inch") && toUnit.equals("Meter")){
            double calculation = inputValue * 0.0254;
            result = String.format("%f",calculation);
        }
        else if(fromUnit.equals("Inch") && toUnit.equals("Kilogram")) {
            double calculation = inputValue * 0.083333;
            result = String.format("%f", calculation);
        }
        else{
        }
        return result;
    }
}

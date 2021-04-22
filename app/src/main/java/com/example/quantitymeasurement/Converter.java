package com.example.quantitymeasurement;

import java.text.DecimalFormat;

public class Converter {
    public double result;
    UnitClass unit;
    public String calculateOutput(int inputValue, String selectedType, String fromUnit, String toUnit) {

        switch(selectedType) {
            case "Temperature":
                TemperatureType temperature = new TemperatureType();
                result = Double.parseDouble(temperature.calculate(inputValue, fromUnit, toUnit));
                break;
            default:
                UnitClass fromType = unit.valueOf(fromUnit);
                UnitClass toType = unit.valueOf(toUnit);
                result = fromType.convertToBase(inputValue);
                result = toType.convertToAnother(result);
        }
        return String.valueOf(new DecimalFormat("0.0000").format(result));
    }
}
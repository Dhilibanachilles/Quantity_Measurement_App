package com.example.quantitymeasurement;

public class Converter {
    public String result = "";
    public String calculateOutput(int inputValue, String selectedType, String fromUnit, String toUnit) {

        switch(selectedType) {
            case "Weight":
                WeightType weight = new WeightType();
                result = weight.calculate(inputValue, fromUnit, toUnit);
                break;
            case "Length":
                LengthType length = new LengthType();
                result = length.calculate(inputValue, fromUnit, toUnit);
                break;
            case "Volume":
                VolumeType volume = new VolumeType();
                result = volume.calculate(inputValue, fromUnit, toUnit);
                break;
            case "Temperature":
                TemperatureType temperature = new TemperatureType();
                result = temperature.calculate(inputValue, fromUnit, toUnit);
                break;
        }
        return result;
    }
}
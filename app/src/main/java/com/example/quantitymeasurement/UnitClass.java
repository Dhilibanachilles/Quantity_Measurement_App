package com.example.quantitymeasurement;

public enum UnitClass {
    Inch(1),
    Feet(12),
    Meter(39.37),
    Kilometer(39370),
    Milliliter(1),
    Liter(1000),
    Gram(1),
    Kilogram(1000),
    Ton(100000);

    private double conversionFactor;

    UnitClass(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double value) {
        return value * conversionFactor;
    }

    public double convertToAnother(double value) {
        return value / conversionFactor;
    }
}

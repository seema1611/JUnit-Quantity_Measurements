package com.quantitymeasurement.measure;

public enum Units {
    //Units of Length
    FEET(1 * 12.0), INCH(1.0), YARD(1 * 36.0), CM(1 / 2.54),

    //Units Of Volume
    GALLON(1 * 3780.0), LITRE(1 * 1000.0), ML(1.0),

    //Units of Weight
    KG(1.0), GRAMS(1.0 / 1000.0), TONNE(1.0 * 1000.0),

    //Units Of Weight
    F(1.0), C(1.8);

    public double unitType;

    Units(double unit) {
        unitType = unit;
    }
}
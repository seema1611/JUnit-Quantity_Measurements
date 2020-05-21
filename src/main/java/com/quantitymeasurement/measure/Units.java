package com.quantitymeasurement.measure;

public enum Units {
    //Units of Length
    INCH(1.0), FEET(1 * 12.0), YARD(1 * 36.0), CM(1 / 2.54),

    //Units Of Volume
    ML(1.0), GALLON(1 * 3780.0), LITRE(1 * 1000.0);

    public double unitType;

    Units(double unit) {
        unitType = unit;
    }
}


package com.quantitymeasurement.measure;

public enum Units {
    //Units of Length
    FEET(1 * 12.0);

    public double unitType;

    Units(double unit) {
        unitType = unit;
    }
}


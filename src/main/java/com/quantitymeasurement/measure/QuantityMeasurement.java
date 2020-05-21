package com.quantitymeasurement.measure;

import java.util.Objects;

public class QuantityMeasurement {
    private double value;
    private Units unitType;

    public double getUnitConversionOutput(double value, Units unitType) {
        return value * unitType.unitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                unitType == that.unitType;
    }
}
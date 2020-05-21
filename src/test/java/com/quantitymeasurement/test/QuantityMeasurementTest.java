package com.quantitymeasurement.test;

import com.quantitymeasurement.measure.QuantityMeasurement;
import com.quantitymeasurement.measure.Units;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    //UC-1----FEET----
    @Test
    public void givenZeroFeetAndZeroFeet_WhenEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(0.0, Units.FEET);
        double feet2 = quantityMeasurement.getUnitConversionOutput(0.0, Units.FEET);
        Assert.assertEquals(feet1, feet2, 0.0);
    }
}
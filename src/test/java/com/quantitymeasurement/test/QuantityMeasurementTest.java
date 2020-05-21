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

    @Test
    public void givenZeroFeetAndAnotherFeet_WhenNotEqual_ShouldReturnFalse() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(0.0, Units.FEET);
        double feet2 = quantityMeasurement.getUnitConversionOutput(6.0, Units.FEET);
        Assert.assertNotEquals(feet1, feet2, 0.0);
    }

    @Test
    public void givenFeetValue_WhenNull_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReferenceObjectForFeet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenReferenceObjectForFeet_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurementTest quantityMeasurementTest = new QuantityMeasurementTest();
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurementTest);
    }

    @Test
    public void givenTwoFeetValue_WhenEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(5.0, Units.FEET);
        double feet2 = quantityMeasurement.getUnitConversionOutput(5.0, Units.FEET);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void givenTwoDifferentFeetValue_WhenNotEqual_ShouldReturnFalse() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(8.0, Units.FEET);
        double feet2 = quantityMeasurement.getUnitConversionOutput(5.0, Units.FEET);
        Assert.assertNotEquals(feet1, feet2, 0.0);
    }

    //UC-1----INCH----
    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(0.0, Units.INCH);
        double inch2 = quantityMeasurement.getUnitConversionOutput(0.0, Units.INCH);
        Assert.assertEquals( inch1, inch2, 0.0);
    }

    @Test
    public void givenTwoInchValue_WhenNotEqual_ShouldReturnFalse() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(0.0, Units.INCH);
        double inch2 = quantityMeasurement.getUnitConversionOutput(1.0, Units.INCH);
        Assert.assertNotEquals( inch1, inch2, 0.0);
    }

    @Test
    public void givenTwoDifferentType_WhenNotEqual_ShouldReturnFalse() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(8.0, Units.FEET);
        double inch1 = quantityMeasurement.getUnitConversionOutput(8.0, Units.INCH);
        Assert.assertNotEquals(feet1, inch1, 0.0);
    }

    @Test
    public void givenTwoSameInchValue_WhenEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(7.0, Units.INCH);
        double inch2 = quantityMeasurement.getUnitConversionOutput(7.0, Units.INCH);
        Assert.assertEquals( inch1, inch2, 0.0);
    }

    @Test
    public void givenTwoDifferentInchValue_WhenNotEqual_ShouldReturnFalse() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(5.0, Units.INCH);
        double inch2 = quantityMeasurement.getUnitConversionOutput(9.0, Units.INCH);
        Assert.assertNotEquals( inch1, inch2, 0.0);
    }

    @Test
    public void givenZeroFeetAndZeroInch_WhenEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(0.0, Units.FEET);
        double inch1 = quantityMeasurement.getUnitConversionOutput(0.0, Units.INCH);
        Assert.assertEquals(feet1, inch1, 0.0);
    }

    @Test
    public void givenOneFeetOneInch_WhenNotEqual_ShouldReturnFalse() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.FEET);
        double inch1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.INCH);
        Assert.assertNotEquals(feet1, inch1, 0.0);
    }

    @Test
    public void givenOneInchAndOneFeet_WhenNotEqual_ShouldReturnFalse() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.INCH);
        double feet1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.FEET);
        Assert.assertNotEquals( inch1, feet1, 0.0);
    }

    @Test
    public void givenOneFeetAndTwelveInch_WhenEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.FEET);
        double inch1 = quantityMeasurement.getUnitConversionOutput(12.0, Units.INCH);
        Assert.assertEquals( feet1, inch1, 0.0);
    }

    @Test
    public void givenTwelveInchAndOneFeet_WhenEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(12.0, Units.INCH);
        double feet1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.FEET);
        Assert.assertEquals( inch1, feet1, 0.0);
    }

    //UC-2----Yard----
    @Test
    public void givenThreeFeetAndOneYard_WhenEqual_ShouldReturnTrue() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(3.0, Units.FEET);
        double yard1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.YARD);
        Assert.assertEquals( feet1, yard1, 0.0);
    }

    @Test
    public void givenOneFeetAndOneYard_WhenNotEqual_ShouldReturnFalse() {
        double feet1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.FEET);
        double yard1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.YARD);
        Assert.assertNotEquals(  feet1, yard1, 0.0);
    }

    @Test
    public void givenOneInchAndOneYard_WhenNotEqual_ShouldReturnFalse() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.INCH);
        double yard1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.YARD);
        Assert.assertNotEquals( inch1, yard1, 0.0);
    }

    @Test
    public void givenOneYardAndThirtySixInch_WhenEqual_ShouldReturnTrue() {
        double yard1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.YARD);
        double inch1 = quantityMeasurement.getUnitConversionOutput(36.0, Units.INCH);
        Assert.assertEquals( yard1, inch1, 0.0);
    }

    @Test
    public void givenThirtySixInchAndOneYard_WhenEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(36.0, Units.INCH);
        double yard1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.YARD);
        Assert.assertEquals( inch1, yard1, 0.0);
    }

    @Test
    public void givenOneYardAndThreeFeet_WhenEqual_ShouldReturnTrue() {
        double yard1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.YARD);
        double feet1 = quantityMeasurement.getUnitConversionOutput(3.0, Units.FEET);
        Assert.assertEquals( yard1, feet1, 0.0);
    }

    //UC-3----CentiMeters----
    @Test
    public void givenTwoInchAndFiveCm_WhenEqual_ShouldReturnTrue() {
        double inch1 = quantityMeasurement.getUnitConversionOutput(2.0, Units.INCH);
        double cm1 = quantityMeasurement.getUnitConversionOutput(5.0, Units.CM);
        Assert.assertEquals( inch1, cm1, 1.0);
    }

    //UC-4----Addition In Inches----
    @Test
    public void givenTwoInchesAndTwoInch_WhenAdded_ShouldReturnCorrectAddition() {
        double output = 4.0;
        double inch1 = quantityMeasurement.getUnitConversionOutput(2.0, Units.INCH);
        double inch2 = quantityMeasurement.getUnitConversionOutput(2.0, Units.INCH);
        Assert.assertEquals(output, inch1 + inch2, 1.0);
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenAdded_ShouldReturnCorrectAddition() {
        double output = 14.0;
        double feet1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.FEET);
        double inch1 = quantityMeasurement.getUnitConversionOutput(2.0, Units.INCH);
        Assert.assertEquals(output,feet1 + inch1, 1.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_ShouldReturnCorrectAddition() {
        double output = 24.0;
        double feet1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.FEET);
        double feet2 = quantityMeasurement.getUnitConversionOutput(1.0, Units.FEET);
        Assert.assertEquals(output, feet1 + feet2, 1.0);
    }

    @Test
    public void givenTwoInchAndTwoPtFiveCm_WhenAdded_ShouldReturnCorrectAddition() {
        double output = 3.0;
        double inch1 = quantityMeasurement.getUnitConversionOutput(2.0, Units.INCH);
        double cm1 = quantityMeasurement.getUnitConversionOutput(2.5, Units.CM);
        Assert.assertEquals(output, inch1 + cm1, 1.0);
    }

    //UC-5----Volumes----
    @Test
    public void givenOneGallonAndThreePtSevenEightLtrs_WhenEqual_ShouldReturnTrue() {
        double gallon1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.GALLON);
        double litre1 = quantityMeasurement.getUnitConversionOutput(3.78, Units.LITRE);
        Assert.assertEquals( gallon1, litre1, 0.0);
    }

    @Test
    public void givenOneLiterAndThousandMl_WhenEqual_ShouldReturnTrue() {
        double litre1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.LITRE);
        double ml1 = quantityMeasurement.getUnitConversionOutput(1000.0, Units.ML);
        Assert.assertEquals( litre1, ml1, 1.0);
    }

    //UC-6----Add Volumes----
    @Test
    public void givenOneGallonAddThreePtSevenEightLtrs_WhenEqual_ShouldReturnTrue() {
        double output = 7560.0;
        double gallon1 = quantityMeasurement.getUnitConversionOutput(1, Units.GALLON);
        double litre1 = quantityMeasurement.getUnitConversionOutput(3.78, Units.LITRE);
        Assert.assertEquals(output, gallon1 + litre1, 1.0);
    }

    @Test
    public void givenOneLiterAddThousandMl_WhenEqual_ShouldReturnTrue() {
        double output = 2000.0;
        double litre1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.LITRE);
        double ml1 = quantityMeasurement.getUnitConversionOutput(1000.0, Units.ML);
        Assert.assertEquals(output, litre1 + ml1, 1.0);
    }

    //UC-7----Weights in gram----
    @Test
    public void givenOneKgAndThousandGrams_WhenEqual_ShouldReturnTrue() {
        double kg1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.KG);
        double gram1 = quantityMeasurement.getUnitConversionOutput(1000.0, Units.GRAMS);
        Assert.assertEquals( kg1, gram1, 0.0);
    }

    @Test
    public void givenOneTonneAndThousandKg_WhenEqual_ShouldReturnTrue() {
        double tonne1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.TONNE);
        double kg1 = quantityMeasurement.getUnitConversionOutput(1000.0, Units.KG);
        Assert.assertEquals( tonne1, kg1, 0.0);
    }

    @Test
    public void givenOneTonneAddThousandGrams_WhenEqual_ShouldReturnTrue() {
        double output = 1001;
        double tonne1 = quantityMeasurement.getUnitConversionOutput(1.0, Units.TONNE);
        double gram1 = quantityMeasurement.getUnitConversionOutput(1000.0, Units.GRAMS);
        Assert.assertEquals(output, tonne1 + gram1, 0.0);
    }

    //UC-8----Temperature----
    @Test
    public void given212FAnd100C_WhenEqual_ShouldReturnTrue() {
        double f1 = quantityMeasurement.getUnitConversionOutput(212.0, Units.F);
        double c1 = quantityMeasurement.getUnitConversionOutput(100.0, Units.C);
        Assert.assertEquals( f1, c1, 0.0);
    }

    @Test
    public void given100CAnd212F_WhenEqual_ShouldReturnTrue() {
        double c1 = quantityMeasurement.getUnitConversionOutput(100.0, Units.C);
        double f1 = quantityMeasurement.getUnitConversionOutput(212.0, Units.F);
        Assert.assertEquals( c1, f1, 0.0);
    }
}
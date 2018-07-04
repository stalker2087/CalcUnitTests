package com.epam.cdp.calc_unit_tests.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalcTestDouble extends PreConditionForTestngTests {


    @Test(dataProvider = "valuesForMultTest", groups = "Smoke")
    public void multTest(double a, double b, double expectedResult) {
        double actualResult = calculator.mult(a, b);
        Assert.assertEquals(actualResult, expectedResult, "Mult operation is incorrect: " + a + " * " + b + " = " + actualResult);
    }

    @DataProvider
    public Object[][] valuesForMultTest() {
        return new Object[][]{
                {1.11, 1.11, 1.2321},
                {1.0, 2.0, 2.0},
                {-1.11, 1.11, -1.2321},
        };
    }
}

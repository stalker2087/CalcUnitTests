package com.epam.cdp.calc_unit_tests.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalcTestLong extends PreConditionForTestngTests {


    @Test(dataProvider = "valuesForMultTest", groups = "Smoke")
    public void multTest(long a, long b, long expectedResult) {
        long actualResult = calculator.mult(a, b);
        Assert.assertEquals(actualResult, expectedResult, "Mult operation is incorrect: " + a + " * " + b + " = " + actualResult);
    }

    @DataProvider
    public Object[][] valuesForMultTest() {
        return new Object[][]{
                {1, 1, 1},
                {2, 2, 4},
                {-2, 5, -10},
                {-2, -5, 10},
                {5, 0, 0},
                {0, 0, 0}
        };
    }

}

package com.epam.cdp.calc_unit_tests.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalcTestDouble extends PreConditionForTestngTests {


    @Test(dataProvider = "valuesForSqrtTest")
    public void sqrtTest(double a, double expectedResult) {
        double actualResult = calculator.sqrt(a);
        Assert.assertEquals(actualResult, expectedResult, "Sqrt operation is incorrect: Sqrt" + a + " = " + actualResult);
    }

    @Test(expectedExceptions = Exception.class)
    public void sqrtTest() {
        double actualResult = calculator.sqrt(-4);

    }

    @DataProvider
    public Object[][] valuesForSqrtTest() {
        return new Object[][]{
                {4, 2},
                {0, 0},
                {2.25, 1.5}

        };
    }


}

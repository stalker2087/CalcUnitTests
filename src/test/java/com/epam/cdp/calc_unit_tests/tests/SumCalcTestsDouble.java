package com.epam.cdp.calc_unit_tests.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;

@RunWith(DataProviderRunner.class)
public class SumCalcTestsDouble extends PreConditionForJunitTests {


    @Test
    @UseDataProvider("valuesForSumTest")
    public void sumTest(double a, double b, double expectedResult) {
        double actualResult = calculator.sum(a, b);
        Assert.assertEquals("Sum operation is incorrect: " + a + " + " + b + " = " + actualResult, actualResult, expectedResult, 0);

    }


    @DataProvider
    public static Object[][] valuesForSumTest() {
        return new Object[][]{
                {1.25, 1.15, 2.4},
                {1, 1.5, 2.5},
                {1.0, 2.0, 3.0},
                {1.11111, 2.22222, 3.33333}

        };
    }

}

package com.epam.cdp.CalcUnitTests.Tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;

@RunWith(DataProviderRunner.class)
public class DivCalcTestLong extends preConditionForJunitTests {


    @Test
    @UseDataProvider("valuesForDivTest")
    public void divTest(long a, long b, long expectedResult) {
        long actualResult = calculator.div(a, b);
        Assert.assertEquals("Div operation is incorrect: " + a + " / " + b + " = " + actualResult, actualResult, expectedResult);

    }

    @Test(expected = ArithmeticException.class)
    public void divByZeroTest() {
        long actualResut = calculator.div(1, 0);
    }


    @DataProvider
    public static Object[][] valuesForDivTest() {
        return new Object[][]{
                {10, 2, 5},
                {-10, 2, -5},
                {10, -2, -5},
                {-5,-2,2},
                {1, 1, 1},
                {0, 1, 0},
                {5, 2, 2}

        };
    }

}

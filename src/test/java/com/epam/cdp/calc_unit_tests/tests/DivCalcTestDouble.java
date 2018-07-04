package com.epam.cdp.calc_unit_tests.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;

@RunWith(DataProviderRunner.class)
public class DivCalcTestDouble extends PreConditionForJunitTests {

    @Test
    @UseDataProvider("valuesForDivTest")
    public void divTest(double a, double b, double expectedResult) {
        double actualResult = calculator.div(a, b);
        Assert.assertEquals("Div operation is incorrect: " + a + " / " + b + " = " + actualResult, actualResult, expectedResult, 0);

    }

    @Test(expected = ArithmeticException.class)
    public void divByZeroTest() {
        long actualResut = calculator.div(1, 0);
    }


    @DataProvider
    public static Object[][] valuesForDivTest() {
        return new Object[][]{
                {5, 2, 2.5},
                {-5, 2, -2.5},
                {0, 2.5, 0},
                {2.5, 2.5, 1},
                {25.5, 2.5, 10.2}

        };
    }

}

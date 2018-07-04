package com.epam.cdp.CalcUnitTests.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class PowCalcTestDouble extends preConditionForTestNGTests {

    @Test(dataProvider="valuesForPowTest")
    public void powTest(double a, double n,double expectedResult){
        double actualResult = calculator.pow(a, n);
        Assert.assertEquals(actualResult,expectedResult, "Pow operation is incorrect: " + a + "^" + n + " = " + actualResult);
    }

    @Test(dataProvider="valuesForPowTestNegative", expectedExceptions = Exception.class)
    public void powNegativeTest(double a, double n){
        double actualResult = calculator.pow(a, n);
    }

    @DataProvider
    public Object[][] valuesForPowTest() {
        return new Object[][]{
                {2, 3, 8},
                {-2, 3, -8},
                {2, -3, 0.125},
                {-2, -3, -0.125},
                {2.5, 3, 15.625},
                {2.5, 2.5, 9.8821176880262},
                {2, 2.5, 5.656854249492381},
                {2.2, -2.2, 0.1764696816352779}
        };
    }

        @DataProvider
        public Object[][] valuesForPowTestNegative(){
            return new Object[][]{
                    {-2.2,2.2},
                    {-2.2,-2.2}
            };
    }

}

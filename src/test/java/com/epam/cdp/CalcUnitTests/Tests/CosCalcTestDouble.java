package com.epam.cdp.CalcUnitTests.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalcTestDouble extends preConditionForTestNGTests {

    @Test(dataProvider = "valuesForCosTest")
    public void sinTest(double a, double expectedResult) {
        double actualResult = calculator.cos(a);
        Assert.assertEquals(actualResult, expectedResult, "Cos operation is incorrect: Cos " + a +  " = " + actualResult);
    }

    @DataProvider
    public Object[][] valuesForCosTest() {
        return new Object[][]{
                {0, 1},
                {1,0.5143952585235492},
                {-1,0.5143952585235492}

        };
    }

    public static class CalcTestsRunner {
    }
}

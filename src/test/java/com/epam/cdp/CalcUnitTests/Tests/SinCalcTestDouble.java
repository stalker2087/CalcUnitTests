package com.epam.cdp.CalcUnitTests.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalcTestDouble extends preConditionForTestNGTests {


    @Test(dataProvider = "valuesForSinTest")
    public void sinTest(double a, double expectedResult) {
        double actualResult = calculator.sin(a);
        Assert.assertEquals(actualResult, expectedResult, "Sin operation is incorrect: Tg " + a +  " = " + actualResult);
    }

    @DataProvider
    public Object[][] valuesForSinTest() {
        return new Object[][]{
                {0, 0},
                {1,0.8414709848078965},
                {-1,-0.8414709848078965}

        };
    }

}

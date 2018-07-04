package com.epam.cdp.CalcUnitTests.Tests;

import org.junit.rules.ExpectedException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgCalcTestDouble extends preConditionForTestNGTests {


    @Test(dataProvider = "valuesForCtgTest")
    public void ctgTest(double a, double expectedResult) {
        double actualResult = calculator.ctg(a);
        Assert.assertEquals(actualResult, expectedResult, "Ctg operation is incorrect: Ctg " + a +  " = " + actualResult);
    }

    @Test(expectedExceptions = java.lang.Exception.class)
    public void ctgTestNegative() {
        double actualResult = calculator.ctg(0);

    }

    @DataProvider
    public Object[][] valuesForCtgTest() {
        return new Object[][]{
                {1, 0.64209261593433},
                {-10, -1.5423510453569}

        };
    }

}

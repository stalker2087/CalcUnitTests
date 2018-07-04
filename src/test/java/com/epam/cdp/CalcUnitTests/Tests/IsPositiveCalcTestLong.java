package com.epam.cdp.CalcUnitTests.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveCalcTestLong extends preConditionForTestNGTests {

    @Test(dataProvider = "valuesForIsPositiveTest")
    public void isPositiveTest(long a, boolean expectedResult) {
        boolean actualResult = calculator.isPositive(a);
        Assert.assertEquals(actualResult, expectedResult, a +  "  value detected as " + actualResult);
    }

    @DataProvider
    public Object[][] valuesForIsPositiveTest() {
        return new Object[][]{
                {0, false},
                {1,true},
                {-1,false}

        };
    }

}

package com.epam.cdp.CalcUnitTests.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubCalcTestLong extends preConditionForTestNGTests {


    @Parameters({"a","b","Result"})
    @Test(/*dataProvider="valuesForSubTest",*/ groups = "Smoke")
    public void subTest(long a, long b, long expectedResult){
        long actualResult = calculator.sub(a,b);
        Assert.assertEquals(actualResult,expectedResult, "Sub operation is incorrect: " + a + " - " + b + " = " + actualResult);
    }

  /*  @DataProvider
    public Object[][] valuesForSubTest(){
        return new Object[][]{
                {5, 1, 4},
                {1, 1, 0},
                {-1, 1, -2},
                {-1, -1, 0},
                {1,-1,2},
                {0,-1,1},
                {1,0,1},
                {-1,0,-1},
                {0,0,0}
        };
    }*/

}

package com.epam.cdp.CalcUnitTests.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalcTestDouble extends preConditionForTestNGTests {


    @Test(dataProvider="valuesForSubTest", groups = "Smoke")
    public void subTest(double a, double b, double expectedResult){
        double actualResult = calculator.sub(a,b);
        Assert.assertEquals(actualResult,expectedResult, "Sub operation is incorrect: " + a + " - " + b + " = " + actualResult);
    }

    @DataProvider
    public Object[][] valuesForSubTest(){
        return new Object[][]{
                {1.25,0.05,1.2},
                {1.25,1.5,-0.25},
                {1.22222,0.11111,1.11111}
         };
    }

}

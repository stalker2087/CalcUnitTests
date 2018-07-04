package com.epam.cdp.CalcUnitTests.Tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;

@RunWith(DataProviderRunner.class)
public class SumCalcTestsLong extends preConditionForJunitTests {

    @Test
    @UseDataProvider("valuesForSumTest")
    public void sumTest(long a, long b, long expectedResult){
        long actualResult = calculator.sum(a,b);
        Assert.assertEquals("Sum operation is incorrect: " + a +" + " + b + " = " + actualResult,actualResult,expectedResult);

    }


    @DataProvider
    public static Object[][] valuesForSumTest(){
        return new Object[][]{
                {5,3,8},
                {-1,5,4},
                {1,-5,-4},
                {0,1,1},
                {1,0,1},
                {0,0,0},
                {-1,1,0}
        };
    }



}

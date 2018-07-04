package com.epam.cdp.calc_unit_tests.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgCalcTestDouble extends PreConditionForTestngTests {


    @Test(dataProvider = "valuesForTgTest")
    public void tgTest(double a, double expectedResult) {
        double actualResult = calculator.tg(a);
        Assert.assertEquals(actualResult, expectedResult, "Tg operation is incorrect: Tg " + a + " = " + actualResult);
    }

    @DataProvider
    public Object[][] valuesForTgTest() {
        return new Object[][]{
                {0, 0},
                {1, 1.5574077246549},
                {-10, -0.64836082745909},
                {10, Math.tan(10)}

        };
    }

}
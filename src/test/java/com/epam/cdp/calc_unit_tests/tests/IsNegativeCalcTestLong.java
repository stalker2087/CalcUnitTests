package com.epam.cdp.calc_unit_tests.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeCalcTestLong extends PreConditionForTestngTests {

    Calculator calculator;

    @BeforeClass
    public void preCondition() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "valuesForIsNegativeTest")
    public void isNegativeTest(long a, boolean expectedResult) {
        boolean actualResult = calculator.isNegative(a);
        Assert.assertEquals(actualResult, expectedResult, a + "  value detected as " + actualResult);
    }

    @DataProvider
    public Object[][] valuesForIsNegativeTest() {
        return new Object[][]{
                {0, false},
                {1, false},
                {-1, true}

        };
    }

}

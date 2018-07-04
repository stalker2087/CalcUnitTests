package com.epam.cdp.calc_unit_tests.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class PreConditionForTestngTests {

    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void preCondition() {
        calculator = new Calculator();
    }

    @AfterClass
    public void afterTest() {
        calculator = null;
    }

}

package com.epam.cdp.calc_unit_tests.tests;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class PreConditionForJunitTests {

    protected static Calculator calculator;

    @BeforeClass
    public static void preCondition() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void afterCondition() {
        calculator = null;
    }
}

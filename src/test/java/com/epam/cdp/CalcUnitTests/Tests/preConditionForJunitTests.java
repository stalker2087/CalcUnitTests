package com.epam.cdp.CalcUnitTests.Tests;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class preConditionForJunitTests {

    protected static Calculator calculator;

    @BeforeClass
    public static void preCondition(){
        calculator = new Calculator();
    }

    @AfterClass
    public static void afterCondition(){
        calculator = null;
    }
}

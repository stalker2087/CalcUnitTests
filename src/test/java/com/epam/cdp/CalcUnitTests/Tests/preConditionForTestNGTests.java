package com.epam.cdp.CalcUnitTests.Tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class preConditionForTestNGTests {

    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void preCondition(){
        calculator = new Calculator();
    }

    @AfterClass
    public void afterTest(){
        calculator = null;
    }

}

package listeners;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CalcTestListener implements ITestListener {

    static Logger logger_err = LogManager.getLogger(Level.ALL);


    public void onTestStart(ITestResult iTestResult) {

        logger_err.log(Level.INFO, iTestResult.getName() + "Start");

    }

    public void onTestSuccess(ITestResult iTestResult) {
        logger_err.log(Level.INFO, iTestResult.getName() + "End");
    }

    public void onTestFailure(ITestResult iTestResult) {
        logger_err.log(Level.INFO, iTestResult.getName() + "End");
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}

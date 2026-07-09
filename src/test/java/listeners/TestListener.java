package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import utilities.ScreenshotUtil;
import valueLabs.com.BaseClassVL;

public class TestListener extends BaseClassVL implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        ScreenshotUtil.captureScreenshot(driver, result.getName());

        System.out.println("Screenshot captured for : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println(result.getName() + " Passed");
    }

    @Override
    public void onStart(ITestContext context) {}

    @Override
    public void onFinish(ITestContext context) {}
}
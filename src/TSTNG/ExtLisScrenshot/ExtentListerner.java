package TSTNG.ExtLisScrenshot;

import TSTNG.ExtLisScrenshot.extentutil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static TSTNG.ExtentReport.screenshots.getScreenshot;


public class ExtentListerner extends Util implements ITestListener{

    static ExtentReports extent;
   ExtentTest test;

    //Before ----@Test-----before test method @Test
        public void onTestStart(ITestResult result)
        {
            test = extent.createTest(result.getMethod().getMethodName());
            //System.out.println("onTestStart");
        }

        public void onTestSuccess(ITestResult result)
        {
        test.pass("this test is passed");
            //System.out.println("onTestSuccess");
        }

    public void onTestFailure(ITestResult result) {
        test.info("this test is fail");
        test.fail(result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  System.out.println("onTestFailure");
    }

        public void onTestSkipped(ITestResult result)
        {
            test.pass("this test is skipped");
            test.skip(result.getThrowable());
            //System.out.println("onTestSkipped");
        }




        // before test tag <test>
        public void onStart(ITestContext context)
        {
            if(extent ==null)
            extent = extentutil.initExtentReport();

            System.out.println("onStart");
        }
        // after test tag <test>
        public void onFinish(ITestContext context)
        {
            extent.flush();
            //System.out.println("onFinish");
        }


    }


/*
1.copied my listener util and created new class extentlisteners
2.copied beforetest keyword of ExtentReportDemo1 part and created new extentutil classa and kept
3.Now in extentlisterner intiated extentreports method by connecting "extentutil" to intiat first before test tag.
4.next after util intiatiation ,we need to start @Test by going to ExtentReportDemo1.
like this
test = extent.createTest(result.getMethod().getMethodName());
 */

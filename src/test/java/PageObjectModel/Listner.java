package PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import itestlistner.Screenshot;
import itestlistner.scree;


public class Listner  implements ITestListener {

	   
    private ExtentReports extent;
    private ExtentTest test;
    public  WebDriver driver;

    @Override
    public void onStart(ITestContext context) {
        // Setting up Extent Report
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("janam/ExtentReport.html");
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Test Execution Report");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Tester", "Pankaj Bhavate");
        extent.setSystemInfo("os","wnidow");
        extent.setSystemInfo("date", "yyyy.MM.dd.HH.mm");
        driver = (WebDriver) context.getAttribute("WebDriver");
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.INFO, "Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed: " + result.getName());
        Object testObject = result.getInstance();
        driver = null;

        try {
           driver = (WebDriver) testObject.getClass().getField("driver").get(testObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        
         scree s = new scree();
  String screnns=      s.takeScreenshot(driver, result.getName());
  
	    test.addScreenCaptureFromPath("file://"+screnns);}
     

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test Failed: " + result.getName());
        test.log(Status.FAIL, result.getThrowable());
        Object testObject = result.getInstance();
        driver = null;

        try {
           driver = (WebDriver) testObject.getClass().getField("driver").get(testObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    if(driver!=null) {
        
            scree s = new scree();
  String screnns=      s.takeScreenshot(driver, result.getName());

	    test.addScreenCaptureFromPath("file:///"+screnns);}}

	

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test Skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
    // Method to Capture Screenshot

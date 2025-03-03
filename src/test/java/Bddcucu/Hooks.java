package Bddcucu;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import itestlistner.Screenshot;

public class Hooks {

	  public static ExtentReports extent;
	    public static ExtentTest test;
	    
	
	
	static  WebDriver driver;
	
	@Before
	public void set(Scenario scenario) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

         ExtentSparkReporter spark = new ExtentSparkReporter("janam/ExtentReport.html");
         spark.config().setDocumentTitle("Automation Report");
	       spark.config().setReportName("Test Execution Report");
	        spark.config().setTheme(Theme.STANDARD);

	        extent = new ExtentReports();
	        extent.attachReporter(spark);
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("QA", "Pankaj Bhavate");
	        extent.setSystemInfo("os","window");
	        extent.setSystemInfo("Framework", "Testng");
	        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.").format(new Date());
	        extent.setSystemInfo("date", timestamp);
       
         extent.attachReporter(spark);
        

         test = extent.createTest(scenario.getName());
 }
	
	
	public WebDriver getdriver() {
		return driver;
	}
	
	@After
	public void down(Scenario scenario) throws InterruptedException {
		Thread.sleep(2000);
		if (scenario.isFailed()) {
	            test.log(Status.FAIL, scenario.getName());
	            
	           
	              
		        Screenshot s = new Screenshot();
		  String screnns=      s.takeScreenshot(driver, scenario.getName());
	      
			    test.addScreenCaptureFromPath("file://"+screnns);
			
		     
	        } else {
	            test.log(Status.PASS,scenario.getName());}
		extent.flush();}}
	
	


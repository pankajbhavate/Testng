package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestNGListenerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class retrytest1 implements ITestListener {
	
	 WebDriver driver;
	 @BeforeMethod
	 public void m() {
		 WebDriverManager.chromedriver().setup();
		  driver =  new ChromeDriver();
		  driver.get("https://www.facebook.com/");
	 }
	@Test(retryAnalyzer = Retryanlyzer.class)
	public void t1() {
		
		  String expected = "Facebook – log in or shign up";
		   String actual = driver.getTitle();
		   System.out.println(actual);
		   Assert.assertEquals(expected, actual);
		  
	}
	@Test()
	public void t2() {
	WebElement  w =	driver.findElement(By.id("email"));
	   boolean b  = w.isDisplayed();
	   System.out.println(b);
		
		
		
		
	}
	@AfterMethod
	public void down() {
		driver.close();
		
	}
	
	
		
}

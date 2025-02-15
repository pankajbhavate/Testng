package Testng;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestNGListenerFactory;
import org.testng.TestException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Testngfeatures.Groups;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practise1 implements ITestListener {
	WebDriver driver;
  @Test(groups = "jj")
	public void set() {
	    ChromeOptions c = new ChromeOptions();
	    c.addArguments("headless");
		WebDriverManager.chromedriver().setup();
		 driver  = new ChromeDriver(c);
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://chatgpt.com/c/67a449d9-35f8-8011-bda3-8a3fea82e696");
	String m =	driver.findElement(By.xpath("//h1[text()=\"What can I help with?\"]")).getText();
	System.out.println(m);
  
 
  
 
	  driver.findElement(By.cssSelector("[data-placeholder=\"Message ChatGPT\"]")).sendKeys("treeguard");
  
  
  
  
  
	}}
	
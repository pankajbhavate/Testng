package Paralleltesting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel2 {

	WebDriver driver;
	@BeforeMethod
	public void t1() {
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}
	
		
	
		
	@Test()
	public void t2() throws InterruptedException {
		
		
		 driver.findElement(By.cssSelector("[alt=\"Top Offers\"]")).click();
		 Thread.sleep(2000);}
		 
		 @Test(priority = 0)
		 public void t3() {
		 driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();}
		// driver.navigate().back();
	@AfterMethod
	public void t4() {
		driver.close();
		
	}
	
	

	
        
	
}

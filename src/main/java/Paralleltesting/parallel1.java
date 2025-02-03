package Paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel1 {
	WebDriver driver;
	
	//@BeforeMethod
	public void set() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
		@Test
		public void user() {
			
			driver.findElement(By.id("email")).isDisplayed();
			
		}
		
		@Test
		public void pass() {
		driver.findElement(By.id("pass")).isDisplayed();}
		
		
//	@AfterMethod
//	public void down() {
//		driver.close();
//	}
//		
	
		
	}



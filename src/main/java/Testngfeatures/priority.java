package Testngfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class priority {
	WebDriver driver;
	@BeforeMethod
	public void stup() {
		WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 1,invocationCount = 4)
	public void usern() {
	
	boolean b =	driver.findElement(By.cssSelector("[id=\"emajil\"]")).isDisplayed();
	System.out.println(b);
		
	}
	@Test()
	public void pass() throws InterruptedException {
	driver.findElement(By.id("pass")).sendKeys("9999889");
		Thread.sleep(2000);
	}	
	@Test()
	public void log() {
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		
	}
	
	@AfterMethod
	public void down() {
		
		driver.close();
	}
	
	
	
	
	
	}
	




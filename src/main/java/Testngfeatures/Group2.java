package Testngfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group2 {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(groups = "login")
	public void test() {    
	boolean b =	driver.findElement(By.id("email")).isDisplayed();
	System.out.println(b);}
	@Test(groups = "login")
	public void test2() {
	boolean c =	driver.findElement(By.id("pass")).isDisplayed();
	System.out.println(c);
	}
	 @Test(groups = "search")
	public void test3() {
		System.out.println("it s getitude");}
	
	@AfterMethod
	public void teardown() {
		
			
			driver.quit();
		
		
	}
	
       
	
	
}
	
	
	
		
		
		
		
		
	
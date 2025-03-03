package Testng;

import static org.testng.Assert.assertTrue;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class annotaions {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");}
	@Test
	public void test() {
	boolean b =	driver.findElement(By.cssSelector("[alt=\"Facebook\"]")).isDisplayed();
	//  assertTrue(false);
	System.out.println(b);}
	@Test
	public void gettext() {
	String ti = 	driver.getTitle();
	System.out.println(ti);
	}
	
	
	@Test
	public void aest1() {
		boolean e =driver.findElement(By.cssSelector("[class=\"_8eso\"]")).isEnabled();
		System.out.println(e);
		
	}
	@AfterClass
	public void method() {
		driver.close();}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		 
		 
		 
		 
	}
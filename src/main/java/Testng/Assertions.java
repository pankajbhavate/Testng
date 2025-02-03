package Testng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	
	
	WebDriver driver;
	@Parameters("url")
	@BeforeMethod
	public void set(String url) {
//		ChromeOptions   ch  = new ChromeOptions();
//		   ch.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	@Parameters("actual")
	@Test()
	public void t1(String actual) {
		//String actual =  "Facebook – log in or sign up";
		String expected =  driver.getTitle();
		Assert.assertEquals(actual, expected);
		  
	}

	  @Test
	  public void t2() {
	WebElement pass=	driver.findElement(By.id("pass"));
	pass.sendKeys("99999");
	  }
	  @Test
	  public void t3() {
		WebElement w =  driver.findElement(By.cssSelector("[type=\"submit\"]"));
		w.click();
		//  Assert.assertTrue(w.isDisplayed());
		
	   
		
		
		
	  
		
		
		
	}
	

}

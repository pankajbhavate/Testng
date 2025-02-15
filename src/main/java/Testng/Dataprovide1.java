package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovide1 {
	WebDriver driver;
	
	
	@BeforeMethod
	public void t1() {
		 WebDriverManager.chromedriver().setup();
		 driver  = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		
	}
	@Test(dataProvider = "ex")
	public void t1(String name,String pass) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(name);
	       String ex  = "facebook";
	       String act = driver.getTitle();
	     //  Assert.assertEquals(ex, act);
		
	Thread.sleep(2000);

	
		driver.findElement(By.id("pass")).sendKeys(pass);
	
	}
	@DataProvider(name = "ex")
	public String[][] data() {
		String da[][] =  new String[3][2];
		
		da[0][0] =   "aloknath";
		da[0][1] =   "22";
		
		da[1][0]  =  "hrushi";
		da[1][1] =   "44";
	
		da[2][0]  = "jagguda";
		da[2][1]  = "44";
		return da;
				
		
		
	}

}

package TestClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BDDCucumber.LoginPage;
import BDDCucumber.drivermanager;

public class Test1 extends tt {
	
	
	
	
	//WebDriver driver;
	@Test(retryAnalyzer = tt.class)
	public void test() {
		driver.findElement(By.id("alertexamples")).click();
	String m =	driver.findElement(By.xpath("//h1[text()=\"Alert Box Examples\"]")).getText();
	   driver.findElement(By.cssSelector("[onclick=\"sjhow_alert()\"]")).click();
	System.out.println(m);
	assertTrue(false);
	driver.findElement(By.id("alertexamples")).click();
	assertEquals(m,"Alert Box Examples");
		
	}

}

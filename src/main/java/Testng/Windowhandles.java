package Testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {
	
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/multiple-windows/");
		//driver.findElement(By.xpath("//button[text()=\"New Browser Window\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"New Browser Tab\"]")).click();
	Set<String> m  = 	driver.getWindowHandles();
	      Iterator<String>i =   m.iterator();
	                  String parent =  i.next();
	                  String child = i.next();
	            WebDriver w =      driver.switchTo().window(child);
	            
	
	
		driver.findElement(By.cssSelector("[id=\"nameInput\"]")).sendKeys("hi pankaj");
	
	}

}

package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pract {
	
	
	@Test
	public void tt() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.google.co.uk/");
		WebElement w = driver.findElement(By.cssSelector("[class=\"gLFyf\"]"));
		 w.sendKeys("sexy photo to the girl");
		 w.submit();
		 driver.findElement(By.cssSelector("[class=\"recaptcha-checkbox-border\"]")).click();
		
	
	}
	

}

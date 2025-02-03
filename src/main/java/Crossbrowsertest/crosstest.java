package Crossbrowsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crosstest {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void setup(String browser) {
		if(browser.equals("chrome")) {
         WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		}
	else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver  = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pankaj");
		driver.findElement(By.id("pass")).sendKeys("120200220");
			
		}
		 
		
	}



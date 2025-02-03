package Crossbrowsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cross1 {
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void set(String browser) {
		if(browser.equals("chrome")) {
		   WebDriverManager.chromedriver().setup();
		   driver =  new ChromeDriver();}
		
		else if(browser.equals("firefox")) {
		    WebDriverManager.firefoxdriver().setup();
		    driver =  new FirefoxDriver();}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
	
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		driver.findElement(By.cssSelector("[placeholder=\"First Name\"]")).sendKeys("pankaj");
		driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]")).sendKeys("bhavate");
		
		driver.close();
		
	}
		
	

}

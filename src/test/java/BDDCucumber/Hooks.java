package BDDCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	
    	
	 static   WebDriver driver;
	
	
	
	@Before
	public void sets() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	      
	}
	
	public WebDriver getdriver() {
		return driver;
	}
	
	@After
	public void down() {
		//driver.close();
		
	}
}

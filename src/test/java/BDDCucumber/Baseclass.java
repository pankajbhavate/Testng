package BDDCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	
	WebDriver driver;

	 public WebDriver initializeDriver() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	       return driver;
	    }

	  
	    public WebDriver getDriver() {
	        return driver;
    }

	  
	   public void dow() {
		   
	   }
}

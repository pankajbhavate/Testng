package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameter1 {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void set(String browser) {
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();}
		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			if(browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
		}
		
	
    
     testpage  tt   = new testpage(driver);
  
    
     tt.openapp();
      tt.fn(null);
      tt.ln(null);
      tt.phone(null);
      tt.close();
      
     
      
	}

     
     
     
}

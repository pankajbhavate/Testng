package BDDCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drivermanager {
	
	
	
	   WebDriver driver;

	 
           @BeforeClass
	    public WebDriver    getDriver() {
	       
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
	          return driver; 
	        
	    }
    @AfterClass
    public void dd() throws InterruptedException {
    	Thread.sleep(2000);
    //	driver.close();
    }
}

package PageObjectModel;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Dataprovider.Propertiesfi;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass  {
	
	Logger log;
	WebDriver driver;
	String fname;
	String pass;
	String urll;
	
//	
//	
	String lname;
	String email;
	String conpass;
	String username;
	String bio;
	public Baseclass() throws IOException {
		Propertiesfi p = new Propertiesfi();
		 username =p.username();
		 pass =  p.password();
		urll= p.url();
	 conpass=	p.confpass();
	 
	 bio=   p.biogra();
	   email=    p.email();
	fname=   p.fname();
	  lname= p.lname();
	
	}
	
	@BeforeMethod
	public void set() throws IOException {
		
	    
	         log = Logger.getLogger("Execute the test case");
	         PropertyConfigurator.configure("C:\\Users\\DELL\\eclipse-workspace\\TestNG\\src\\test\\resources\\logs\\log.properties");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log.info("open browser");

		driver.get(urll);
		driver.manage().window().maximize();
		log.info("screen is maximie");
		
		
	}
	@AfterMethod
	public void down() {
	//	driver.close();
		log.info("window is not closed");
		
		
	}

}

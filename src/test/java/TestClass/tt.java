package TestClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tt implements IRetryAnalyzer {

	int retry =0;
	int maxretry =3;

	//}
	WebDriver driver;
	@BeforeClass
	public void jj() {

		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
			
	}
	@AfterClass
	public void down() {
		driver.close();
	}
	@Override
	public boolean retry(ITestResult result) {
		
		if(retry<maxretry) {
			retry++;
			System.out.println(result.getName() +"is retry");
			return true;
			
		}
		
		return false;
	}

}

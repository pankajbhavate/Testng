package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Testng.testpage;

public class Testpage {
	
	WebDriver driver;
	public Testpage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
		
		
	}

}

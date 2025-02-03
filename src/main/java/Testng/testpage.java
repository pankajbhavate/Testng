package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testpage {
	
	WebDriver driver;
	@FindBy(css  = "[placeholder=\"First Name\"]")
	WebElement firestname;
	@FindBy(css = "[placeholder=\"Last Name\"]")
	WebElement lastname;
	@FindBy(css = "[type=\"tel\"]")
	WebElement phonenum;
	@FindBy(css= "[type=\"radio\"]")
	WebElement radio;

	public testpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void fn(String name) {
		firestname.sendKeys("pankaj");
	}
	public void ln(String name) {
		lastname.sendKeys("bhavate");
	}
	public void phone(String num) {
		phonenum.sendKeys("338838383");
	}
	public void radio() {
		radio.click();
	}
	public void openapp() {
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	public void close() {
		driver.close();
	}
	
	
		
		
		
		
		
		
	
	

}

package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Basepage extends Testpage {
	
	
	public Basepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
			
	@FindBy(css = "[data-label=\"Username\"]")
	WebElement username;
	
	@FindBy(id = "first_name")
	WebElement fname;
	
	@FindBy(css = "[data-label=\"Email\"]")
	WebElement email;
	
	@FindBy(name = "user_pass")
	WebElement passwo;
	
	@FindBy(name = "user_confirm_password")
	WebElement confmpass;
	
	@FindBy(id = "last_name")
	WebElement lastname;
	
	@FindBy(css = "[name=\"description\"]")
	WebElement bio;
	
	@FindBy(xpath  = "//button[@type=\"submit\"]")
	WebElement submit;

	
	public void username(String name) {
		username.sendKeys(name);
		}
	
	public void lname(String name) {
		lastname.sendKeys(name);}
	
	public void emailid(String emai) {
		email.sendKeys(emai);
	}
	public void password(String pass) {
		passwo.sendKeys(pass);
	}
	
	public void firname(String name) {
		fname.sendKeys(name);
	}
	public void confimpass(String num) {
		confmpass.sendKeys(num);
	}
	
	public void biogr(String info) {
		bio.sendKeys(info);
	}
	
  public void submit() {
	   submit.click();
  }
  public void back() {
	  driver.navigate().back();
  }
		public WebElement pp() {
			return passwo;
		}
	}

	
	
	
	
	
			


package BDDCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver driver;
	
	
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "pass")
	WebElement pass;
    @FindBy(name = "login")
    WebElement log;
    @FindBy(id =   "alertexamples")
    WebElement check;
    @FindBy(css ="[href=\"/r.php?entry_point=login\"]")
    WebElement signup;
public LoginPage(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

public void emailss(String em) {
	email.sendKeys(em);
}
public void passwo(String passw) {
	pass.sendKeys(passw);
}
public void loginn() {
	log.click();
}
public void check() {
	check.click();
	
}
public void signn() {
	signup.click();
}
}
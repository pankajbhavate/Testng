package Bddcucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Tha;

public class StepDefn {
	
	WebDriver driver;
	public StepDefn() {
		Hooks h  = new Hooks();
	driver=	h.getdriver();
	}
	@When("user open the browser")
	public void user_open_the_browser() {
	  
	}
	@When("user go to the website {string}")
	public void user_go_to_the_website(String string) {
		driver.get(string);
	   
	}
	@When("user enter the credintials like name as {string}  lastname as {string} phone {string} email {string}")
	public void user_enter_the_credintials_like_name_as_lastname_as_phone_email(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("first_name")).sendKeys(string);
		  driver.findElement(By.name("last_name")).sendKeys(string2);
		  driver.findElement(By.name("user_email")).sendKeys(string3);
		  driver.findElement(By.name("phone_1665630575")).sendKeys(string4);
	}
	@When("user enter the credentials like {string}, {string}, {string}, {string}")
	public void user_enter_the_credentials_like(String string, String string2, String string3, String string4) {
		 driver.findElement(By.name("first_name")).sendKeys(string);
		  driver.findElement(By.name("last_name")).sendKeys(string2);
		  driver.findElement(By.name("user_email")).sendKeys(string3);
		  driver.findElement(By.name("phone_1665630575")).sendKeys(string4);
			
	    
	}

	    
	

	
	@Then("user go to homepage")
	public void user_go_to_homepage() {
	  
	}
	    
	
}

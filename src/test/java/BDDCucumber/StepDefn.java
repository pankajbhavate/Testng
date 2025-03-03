package BDDCucumber;

import org.apache.poi.xssf.usermodel.TextHorizontalOverflow;
import org.checkerframework.checker.fenum.qual.SwingHorizontalOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.HookTestStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefn  {
  
	LoginPage page;
	  WebDriver driver;
	
	public StepDefn() {

		Hooks  hh = new Hooks();
		driver = hh.getdriver();
		page = new LoginPage(driver);
		
	}
	@When("User launch {string}")
	public void user_launch(String url) {
	 
		driver.get(url);
	  
	}

	@And("user enter email as {string} and passwors {string}")
	public void user_enter_email_as_and_passwors(String string, String string2) {
		
	    page.emailss(string);
	    page.passwo(string2);
	}

	@When("click login button")
	public void click_login_button() {
	    page.loginn();
	}

	@Then("open they arrive the home page.")
	public void open_they_arrive_the_home_page() {
	   
	}
	@When("user reach to the home page")
	public void user_reach_to_the_home_page() {
	   
	}

	@When("user reach to the home page and log {string}")
	public void user_reach_to_the_home_page_and_log(String string) {
	  driver.get(string);
	 
	}
	@When("user are click signup button")
	public void user_are_click_signup_button() {
		 page.signn();
	}





}

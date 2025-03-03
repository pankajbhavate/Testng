package Bddcucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Tha;

public class StepDef2 {
	
	WebDriver driver;
	Hooks h;
	
	public StepDef2() {
		h = new Hooks();
	driver=	h.getdriver();
	}
	
	@When("user click the home buttton in url {string}")
	public void user_click_the_home_buttton_in_url(String string) {
		driver.get(string);
		
		driver.findElement(By.xpath("//span[text()=\"Home\"]")).click();
	}



	@Then("user go to the home page")
	public void user_go_to_the_home_page() {
	    	}

	@Then("open the search box and user enter the desired atom in the search box contain {string}")
	public void open_the_search_box_and_user_enter_the_desired_atom_in_the_search_box_contain(String string) {
		driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys(string);
	   
	}

}

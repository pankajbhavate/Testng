package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practise {
	
	WebDriver driver;
	 
	@BeforeMethod
	public void set() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test(dataProvider = "exdata")
	public void t1(String fn,String ln,String email,String tel,String pass) throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Register.html");
	driver.findElement(By.cssSelector("[placeholder=\"First Name\"]")).sendKeys(fn);
	driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]")).sendKeys(ln);
	//driver.findElement(By.cssSelector("[placeholder=\\\"Last Name\\\"]")).sendKeys(ss);
			
	
	Thread.sleep(2000);
	
	
	
		driver.findElement(By.cssSelector("[type=\"email\"]")).sendKeys(email);
		driver.findElement(By.cssSelector("[type=\"tel\"]")).sendKeys(tel);
	
	Thread.sleep(3000);
	
	

		driver.findElement(By.cssSelector("[value=\"Male\"]")).click();
		driver.findElement(By.cssSelector("[id=\"firstpassword\"]")).sendKeys(pass);
		
	}
	@AfterMethod
	public void down() {
		driver.close();
	}
	
	@DataProvider(name = "exdata")
	public String[][] data() {
		String s [][] =  new String[3][5];
		s[0][0] =  "pankaj";
		s[0][1]  = "bhavate";
		s[0][2]  = "psbahhahahah.m";
		s[0][3]  = "99494949";
		s[0][4]  = "33333";
		
		
		
		s[1][0] =  "sumit";
		s[1][1]  = "kale";
		s[1][2]  = "psbahhahahah.m";
		s[1][3]  = "99494949";
		s[1][4]  = "33333";
	
		
		s[2][0] =  "digambar";
		s[2][1]  = "kumar";
		s[2][2]  = "sjssjsbahhahahah.m";
		s[2][3]  = "99494949";
		s[2][4]  = "33333";
		
		return s;
	
		
		
		
		
		
		
	}
	
	

}

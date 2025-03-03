package PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Dataprovider.Propertiesfi;

public class Testclass extends Baseclass {
	
    
	public Testclass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	// TODO Auto-generated constructor stub
	
     Propertiesfi p =new Propertiesfi();
	@Test(dataProvider = "data")
	public void test(String fna,String lna,String email,String confpass,String bio,String pass,String username) throws InterruptedException, IOException {
		Basepage b = new Basepage(driver);
		
		   log.info("finally test is started");
			
		b.firname(fna);
		Thread.sleep(2000);
		b.lname(lna);
		Thread.sleep(2000);
		b.emailid(email);
		Thread.sleep(2000);
		b.password(pass);
		Thread.sleep(2000);
		 WebElement pps =	b.pp();
		b.confimpass(confpass);
		Thread.sleep(2000);
		b.biogr(bio);
		Thread.sleep(2000);
		b.username(username);
		Thread.sleep(2000);
		
		b.submit();
		log.info("submit the form");
	
		//b.back();
		
		
	}
	@DataProvider(name = "data")
	public Object[][] data() throws IOException {
		String path ="C:\\Users\\DELL\\Documents\\pan.xlsx";
		Excelutility e = new Excelutility(path);
		int row =    e.getrowcount("Sheet1");                          // ‪C:\Users\DELL\Documents\pan.xlsx
		  int col =            e.cellcount("Sheet1", 1);
		  Object ob [][] = new Object[row][col];
		  for(int r=1;r<=row;r++) {
			  for(int j=0;j<col;j++) {
			ob[r-1][j]=	      e.getceldata("Sheet1", r,j);
			  
			  }}  
			return ob;	  
			  
}}
		  

	
		
		
				
	
	



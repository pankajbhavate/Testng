package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {
	
	
	@Test(dataProvider = "exdata")
	public void t1(String name,int age) {
		System.out.println("your name is "+name+""+" ,"+"your age is"+" "+age);
		
	}
	
	@DataProvider(name = "exdata")
	public Object[][] data() {
		Object [][]ob = new Object[3][2];
		ob[0][0]= "pankaj";
		ob[0][1] = 12;
		ob[1][0]= "sham";
		ob[1][1] = 24;
		ob[2][0] = "gangu";
		ob[2][1] =  34;
		return ob;
		
		
				
		
		  
		  
				   
		     
				
		                             
		
	}

}

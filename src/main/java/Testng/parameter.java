package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
              
public class parameter {
	
	
	@Parameters({"a","b"})
	@Test
	public void t1(int a,int b) {
		System.out.println(a+b);
	}
	@Parameters({"a","b"})
	
	@Test
	public void t2(int a,int b) {
		System.out.println(a-b);
	}
	@Parameters({"a","b"})
	
	@Test
	public void t3(int a,int b) {
		System.out.println(a/b);
	}

}

package Testngfeatures;

import org.testng.annotations.Test;

public class priority1 {

	
	
	@Test(priority = 0)
	public void t() {
		System.out.println("hey im a t");
	}
	@Test(priority = 1)
	public void t1() {
		System.out.println("not  a tea");
	}
	@Test(priority = 2)
	public void t2() {
		System.out.println("hey pankaj");
	}
}

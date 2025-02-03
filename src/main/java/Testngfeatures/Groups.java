package Testngfeatures;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("program1");
	}
	@Test(groups = "regression")
	public void test2() {
		System.out.println("program2");
	}
	@Test(groups = "smoke")
	public void test3() {
		System.out.println("program3");
	}
	@Test(groups = "regression")
	public void test4() {
		System.out.println("program4");
	}
	

}

package Testngfeatures;

import org.testng.annotations.Test;

public class enabledtest {
	
	@Test()
	public void open() {
	  System.out.println("kk");
	}
	@Test(enabled= true,priority = 1)
	public void raj() {
		System.out.println("ll");
	}
	@Test(priority = 0)
	public void anannd() {
		System.out.println("pankaj");
	}

}

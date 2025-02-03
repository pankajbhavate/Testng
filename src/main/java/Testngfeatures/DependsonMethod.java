package Testngfeatures;

import java.awt.event.InvocationEvent;

import org.testng.annotations.Test;

public class DependsonMethod {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void ss() {
		System.out.println(10/0);
	}
	@Test(invocationCount = 100)
	public void dd() {
		System.out.println("hjh");
	}

}

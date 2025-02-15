package Testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanlyzer implements IRetryAnalyzer {

	int retrycount = 0;
	int maxRetryCount = 2;
	
	public boolean retry(ITestResult result) {
		
		if(retrycount<maxRetryCount) {
			retrycount++;
			System.out.println(result.getName() );
		
			return true;  //Retry the test
		}
		
		return false;  //do not retry further
	}
}
	
	
	



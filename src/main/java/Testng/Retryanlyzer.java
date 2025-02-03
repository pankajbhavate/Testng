package Testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanlyzer implements IRetryAnalyzer {
	int retrycount=0;
	int maxretrycount=4;
	

	@Override
	public boolean retry(ITestResult result) {
  if(retrycount<maxretrycount) {
	  retrycount++;
	  System.out.println("test case passe"+result.getName());
	  return true;
  }
		return false;
	}
	
	
	

}

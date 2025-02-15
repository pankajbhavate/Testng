package Testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;
  
  public class Testlistner implements ITestListener{
	  
	  public void onteststart(ITestResult result) {
		  System.out.println(result.getName());
	  }
	  public void ontestsucess(ITestResult result) {
		  System.out.println(result.getName());
	  }
	  public void ontestfailure(ITestResult result) {
		  System.out.println(result.getName());
	  }
	  public void ontestskipped(ITestResult result) {
		  System.out.println(result.getName());
	  }
	  
}

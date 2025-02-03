package Testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;
  
  public class Retrylistner implements IAnnotationTransformer{
	  public void transform(ITestAnnotation annotation,Class testclass,Constructor testconst,Method testmethod) {
		  annotation.setRetryAnalyzer(Retryanlyzer.class);
	  }
   
	
	
	

}

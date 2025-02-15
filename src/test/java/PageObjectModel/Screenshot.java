package PageObjectModel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {
	Screenshot(WebDriver driver){
		this.driver= driver;
	}
	//‪C:\Users\DELL\Pictures
	
	
	WebDriver driver;
	
	
	public void screenshot(WebElement el) throws IOException {
		TakesScreenshot tt = ((TakesScreenshot)el);
		  File f =    tt.getScreenshotAs(OutputType.FILE);
		  File dest = new File("C:\\Users\\DELL\\Pictures\\pa.jpg");
		  FileUtils.copyFile(f, dest);
}}

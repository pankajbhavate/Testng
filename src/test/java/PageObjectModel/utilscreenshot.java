package PageObjectModel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utilscreenshot {
	public static WebDriver driver;
	public static   String getScreenshotAs(String TestCasename,WebDriver driver) throws IOException {
		
	
		
		

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		String Name = "- Screenshot -" + Timestamp;

		Path resourceDirectory = Paths.get("src", "test", "resources");

		String AbsolutePath = resourceDirectory.toFile().getAbsolutePath();

		String Destination = AbsolutePath + "/Screenshots/" + Name + ".png";

		FileUtils.copyFile(source, new File(Destination));

		return Destination;
	
  

}}



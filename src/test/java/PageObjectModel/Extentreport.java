package PageObjectModel;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreport {
	
	public static  ExtentSparkReporter sparkReporter;

	

	static ExtentReports extent;
	public static ExtentReports getReportObject() {
	String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	String name = "ExtentReport --" + timestamp;
	Path resourceDirectory = Paths.get("src", "test", "resources");
	String absolutePath = resourceDirectory.toFile().getAbsolutePath();
	String reportPath = absolutePath + "/reports/" + name + ".html";
     sparkReporter= new ExtentSparkReporter(reportPath);
	 sparkReporter.config().setReportName("Data Provider");
	 sparkReporter.config().setDocumentTitle("Data Test");
	 sparkReporter.config().setTheme(Theme.DARK);
	 extent = new ExtentReports();
	 extent.attachReporter(sparkReporter);
	 
			 
	// Adding system and environment info
	extent.setSystemInfo("Name", "Pankaj Bhavate");
	extent.setSystemInfo("Suite Name", "Regression");
	extent.setSystemInfo("OS", System.getProperty("os.name"));
	extent.setSystemInfo("OS Version", System.getProperty("os.version"));
	extent.setSystemInfo("Java Version", System.getProperty("java.version"));
	extent.setSystemInfo("User Timezone", System.getProperty("user.timezone"));
	extent.setSystemInfo("Machine Name", System.getenv("COMPUTERNAME"));
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("Browser", "Chrome 112");
	extent.setSystemInfo("Build Version", "v1.2.3");
	extent.setSystemInfo("Branch Name", "feature/login-tests");
	;
	return extent;}
	
}
	
	



package BDDCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v128.page.Page;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features = "C:\\Users\\DELL\\git\\Testng\\src\\test\\resources\\Features\\Login.feature",
		glue = "BDDCucumber",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:Features/bdd.html"})

public class Runnerclass extends AbstractTestNGCucumberTests {
	
}

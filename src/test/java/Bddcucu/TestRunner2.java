package Bddcucu;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		    features = "C:\\Users\\DELL\\git\\Testng\\src\\test\\resources\\Features\\reg.feature",
		    glue = "Bddcucu",
		    dryRun = false,
		    monochrome = false,
		    plugin = {"pretty","html:Features//pankaj.html"}
		)







public class TestRunner2 extends AbstractTestNGCucumberTests {
	
	
	

}

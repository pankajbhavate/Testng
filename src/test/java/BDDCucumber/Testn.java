package BDDCucumber;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
public class Testn   {
	LoginPage p;
	   WebDriver driver;
    @Test
    public void testLogin() {
    	drivermanager d =new drivermanager();
       driver= d.getDriver();
        p=new LoginPage(driver);
       p.check();
    }

}

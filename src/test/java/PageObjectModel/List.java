package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class List {
 
	WebDriver driver;
	public List(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void list(WebElement w,String val) {
//	WebElement w= 	driver.findElement(By.xpath("//select[@data-id=\"country_1665629257\"]"));
	Select s = new Select(w);
	  java.util.List<WebElement>  list = s.getOptions();
	                int m=     list.size();
	   for(int i=0;i<m;i++) {
		     String t =    list.get(i).getText();
		   
		    //System.out.println(t);
		    WebDriverWait ti = new WebDriverWait(driver, Duration.ofSeconds(20));
		      ti.until(ExpectedConditions.visibilityOf(w));
		    		  s.selectByVisibleText(val);
		     //  list.get(9).click();
		   
	   }
	}
}

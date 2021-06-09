package driverSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {	
	   /**members of the same class,subclasses and classses 
	    * from same package have access, protected member 
	    * is not accessible to classes form other package
	    */
	   /**
	    * for setup code check: 
	    * https://www.codota.com/code/java/classes/io.github
	    * .bonigarcia.wdm.WebDriverManager
	    */
		
		protected static WebDriver driver;
		
		@BeforeMethod
		public void driverSetup() {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
		}
		
		
		@AfterClass
		public void tearDown() {
			if (driver != null) {
	            driver.quit();
			}
		}
	}
	

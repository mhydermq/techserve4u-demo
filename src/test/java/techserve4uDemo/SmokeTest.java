package techserve4uDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverSetUp.DriverSetUp;

public class SmokeTest extends DriverSetUp{
	private String Url = "http://demo-ecommerce.techserve4u.com/";
	
	@Test
	public void testPageTitle() {
		driver.get(Url);
		System.out.println("page title is: "+driver.getTitle());
		String expectedTitle="Ecommerce Website";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
}

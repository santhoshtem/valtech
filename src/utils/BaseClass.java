package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver = new FirefoxDriver();	
		// Navigate to site
		driver.get("http://www.valtech.com");
		Reporter.log("Started test...", true);
	}
	
	@AfterMethod
	public void testCleanup()
	{
		driver.quit();	
		Reporter.log("Ended test...", true);
	}
}

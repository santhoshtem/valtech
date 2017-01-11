package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage {

	WebDriver driver;
	
	By LatestNewsText = By.xpath(".//*[@id='container']/div[2]/div[3]/div[1]/header/h2");
	By HomePageLink = By.xpath(".//*[@id='wrapper']/header/div/a/i");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void NavigateToHomePage()
	{
		driver.findElement(HomePageLink).click();
	}
	
	
	public void CheckLatestNewsTextAppears()
	{
		// Check H1 header
		Assert.assertEquals(driver.findElement(LatestNewsText).getText(), "LATEST NEWS");
		Reporter.log("Asserted Latest News", true);
	}
	
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ServicesPage {
	
	WebDriver driver;
		
	By ServicesText = By.xpath(".//*[@id='container']/section/header/h1");
	By ServicesLink = By.xpath(".//*[@id='navigationMenuWrapper']/div/ul/li[2]/a/span");
	
	public ServicesPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void NavigateToServices()
	{
		driver.findElement(ServicesLink).click();
	}
	
	
	public void CheckServicesTextHeaderText()
	{
		// Check H1 header
		Assert.assertEquals("Services", driver.findElement(ServicesText).getText());
	}
	

}

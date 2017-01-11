package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CareersPage {

	WebDriver driver;
	
	By CareersText = By.xpath(".//*[@id='container']/div[1]/h1");
	By CareersLink = By.xpath(".//*[@id='navigationMenuWrapper']/div/ul/li[5]/a/span");
	
	public CareersPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void NavigateToCareers()
	{
		driver.findElement(CareersLink).click();
	}

	
	public void CheckCareerHeaderText()
	{
		// Check H1 header
		Assert.assertEquals("Careers", driver.findElement(CareersText).getText());
	}
	
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class WorkPage {

	WebDriver driver;
	
	By WorkText = By.xpath(".//*[@id='container']/header/h1");
	By CasesLink = By.xpath(".//*[@id='navigationMenuWrapper']/div/ul/li[1]/a/span");
	
	public WorkPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void NavigateToCases()
	{
		driver.findElement(CasesLink).click();
	}
	
	public void CheckWorkTextHeaderText()
	{
		// Check H1 header
		Assert.assertEquals("Work", driver.findElement(WorkText).getText());
		Reporter.log("Completed Assert of Work Header text", true);
	}
	
	
}

package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ContactPage {

	WebDriver driver;
	
	By WorkText = By.xpath(".//*[@id='container']/header/h1");
	By ContactPageLink = By.xpath(".//*[@id='contacticon']/div/div/div[1]/i");

	
	public ContactPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void NavigateToContactPageLink()
	{
		driver.findElement(ContactPageLink).click();
	}

	// Getting the offices count
	public void GetOfficesCount()
	{

		List<WebElement> linksize = driver.findElements(By.tagName("a"));
		int linksCount = linksize.size();
		
		for(int i=0;i<linksCount;i++)
		{
		String link1 = linksize.get(i).getText();
			
		System.out.println(link1);

		} 
		
	}
	

}

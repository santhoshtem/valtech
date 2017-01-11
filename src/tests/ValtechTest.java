package tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CareersPage;
import pages.ContactPage;
import pages.HomePage;
import pages.ServicesPage;
import pages.WorkPage;
import utils.BaseClass;


public class ValtechTest extends BaseClass {

		
	@Test
	public void ValtechTestRun()
	{
		
		HomePage Homepage = new HomePage(driver);
		Homepage.CheckLatestNewsTextAppears();
		
		WorkPage WorkPage = new WorkPage(driver);
		WorkPage.NavigateToCases();
		WorkPage.CheckWorkTextHeaderText();
		
		ServicesPage ServicesPage = new ServicesPage(driver);
		ServicesPage.NavigateToServices();
		ServicesPage.CheckServicesTextHeaderText();
				
		CareersPage CareersPage = new CareersPage(driver);
		CareersPage.NavigateToCareers();
		CareersPage.CheckCareerHeaderText();
		
		ContactPage ContactPage = new ContactPage(driver);
		ContactPage.NavigateToContactPageLink();
		
		ContactPage.GetOfficesCount();
		
	}
	
}


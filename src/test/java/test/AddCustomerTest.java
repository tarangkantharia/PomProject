package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
@Test	
	public void valiCustomerShouldBeAbleToCreateCustomer() throws InterruptedException {
	 
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
		loginPage.login("demo@techfios.com", "abc123");
		
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage("Dashboard");
		dashboardPage.clickOnAddCustomer();
		dashboardPage.clickOnAddCustomer();
		
		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.verifyAddContactPage("Add contact");
		addCustomer.insertFullname("Selenium");
		addCustomer.selectCompany("Techfios");
		
		addCustomer.selectCountry("Albania");
	}

}

package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
WebDriver driver ;
	
	public AddCustomerPage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH , using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement ADD_CONTACT_HEADER_ELEMENT; 
	@FindBy(how=How.XPATH , using="//*[@id=\"account\"]")WebElement FULLNAME_ELEMENT;
	@FindBy(how=How.XPATH , using="//*[@id=\"cid\"]")WebElement COMPANY_ELEMENT;
	@FindBy(how=How.XPATH , using="//*[@id=\"email\"]")WebElement EMAIL_ELEMENT;
	@FindBy(how=How.XPATH , using = "//*[@id=\"country\"]")WebElement COUNTRY_ELEMENT;
	public void verifyAddContactPage(String addContactHeaderText) {
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), addContactHeaderText);
	}
	
	public void insertFullname(String fullname) {
		
		FULLNAME_ELEMENT.sendKeys(fullname + generateRandomNum(9999));
		//Added generatedRandomNum afterward
	}
	
		
	public void selectCompany(String company) {
		selectFromDropdown(COMPANY_ELEMENT, company);
	}
	
	public void selectCountry (String country) {
		selectFromDropdown(COUNTRY_ELEMENT, country);
	}
	
}

package com.crm.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.model.Test;
import com.crm.qa.Base.TestBase;
import com.crm.qa.Pages.ContactPage;
import com.crm.qa.Pages.HomePage;
import com.crm.qa.Pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactPage contactPage;
	

	
	public ContactsPageTest() {
		// TODO Auto-generated constructor stub
		
		super();
	}
	
	
	@BeforeMethod
	
	public void setUp()
	{
		initialization();
		testUtil= new TestUtil();
		contactPage = new ContactPage();
		loginPage = new LoginPage();
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		contactPage=homePage.clickOnContactsLink();
		}
	
	@Test(priority=1)
	public void  verifyContactsLabel()
	{
		Assert.assertTrue(contactPage.verifyContactsLabel(),"contacts label is missing on the page");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

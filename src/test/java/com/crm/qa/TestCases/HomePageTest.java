package com.crm.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.Base.TestBase;
import com.crm.qa.Pages.ContactPage;
import com.crm.qa.Pages.HomePage;
import com.crm.qa.Pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage = new HomePage();
	TestUtil testutil;
	ContactPage contactpage;
	
	public HomePageTest() {
		// TODO Auto-generated constructor stub
		
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		testutil = new TestUtil();
		loginpage = new LoginPage();
		contactpage = new ContactPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String homePageTitle=homePage.verifyHomePageTitle();
		
		Assert.assertEquals(homePageTitle, "Cogmento CRM");
		
	}
	
	@Test(priority=2)
	public void verifyUserNameTest()
	{
		testutil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void verifyContactsLinkTest()
	{
		testutil.switchToFrame();
		contactpage=homePage.clickOnContactsLink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	

}

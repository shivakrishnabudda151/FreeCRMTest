package com.crm.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.Base.TestBase;
import com.crm.qa.Pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	
	public LoginPageTest() {
		// TODO Auto-generated constructor stub
	super();
	
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		lp =new LoginPage();
		
	}
	
	
	@Test(priority=1)
	public void  loginPageTitleTest()
	{
		String title=lp.validateLoginPageTitle();
		Assert.assertEquals(title, "ltitle");
	}
	
	@Test(priority=2)
	public void crmLoginImgTest()
	{
		boolean flag = lp.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
	
	

}

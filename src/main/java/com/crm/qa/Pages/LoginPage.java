package com.crm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory -ObjectRepository-OR
	
	@FindBy(name="email")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Login')][1]")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	//Initializing the page objects
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean  validateCRMImage()
	{
		return crmLogo.isDisplayed();
	}
	public HomePage login(String un,String pwd)
	{
		username.sendKeys("shivakrishnabudda@gmail.com");
		password.sendKeys("Shiva143#");
		loginBtn.click();
		return new HomePage();
		
		
	}
	

}

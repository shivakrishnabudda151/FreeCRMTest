package com.crm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.Base.TestBase;

public class ContactPage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	
	//Initializing the Page Objects
	
	
public ContactPage() {
	// TODO Auto-generated constructor stub
	
	
	PageFactory.initElements(driver, this);
}

public boolean verifyContactsLabel()
{
	return contactsLabel.isDisplayed();
}
	
	

}

package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Pagefactory OR 
	@FindBy(name = "username")
	WebElement Username;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Loginbtn;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement SignupBtn;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement CRMLogo;
	
	//Intilize the  Page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//Action
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean ValidateCRMImage() {
		return CRMLogo.isDisplayed();
	}
	
	public HomePage Login() throws InterruptedException {
		
		Username.sendKeys(prop.getProperty("username"));
		Password.sendKeys(prop.getProperty("password"));
		Loginbtn.click();
		 Thread.sleep(3000);
		 return new HomePage();
		
		
		
	}
	
	
	
	
	
	
	
	
	
}



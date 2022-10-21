package com.qa.testcases;




import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage login;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		Intilization();
		login = new LoginPage();
		
	}
	
	@Test()
	public void LoginPageTitleTest() {
		String title = login.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test()
	public void crmLoginTest() {
		boolean flag =login.ValidateCRMImage();
		Assert.assertTrue(flag);
	}
	@Test()
	public void LoginTest() throws InterruptedException {
		homepage =login.Login();
	}
	
	@AfterMethod
	
	public void Teardown() {
		driver.close();
	}

}

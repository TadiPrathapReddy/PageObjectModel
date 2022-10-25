package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	

	//Pagefactory OR 
	@FindBy(xpath = "//a[contains(text(),'Home')]")
		WebElement HomeTab;
		
		
		
		//Intilize the  Page objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		//Action
		public void validateHomePageTitle() {
			HomeTab.click();
			System.out.println("Home page Tab is displyed");
			
			
		}
		
		
		
		
}

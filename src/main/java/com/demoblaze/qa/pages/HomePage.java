package com.demoblaze.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//PageFactory - OR(Object Repository)
	@FindBy(id = "login2")
	WebElement loginLink;
	
	@FindBy(id = "signin2")
	WebElement signUpLink;
	
	@FindBy(id = "nava")
	WebElement logo;
	
	//Initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this); //All page objects will be initialized in this constructor
	}
	
	//Actions
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateImage() {
		return logo.isDisplayed();
	}

	public boolean validateLoginLink() {
		return loginLink.isDisplayed();
	}
	
	public void loginClick() {
		loginLink.click();
	}
	public boolean validateSignUpLink() {
		return signUpLink.isDisplayed();
	}
	
	public void signUpClick() {
		signUpLink.click();
	}
	
}

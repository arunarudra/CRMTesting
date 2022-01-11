package com.demoblaze.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demoblaze.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement loginBtn;
	
	public LoginPage() {
	
	}
	
	/*
	 * public HomePage login(String un, String pw) { username.sendKeys(un);
	 * password.sendKeys(pw);
	 * 
	 * 
	 * return new HomePage(); }
	 */

}

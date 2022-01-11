package com.inetBanking.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetBanking.Testcases.BaseClass;


public class loginPage extends BaseClass{
	
	//Page Factory - Object repository
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "btnLogin")
	WebElement loginBtn;
	
	@FindBy(name = "btnReset")
	WebElement resetBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Log out']")
	WebElement	logout;
	
// initialize all page objects
	
public loginPage() {
	PageFactory.initElements(driver, this);
}

//write all action classes

public void setUserName(String uname) {
	username.sendKeys(uname);
}

public void setPassword(String pwd) {
	password.sendKeys(pwd);
}

public void clickSubmit() {
	loginBtn.click();
}

public void clickReset() {
	resetBtn.click();
	}

public void clickLogout() {
	logout.click();
	}
}

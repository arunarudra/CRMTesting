package com.demoblaze.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoblaze.qa.base.TestBase;
import com.demoblaze.qa.pages.SignUpPage;
import com.demoblaze.qa.utils.AllUtils;
import com.demoblaze.qa.pages.HomePage;


public class SignUpPageTest extends TestBase {
	SignUpPage signUpPage;
	HomePage homepage;
	AllUtils utils;

public SignUpPageTest() {
	super();
	
}

	@BeforeMethod()
	public void signUpPageSetup() {
		Initialize();
		signUpPage = new SignUpPage();
		homepage = new HomePage();
		utils = new AllUtils();
	}
	
	@Test
	public void SignUpTest() throws Exception {
		homepage.signUpClick();
		signUpPage.NewUserSignUp();
		Thread.sleep(2000);
		String text = utils.handlePopups();
		System.out.println(text);
		assertEquals(text, "Sign up successful.");
			utils.alert.accept();
				
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

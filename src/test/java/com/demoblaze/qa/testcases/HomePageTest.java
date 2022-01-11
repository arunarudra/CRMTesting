package com.demoblaze.qa.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//import org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.demoblaze.qa.base.TestBase;
import com.demoblaze.qa.pages.HomePage;

import net.jodah.failsafe.internal.util.Assert;

public class HomePageTest extends TestBase{
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		Initialize();
	homePage = new HomePage();
	
		
	}
	
	@Test
	public void homePageTitleTest() {
		String title =homePage.validateHomePageTitle();
		assertEquals(title, "STORE");
		
	}
	
	@Test
	public void imageValidateTest() {
		boolean imgvalid = homePage.validateImage();
		assertTrue(imgvalid);
	}
	
	/*
	 * @Test public void loginTest() { loginPage =
	 * homePage.login(prop.getProperty("username"),prop.getProperty("password")); }
	 */
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
}

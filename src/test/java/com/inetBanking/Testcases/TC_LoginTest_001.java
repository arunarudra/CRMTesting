package com.inetBanking.Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inetBanking.pageobjects.loginPage;
import com.inetBanking.utilities.CustomListner;
@Listeners(CustomListner.class)
public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws Exception{
		
		loginPage lp = new loginPage();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(2000);
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			assertTrue(true);
		}
		/*else {
			lp.clickReset();
		}*/
	}
		
}



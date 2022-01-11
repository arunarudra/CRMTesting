package com.inetBanking.Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageobjects.loginPage;
import com.inetBanking.utilities.XLUtils;

import net.jodah.failsafe.internal.util.Assert;

public class TC_LoginDDT_002 extends BaseClass {
	
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) {
		loginPage lp = new loginPage();
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clickSubmit();
		
		if (isAlertPresent() == true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			assertTrue(false);
		}
		else
		{
			assertTrue(true);
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
		
	}
	
	
	public boolean isAlertPresent() //user defined method to check Alert. Can be transferred to base class when needed
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}catch(NoAlertPresentException e) {
			return false;
		}
		
	}
	
	@DataProvider(name="LoginData")
	public Object[][] getData() throws Exception{
		
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\com\\inetBanking\\testData\\Logindata.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		Object loginData[][]= new Object[rownum][colcount];
		for (int i=1; i<=rownum; i++) {
			for(int j=0;j<colcount;j++) {
				loginData[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				
			}
		}
		
		return loginData;
	}

}

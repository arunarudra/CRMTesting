package com.inetBanking.Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageobjects.AddNewCustomer;
import com.inetBanking.pageobjects.loginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_AddNewCustomerTest_003 extends BaseClass {
	
	@Test(dataProvider ="CustomerData" )
	public void addNewCustomer(String cname, String cgender, String cdob, String caddr,
			String ccity, String cstate, String cpin, String cphone, String cemail) throws Exception
		 {
		loginPage lp = new loginPage();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		AddNewCustomer addcust = new AddNewCustomer();
		addcust.clickAddNewCustomer();
		addcust.custName(cname);
		addcust.custGender(cgender);
		addcust.custdob(cdob);
		addcust.custaddr(caddr);
		addcust.custcity(ccity);
		addcust.custstate(cstate);
		addcust.custpin(cpin);
		addcust.custtelephone(cphone);
		addcust.custemail(cemail);
		Thread.sleep(2000);
		addcust.clickSubmit();
		
		
	}

	
	@DataProvider(name="CustomerData")
	public Object[][] getData() throws Exception{
		
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\com\\inetBanking\\testData\\customerdetails.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		Object custdata[][]= new Object[rownum][colcount];
		for (int i=1; i<=rownum; i++) {
			for(int j=0;j<colcount;j++) {
				custdata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				
			}
		}
		
		return custdata;
	}
}

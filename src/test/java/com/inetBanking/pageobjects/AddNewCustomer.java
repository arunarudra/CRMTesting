package com.inetBanking.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetBanking.Testcases.BaseClass;

public class AddNewCustomer extends BaseClass {
	
	//Page factory - Object repository
	
	@FindBy(xpath = "//a[normalize-space()='New Customer']")
	@CacheLookup
	WebElement newcustlink;
	
	@FindBy(name = "name")
	@CacheLookup
	WebElement custname;
	
	@FindBy(xpath = "//tbody/tr[5]/td[2]/input[1]")
	@CacheLookup
	WebElement rdgender;
	
	@FindBy(name = "dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(name = "addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(name = "city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(name = "state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(name = "pinno")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(name = "telephoneno")
	@CacheLookup
	WebElement txtphoneno;
	
	@FindBy(name = "emailid")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(name = "sub")
	@CacheLookup
	WebElement subbtn;
	
	// initialize all page objects
	
	public AddNewCustomer()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Write all action classes
	
	public void clickAddNewCustomer()
	{
		newcustlink.click();
	}
	
	public void custName(String cname)
	{
		custname.sendKeys(cname);
	}
	
	public void custGender(String cgender)
	{
		rdgender.click();
	}
	
	public void custdob(String dob)
	{
		txtdob.sendKeys(String.valueOf(dob));
		
		
	}
	
	public void custaddr(String caddr)
	{
		txtaddress.sendKeys(caddr);
		
	}
	
	public void custcity(String ccity)
	{
		txtcity.sendKeys(ccity);
		
	}
	
	public void custstate(String cstate)
	{
		txtstate.sendKeys(cstate);
	}
	
	public void custpin(String cpin)
	{
		txtpinno.sendKeys(String.valueOf(cpin));
	}
	
	public void custtelephone(String cphone)
	{
		txtphoneno.sendKeys(String.valueOf(cphone));
	}
	
	public void custemail(String cemail)
	{
		txtemail.sendKeys(cemail);
		
	}
	
	public void clickSubmit()
	{
		subbtn.click();
	}
}

package com.demoblaze.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.qa.base.TestBase;

public class SignUpPage extends TestBase{
	public static Alert alert;
	
	//Page Factory - Object repository
	
	@FindBy(id = "sign-username")
	WebElement uname;
	
	@FindBy(id = "sign-password")
	WebElement pwd;
	
	@FindBy(xpath = "//button[normalize-space()='Sign up']")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']")
	WebElement closeBtn;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void NewUserSignUp() throws Exception {
		uname.sendKeys("ar912");
		pwd.sendKeys("pa55word");
		Thread.sleep(2000);
		signUpBtn.click();

	}
	
	public void NewUserSignUpReset() {
		uname.sendKeys("aruna");
		pwd.sendKeys("pa55word");
		closeBtn.click();

	}
	
	
	/*  public String VerifySuccess() throws InterruptedException {
	  
	  
	  System.out.println(text);
	  if (text.equals("Sign up successful.") ) {
	  alert.accept(); Thread.sleep(2000); 
	  }else if (text.equals("This user already exist.")) { 
		  alert.accept();
	  driver.findElement(By.xpath(
	  "//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']"
	  )).click();
	  
	  }
	 
		
		return text;
    } */
	
}
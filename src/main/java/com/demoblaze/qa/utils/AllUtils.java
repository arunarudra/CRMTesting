package com.demoblaze.qa.utils;

import org.openqa.selenium.Alert;

import com.demoblaze.qa.base.TestBase;

public class AllUtils extends TestBase {
	public Alert alert;
	
	public String handlePopups() throws Exception {
		alert = driver.switchTo().alert();
		Thread.sleep(2000);
		return alert.getText();
	}
}

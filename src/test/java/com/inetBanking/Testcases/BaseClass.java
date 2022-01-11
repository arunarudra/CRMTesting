package com.inetBanking.Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUserName();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
public void setup(String br) {
		
		if (br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver = new ChromeDriver();
		}
		/*else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver = new ChromeDriver();
		}*/
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(baseURL);
	}

	@AfterClass
public void tearDown() {
		driver.quit();
}
	
public static void failed(String testMethod) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File trgtfile = new File(System.getProperty("user.dir")+"\\screenshots"+testMethod+".png");
		FileUtils.copyFile(srcfile, trgtfile);	
		System.out.println("screen shot taken");
		
	}

}

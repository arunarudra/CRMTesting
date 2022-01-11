package com.demoblaze.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		try {
		prop = new Properties();
		FileInputStream fip;
		
			fip = new FileInputStream("C:\\Users\\aruna\\eclipse-workspace\\CRMTesting\\src\\main\\java\\com\\demoblaze"
					+"\\qa\\config\\config.properties");
			prop.load(fip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void Initialize() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\aruna\\eclipse-workspace\\seleniumtraining\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(prop.getProperty("url"));
		}
		
	}
}

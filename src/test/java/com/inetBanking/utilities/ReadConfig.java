package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src = new File("./configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public String getApplicationURL() {
	String url = pro.getProperty("baseURL");
	return url;
	
}

public String getUserName() {
	String username = pro.getProperty("username");
	return username;
}

public String getPassword() {
	String pass = pro.getProperty("password");
	return pass;	
}

public String getChromePath() {
	String chromePath = pro.getProperty("chromepath");
	return chromePath;
	}
}

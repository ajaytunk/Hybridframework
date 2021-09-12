package com.hybridFrameWork.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigRead {
	
	public Properties prop;

	public ConfigRead() 
	{
		
		
		try {
			FileInputStream fis;
			fis = new FileInputStream("./config.properties");
			prop=new Properties();
			prop.load(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String browser()
	{
		String browser=prop.getProperty("browser");
		return browser;
	}
		
	
	public String getUrl()
	{
		String url=prop.getProperty("baseurl");
		return url;
	}
	
	
	public String getChrome()
	{
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getGecko()
	{
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	

}




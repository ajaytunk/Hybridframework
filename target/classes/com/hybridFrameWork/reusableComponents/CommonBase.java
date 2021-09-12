package com.hybridFrameWork.reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonBase {
public static WebDriver driver;
	
	public Properties prop;
	
	public WebDriver InitializeDriver() throws IOException{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\HybridFrameWork\\config.properties");
	    prop.load(fis);
	   String browserName= prop.getProperty("browser");
	   
	   if(browserName.equals("chrome"))
			   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			 driver=new ChromeDriver();
		   
			   }
	   else
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
			 driver=new FirefoxDriver();
	   }
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}


}

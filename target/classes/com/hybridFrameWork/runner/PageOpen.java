package com.hybridFrameWork.runner;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.hybridFrameWork.reusableComponents.CommonBase;

public class PageOpen extends CommonBase{
	@Test
	public void pageNavigation() throws IOException
	{
		driver= InitializeDriver();
		driver.get("https://www.amazon.com/dp/B07XJ8C8F5");
	}
	
	@AfterTest
	public void close()
	{
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.close();
		driver=null;
	}
	
	

}

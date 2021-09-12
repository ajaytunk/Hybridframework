package com.hybridFrameWork.runner;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.hybridFrameWork.reusableComponents.CommonBase;

import jdk.internal.org.jline.utils.Log;

public class TitlePrint extends CommonBase {

	
	@Test
	public void printtitle() throws IOException, InterruptedException
	{
		driver= InitializeDriver();
		driver.get("https://www.amazon.com/dp/B07XJ8C8F5");
		com.hybridFrameWork.pageObjects.LandingPage lp=new com.hybridFrameWork.pageObjects.LandingPage(driver);
		System.out.println(lp.title().getText());
		Thread.sleep(2000);
		lp.clicking().click();
		Log.info("title sucessfully printed");
	}
	@AfterTest
	public void close()
	{
		driver.close();
		driver=null;
	}
	

}

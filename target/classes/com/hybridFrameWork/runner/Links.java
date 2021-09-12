package com.hybridFrameWork.runner;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.hybridFrameWork.reusableComponents.CommonBase;

import jdk.internal.org.jline.utils.Log;



public class Links extends CommonBase{
	@Test
	public void link() throws IOException, InterruptedException
	{
		driver= InitializeDriver();
		driver.get("https://www.amazon.com/dp/B07XJ8C8F5");
		com.hybridFrameWork.pageObjects.LandingPage lp=new com.hybridFrameWork.pageObjects.LandingPage(driver);
		Thread.sleep(1000);
		System.out.println(lp.links().size());
		Log.info("No.of  links is sucessfully printed");
	}
	@AfterTest
	public void close()
	{
		driver.close();
		driver=null;
	}
	

}

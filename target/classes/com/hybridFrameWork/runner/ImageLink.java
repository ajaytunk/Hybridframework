package com.hybridFrameWork.runner;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.hybridFrameWork.reusableComponents.CommonBase;

import jdk.internal.org.jline.utils.Log;



public class ImageLink extends CommonBase {
	@Test
	public void imageLink() throws IOException, InterruptedException
	{
		driver= InitializeDriver();
		driver.get("https://www.amazon.com/dp/B07XJ8C8F5");
		com.hybridFrameWork.pageObjects.LandingPage lp=new com.hybridFrameWork.pageObjects.LandingPage(driver);
		System.out.println(lp.srclink().getAttribute("src"));
		Log.info("Image link is sucessfully printed");

}
	@AfterTest
	public void close()
	{
		driver.close();
		driver=null;
	}
	
}
